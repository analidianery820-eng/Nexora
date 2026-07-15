package br.edu.ifrn.nexora.servico;

import java.util.List;
import br.edu.ifrn.nexora.modelo.Motorista;
import br.edu.ifrn.nexora.repositorio.MotoristaRepositorio;

public class MotoristaServico {
    private final MotoristaRepositorio repositorio = new MotoristaRepositorio();

    public void salvarNovoMotorista(Motorista motorista) {
        if (motorista.getNome() == null || motorista.getNome().trim().isEmpty()) {
            throw new IllegalArgumentException("Erro de Regra: O nome do motorista é obrigatório.");
        }
        if (motorista.getCnh() == null || motorista.getCnh().trim().isEmpty()) {
            throw new IllegalArgumentException("Erro de Regra: A CNH é obrigatória.");
        }
        repositorio.inserir(motorista);
    }

    public List<Motorista> listarMotoristas() {
        return repositorio.selecionarTodos();
    }

    public void alterarDadosMotorista(Motorista motorista) {
        if (motorista.getId() == null) {
            throw new IllegalArgumentException("Erro de Regra: Não é possível atualizar sem ID.");
        }
        repositorio.atualizar(motorista);
    }

    public void removerMotorista(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("Erro de Regra: ID inválido para exclusão.");
        }
        repositorio.excluir(id);
    }
}