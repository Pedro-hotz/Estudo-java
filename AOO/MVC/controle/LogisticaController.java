package controller;

import model.*;
import dao.SistemaDAO;

public class LogisticaController {
    private SistemaDAO sistemaDAO = new SistemaDAO();

    // Executa as mensagens do Diagrama de Sequência - Cadastrar Produto
    public void cadastrar_produto(String nomeProduto, String descricao, String nomeCidade, String nomeItem) {
        System.out.println("Iniciando fluxo: cadastrar_produto()");

        // 1. selecionar_cidade()
        Cidade cidade = new Cidade();
        cidade.setNome(nomeCidade);
        cidade.selecionar();

        // 2. Criar e cadastrar_produto()
        Produto produto = new Produto();
        produto.setNome(nomeProduto);
        produto.setDescricao(descricao);
        produto.setSituacao("Ativo");
        produto.cadastrar_produto();

        // Persiste o produto usando o DAO
        sistemaDAO.salvarProduto(produto);

        // 3. cadastrar_item()
        Item item = new Item();
        item.setNome(nomeItem);
        item.setSituacao("Associado");
        item.cadastrar();
        
        sistemaDAO.salvarItem(item);
    }

    // Executa as mensagens do Diagrama de Sequência - Cadastrar Transporte
    public void cadastrar_transporte(String partida, String chegada, String prodNome, String agenteNome, String origem, String destino) {
        System.out.println("Iniciando fluxo: cadastrar_transporte()");

        // fluxo de seleções do diagrama de sequência
        Produto p = new Produto();
        p.selecionar(); 

        Agente a = new Agente();
        a.selecionar();

        Armazem o = new Armazem();
        o.selecionarOrigem();

        Armazem d = new Armazem();
        d.selecionarDestino();

        // Criação e persistência do Transporte
        Transporte transporte = new Transporte();
        transporte.setDataPartida(partida);
        transporte.setDataChegada(chegada);
        transporte.setOrigem(origem);
        transporte.setDestino(destino);
        transporte.setStatus("Pendente");
        transporte.cadastrar_transporte();

        sistemaDAO.salvarTransporte(transporte);
    }
}