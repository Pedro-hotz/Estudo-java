package model;

public class Agente {
    private int idAgente;
    private String nome;
    private String telefone;
    private String situacao;

    // Métodos mapeados dos diagramas
    public void cadastrar_agente() { }
    public void cadastrar() { }
    public void selecionarEmpresa() { }
    public void selecionar() { }
    public void aprovar() { }
    public void afastar() { }
    public void inativar() { }
    public void desligar() { }

    // Getters e Setters
    public int getIdAgente() { return idAgente; }
    public void setIdAgente(int idAgente) { this.idAgente = idAgente; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    public String getSituacao() { return situacao; }
    public void setSituacao(String situacao) { this.situacao = situacao; }
}