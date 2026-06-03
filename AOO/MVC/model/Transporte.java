package model;

public class Transporte {
    private int idTransporte;
    private String dataPartida;
    private String dataChegada;
    private String status;
    private String origem;
    private String destino;
    private String situacao;

    // Métodos mapeados dos diagramas
    public void cadastrar_transporte() { }
    public void cadastrar() { }
    public void selecionarProduto() { }
    public void selecionarAgente() { }
    public void selecionarOrigem() { }
    public void selecionarDestino() { }
    public void iniciar() { }
    public void suspender() { }
    public void reativar() { }
    public void finalizar() { }

    // Getters e Setters
    public int getIdTransporte() { return idTransporte; }
    public void setIdTransporte(int idTransporte) { this.idTransporte = idTransporte; }
    public String getDataPartida() { return dataPartida; }
    public void setDataPartida(String dataPartida) { this.dataPartida = dataPartida; }
    public String getDataChegada() { return dataChegada; }
    public void setDataChegada(String dataChegada) { this.dataChegada = dataChegada; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public String getOrigem() { return origem; }
    public void setOrigem(String origem) { this.origem = origem; }
    public String getDestino() { return destino; }
    public void setDestino(String destino) { this.destino = destino; }
    public String getSituacao() { return situacao; }
    public void setSituacao(String situacao) { this.situacao = situacao; }
}