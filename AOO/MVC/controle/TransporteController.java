package controller;

import model.*;
import dao.SistemaDAO;

public class TransporteController {
    private SistemaDAO sistemaDAO = new SistemaDAO();

    // Executa as mensagens do Diagrama de Sequência - Cadastrar Agente
    public void cadastrar_agente(String nomeAgente, String telefone, String nomeEmpresa) {
        System.out.println("Iniciando fluxo: cadastrar_agente()");

        // 1. selecionar_empresa()
        EmpresaParceira empresa = new EmpresaParceira();
        empresa.setNome(nomeEmpresa);
        empresa.selecionar();

        // 2. cadastrar_agente()
        Agente agente = new Agente();
        agente.setNome(nomeAgente);
        agente.setTelefone(telefone);
        agente.setSituacao("Ativo");
        agente.cadastrar_agente();

        sistemaDAO.salvarAgente(agente);
    }
}