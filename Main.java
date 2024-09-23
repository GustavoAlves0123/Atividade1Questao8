    // Atributos privados
    private int codigo;
    private String modelo;
    private String marca;
    private List<Jogo> jogosInstalados;
    private Tela tela;
    private Processador processador;
    private Memoria memoria;

    // Métodos getters e setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public List<Jogo> getJogosInstalados() {
        return jogosInstalados;
    }

    public void setJogosInstalados(List<Jogo> jogosInstalados) {
        this.jogosInstalados = jogosInstalados;
    }

    public Tela getTela() {
        return tela;
    }

    public void setTela(Tela tela) {
        this.tela = tela;
    }

    public Processador getProcessador() {
        return processador;
    }

    public void setProcessador(Processador processador) {
        this.processador = processador;
    }

    public Memoria getMemoria() {
        return memoria;
    }

    public void setMemoria(Memoria memoria) {
        this.memoria = memoria;
    }
