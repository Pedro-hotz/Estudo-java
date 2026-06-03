package dao;

import model.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SistemaDAO {

    // 1. Mapeamento do Diagrama de Sequência: Cadastrar Produto
    public void salvarProduto(Produto produto) {
        String sql = "INSERT INTO produto (nome, descricao, situacao) VALUES (?, ?, ?)";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, produto.getNome());
            stmt.setString(2, produto.getDescricao());
            stmt.setString(3, produto.getSituacao());
            stmt.executeUpdate();
            System.out.println("Produto salvo no banco com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void salvarItem(Item item) {
        String sql = "INSERT INTO item (nome, descricao, situacao) VALUES (?, ?, ?)";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, item.getNome());
            stmt.setString(2, item.getDescricao());
            stmt.setString(3, item.getSituacao());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 2. Mapeamento do Diagrama de Sequência: Cadastrar Transporte
    public void salvarTransporte(Transporte transporte) {
        String sql = "INSERT INTO transporte (data_partida, data_chegada, status, origem, destino, situacao) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, transporte.getDataPartida());
            stmt.setString(2, transporte.getDataChegada());
            stmt.setString(3, transporte.getStatus());
            stmt.setString(4, transporte.getOrigem());
            stmt.setString(5, transporte.getDestino());
            stmt.setString(6, transporte.getSituacao());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 3. Mapeamento do Diagrama de Sequência: Cadastrar Agente
    public void salvarAgente(Agente agente) {
        String sql = "INSERT INTO agente (nome, telefone, situacao) VALUES (?, ?, ?)";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, agente.getNome());
            stmt.setString(2, agente.getTelefone());
            stmt.setString(3, agente.getSituacao());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}