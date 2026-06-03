package model;

public class Armazem {
    private int idArmazem;
    private String nome;
    private String endereco;
    private String situacao;

    public void cadastrar() { }
    public void selecionarOrigem() { }
    public void selecionarDestino() { }
    public void listar() { }

    // Getters e Setters
    public int getIdArmazem() { return idArmazem; }
    public void setIdArmazem(int idArmazem) { this.idArmazem = idArmazem; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
    public String getSituacao() { return situacao; }
    public void setSituacao(String situacao) { this.situacao = situacao; }
}