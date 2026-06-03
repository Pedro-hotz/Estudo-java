package model;

public class Produto {
    private int idProduto;
    private String nome;
    private String descricao;
    private String situacao;

    // Métodos do diagrama de classes e sequência
    public void cadastrar_produto() { 
        // Chamado no diagrama de sequência de cadastro de produto
    }
    
    public void cadastrar() { }
    public void selecionarCidade() { }
    public void associarItens() { }
    public void selecionar() { }
    public void aprovar() { }
    public void suspender() { }
    public void reativar() { }
    public void inativar() { }
    public void descontinuar() { }

    // Getters e Setters
    public int getIdProduto() { return idProduto; }
    public void setIdProduto(int idProduto) { this.idProduto = idProduto; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public String getSituacao() { return situacao; }
    public void setSituacao(String situacao) { this.situacao = situacao; }
}