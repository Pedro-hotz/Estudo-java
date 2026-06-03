package model;

public class EmpresaParceira {
    private int idEmpresaParceira;
    private String cnpj;
    private String nome;
    private String telefone;
    private String situacao;

    public void cadastrar() { }
    public void selecionar() { }
    public void listar() { }

    // Getters e Setters
    public int getIdEmpresaParceira() { return idEmpresaParceira; }
    public void setIdEmpresaParceira(int idEmpresaParceira) { this.idEmpresaParceira = idEmpresaParceira; }
    public String getCnpj() { return cnpj; }
    public void setCnpj(String cnpj) { this.cnpj = cnpj; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    public String getSituacao() { return situacao; }
    public void setSituacao(String situacao) { this.situacao = situacao; }
}