package br.edu.ifrn;

import br.edu.ifrn.nexora.modelo.*;
import br.edu.ifrn.nexora.servico.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== TESTANDO SISTEMA LOGÍSTICO COMPLETO - NEXORA ===");

        // Instanciando todos os Serviços
        MotoristaServico motoristaServico = new MotoristaServico();
        EntregaServico entregaServico = new EntregaServico();
        VeiculoServico veiculoServico = new VeiculoServico();
        RotaServico rotaServico = new RotaServico();
        AcompanhamentoServico acompanhamentoServico = new AcompanhamentoServico();

        // 1. REQUISITO: MOTORISTA
        System.out.println("\n--- [Requisito] Cadastro de Motorista ---");
        Motorista mot1 = new Motorista("Carlos Alencar", "123456789-0", "(84) 98888-1111");
        motoristaServico.cadastrarMotorista(mot1);

        // 2. REQUISITO: ENTREGA
        System.out.println("\n--- [Requisito] Registro de Entrega ---");
        Entrega ent1 = new Entrega("Supermercado Ideal", "Av. Central, 500", "COD-PROD-99");
        entregaServico.cadastrarEntrega(ent1);

        // 3. REQUISITO: VEÍCULO
        System.out.println("\n--- [Requisito] Cadastro de Veículo ---");
        try {
            Veiculo vei1 = new Veiculo("ABC-1234", "Caminhão Baú", 5000.0);
            veiculoServico.cadastrarVeiculo(vei1);
            Veiculo vei2 = new Veiculo("XYZ-9999", "Furgão", 0.0); // Forçando erro
            veiculoServico.cadastrarVeiculo(vei2);
        } catch (IllegalArgumentException e) {
            System.out.println("Validação de Veículo OK! Erro: " + e.getMessage());
        }

        // 4. REQUISITO: ROTA
        System.out.println("\n--- [Requisito] Definição de Rota ---");
        try {
            Rota rota1 = new Rota("Natal/RN", "Mossoró/RN", 280.5);
            rotaServico.cadastrarRota(rota1);
            Rota rota2 = new Rota("Natal/RN", "", 150.0); // Forçando erro
            rotaServico.cadastrarRota(rota2);
        } catch (IllegalArgumentException e) {
            System.out.println("Validação de Rota OK! Erro: " + e.getMessage());
        }

        // 5. REQUISITO: ACOMPANHAMENTO
        System.out.println("\n--- [Requisito] Acompanhamento de Entrega ---");
        try {
            Acompanhamento aco1 = new Acompanhamento("Em trânsito", "27/05/2026 20:30");
            acompanhamentoServico.atualizarStatus(aco1);
            Acompanhamento aco2 = new Acompanhamento("", "27/05/2026 20:31"); // Forçando erro
            acompanhamentoServico.atualizarStatus(aco2);
        } catch (IllegalArgumentException e) {
            System.out.println("Validação de Acompanhamento OK! Erro: " + e.getMessage());
        }

        System.out.println("\n=== FIM DE TODOS OS TESTES COM SUCESSO ===");
    }
}
