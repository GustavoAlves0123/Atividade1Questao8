    // Ajustes para contemplar o pilar de Encapsulamento em POO
    private int codigo;
    private String nome;
    private String cpf;
    private String endereco;

    public Cliente(int codigo, String nome, String cpf, String endereco) {
        setCodigo(codigo);
        setNome(nome);
        setCpf(cpf);
        setEndereco(endereco);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

