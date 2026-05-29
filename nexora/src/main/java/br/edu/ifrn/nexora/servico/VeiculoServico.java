package br.edu.ifrn.nexora.servico;

import br.edu.ifrn.nexora.modelo.Veiculo;

public class VeiculoServico {

  
    public void cadastrarVeiculo(Veiculo novoVeiculo) {
        if (novoVeiculo.getPlaca() == null || novoVeiculo.getPlaca().trim().isEmpty()) {
            throw new IllegalArgumentException("A placa do veículo é obrigatória.");
        }
        if (novoVeiculo.getTipo() == null || novoVeiculo.getTipo().trim().isEmpty()) {
            throw new IllegalArgumentException("O tipo do veículo é obrigatório.");
        }
        if (novoVeiculo.getCapacidadeCarga() <= 0) {
            throw new IllegalArgumentException("A capacidade de carga deve ser maior que zero.");
        }
        System.out.println("Veículo de placa '" + novoVeiculo.getPlaca() + "' cadastrado com sucesso!");
    }
}


