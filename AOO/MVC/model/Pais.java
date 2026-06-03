package model;

public class Pais {
    private int idPais;
    private String nome;
    private String situacao;

    // Métodos solicitados pelo diagrama de classes
    public void cadastrar() { /* Lógica de negócio se houver */ }
    public void listar() { /* Lógica de negócio se houver */ }

    // Getters e Setters
    public int getIdPais() { return idPais; }
    public void setIdPais(int idPais) { this.idPais = idPais; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getSituacao() { return situacao; }
    public void setSituacao(String situacao) { this.situacao = situacao; }
}