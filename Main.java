import java.util.Date;
import java.util.List;
import java.util.ArrayList;

class Banco {
    private String nome;
    private List<Conta> contas;
    
    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }
    
    public void criarConta(Conta conta) {
        contas.add(conta);
    }
    
    public void transferir(Conta contaOrigem, Conta contaDestino, double valor) {
        if (valor <= 0) {
            System.out.println("Valor de transferência inválido.");
            return;
        }

        if (contaOrigem.sacar(valor)) {
            contaDestino.depositar(valor);
            System.out.println("Transferência de R$" + valor + " realizada com sucesso.");
        } else {
            System.out.println("Transferência não realizada. Saldo insuficiente.");
        }
    }
}

class Conta {
    private int codigo;
    private Cliente cliente;
    private double saldo;
    private Date dataCriacao;
    
    public Conta(Cliente cliente) {
        this.cliente = cliente;
        this.saldo = 0.0;
        this.dataCriacao = new Date();
    }
    
    public boolean sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente");
            return false;
        } else {
            saldo -= valor;
            return true;
        }
    }
    
    public void depositar(double valor) {
        saldo += valor;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public Date getDataCriacao() {
        return dataCriacao;
    }
}

class Cliente {
    private int codigo;
    private String nome;
    private String cpf;
    private String endereco;
    
    public Cliente(int codigo, String nome, String cpf, String endereco) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }
    
    public void imprimirConta(Conta conta) {
        System.out.println("Conta do cliente " + nome + " - Código: " + codigo);
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("Data de criação: " + conta.getDataCriacao());
    }
}

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco Inter");
        Cliente cliente1 = new Cliente(1, "Gustavo", "123456", "Rua 1, Bairro Tal - Cidade X");
        Cliente cliente2 = new Cliente(2, "Helena", "789456", "Rua 2, Bairro Isso - Cidade Y");
        Conta conta1 = new Conta(cliente1);
        Conta conta2 = new Conta(cliente2);
        banco.criarConta(conta1);
        banco.criarConta(conta2);
        conta1.depositar(1000);
        conta2.depositar(500);
        System.out.println("Saldo da conta 1: " + conta1.getSaldo());
        System.out.println("Saldo da conta 2: " + conta2.getSaldo());
        banco.transferir(conta1, conta2, 500);
        System.out.println("Saldo da conta 1: " + conta1.getSaldo());
        System.out.println("Saldo da conta 2: " + conta2.getSaldo());
    }
}