package br.edu.ifrn.nexora.repositorio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import br.edu.ifrn.nexora.modelo.Motorista;

public class MotoristaRepositorio {

    private Connection getConnection() throws SQLException {
        return GerenciadorDeConexao.getConnection();
    }

    public void inserir(Motorista motorista) {
        String sql = "INSERT INTO motorista (nome, cnh, tipo_cnh, ativo) VALUES (?, ?, ?, ?)";
        try (Connection conn = getConnection(); 
             PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            stmt.setString(1, motorista.getNome());
            stmt.setString(2, motorista.getCnh());
            stmt.setString(3, motorista.getTipoCnh());
            stmt.setBoolean(4, motorista.isAtivo());
            stmt.executeUpdate();

            try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    motorista.setId(generatedKeys.getLong(1));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir motorista no MySQL", e);
        }
    }

    public List<Motorista> selecionarTodos() {
        List<Motorista> motoristas = new ArrayList<>();
        String sql = "SELECT * FROM motorista";
        try (Connection conn = getConnection(); 
             Statement stmt = conn.createStatement(); 
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Motorista motorista = new Motorista();
                motorista.setId(rs.getLong("id"));
                motorista.setNome(rs.getString("nome"));
                motorista.setCnh(rs.getString("cnh"));
                motorista.setTipoCnh(rs.getString("tipo_cnh"));
                motorista.setAtivo(rs.getBoolean("ativo"));
                motoristas.add(motorista);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao selecionar dados do MySQL", e);
        }
        return motoristas;
    }

    public void atualizar(Motorista motorista) {
        String sql = "UPDATE motorista SET nome = ?, cnh = ?, tipo_cnh = ?, ativo = ? WHERE id = ?";
        try (Connection conn = getConnection(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, motorista.getNome());
            stmt.setString(2, motorista.getCnh());
            stmt.setString(3, motorista.getTipoCnh());
            stmt.setBoolean(4, motorista.isAtivo());
            stmt.setLong(5, motorista.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao atualizar dados no MySQL", e);
        }
    }

    public void excluir(Long id) {
        String sql = "DELETE FROM motorista WHERE id = ?";
        try (Connection conn = getConnection(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setLong(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao excluir dados do MySQL", e);
        }
    }
}