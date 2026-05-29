package br.edu.ifrn.nexora.servico;

import br.edu.ifrn.nexora.modelo.Rota;

public class RotaServico {

  
    public void cadastrarRota(Rota novaRota) {
        if (novaRota.getPontoPartida() == null || novaRota.getPontoPartida().trim().isEmpty()) {
            throw new IllegalArgumentException("O ponto de partida da rota é obrigatório.");
        }
        if (novaRota.getDestino() == null || novaRota.getDestino().trim().isEmpty()) {
            throw new IllegalArgumentException("O destino da rota é obrigatório.");
        }
        if (novaRota.getDistanciaEstimada() <= 0) {
            throw new IllegalArgumentException("A distância estimada deve ser maior que zero KM.");
        }
        System.out.println("Rota de '" + novaRota.getPontoPartida() + "' para '" + novaRota.getDestino() + "' definida com sucesso!");
    }
}


