package br.edu.ifrn.nexora.servico;

import br.edu.ifrn.nexora.modelo.Entrega;

public class EntregaServico {
    
    public void cadastrarEntrega(Entrega novaEntrega) {
        // Critérios de Aceitação: Validar campos obrigatórios
        if (novaEntrega.getCliente() == null || novaEntrega.getCliente().trim().isEmpty()) {
            throw new IllegalArgumentException("O nome ou código do cliente é obrigatório.");
        }
        
        if (novaEntrega.getEndereco() == null || novaEntrega.getEndereco().trim().isEmpty()) {
            throw new IllegalArgumentException("O endereço de entrega é obrigatório.");
        }

        if (novaEntrega.getCodigoProduto() == null || novaEntrega.getCodigoProduto().trim().isEmpty()) {
            throw new IllegalArgumentException("O código do produto é obrigatório.");
        }

        System.out.println("Entrega para o cliente '" + novaEntrega.getCliente() + "' cadastrada com sucesso!");
    }
}


