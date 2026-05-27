package br.edu.ifrn.nexora.servico;

import br.edu.ifrn.nexora.modelo.Motorista;

public class MotoristaServico {


    public void cadastrarMotorista(Motorista novoMotorista) {
        // Critério de Aceitação: Validar campos obrigatórios
        if (novoMotorista.getNome() == null || novoMotorista.getNome().trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do motorista é obrigatório.");
        }
        
        if (novoMotorista.getCnh() == null || novoMotorista.getCnh().trim().isEmpty()) {
            throw new IllegalArgumentException("O número da CNH é obrigatório.");
        }

        // Lógica para salvar (simulação)
        System.out.println("Motorista '" + novoMotorista.getNome() + "' cadastrado com sucesso!");
    }
}



