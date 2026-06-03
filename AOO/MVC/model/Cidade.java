package model;

public class Cidade {
    private int idCidade;
    private String nome;
    private String estado;
    private String situacao;

    public void cadastrar() { }
    public void selecionar() { }
    public void listar() { }

    // Getters e Setters
    public int getIdCidade() { return idCidade; }
    public void setIdCidade(int idCidade) { this.idCidade = idCidade; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
    public String getSituacao() { return situacao; }
    public void setSituacao(String situacao) { this.situacao = situacao; }
}