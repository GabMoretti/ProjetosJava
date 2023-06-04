class Livro {
    private int idlivro;
    private String titulo;
    private Integer quantidadeEmprestimos;
    private String status;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getIdlivro() {
        return idlivro;
    }

    public void setIdlivro(int idlivro) {
        this.idlivro = idlivro;
    }

    public Integer getQuantidadeEmprestimos() {
        return quantidadeEmprestimos;
    }

    public void setQuantidadeEmprestimos(Integer quantidadeEmprestimos) {
        this.quantidadeEmprestimos = quantidadeEmprestimos;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void emprestar() {
        this.quantidadeEmprestimos += 1;
        this.status = "emprestado";
    }
}



