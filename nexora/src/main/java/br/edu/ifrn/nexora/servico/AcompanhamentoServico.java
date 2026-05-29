package br.edu.ifrn.nexora.servico;

import br.edu.ifrn.nexora.modelo.Acompanhamento;

public class AcompanhamentoServico {

   
    public void atualizarStatus(Acompanhamento statusNovo) {
        if (statusNovo.getStatusAtual() == null || statusNovo.getStatusAtual().trim().isEmpty()) {
            throw new IllegalArgumentException("O status do acompanhamento não pode ser vazio.");
        }
        if (statusNovo.getDataHoraAtualizacao() == null || statusNovo.getDataHoraAtualizacao().trim().isEmpty()) {
            throw new IllegalArgumentException("A data e hora da atualização são obrigatórias.");
        }
        System.out.println("Status da entrega atualizado para '" + statusNovo.getStatusAtual() + "' em " + statusNovo.getDataHoraAtualizacao());
    }
}


