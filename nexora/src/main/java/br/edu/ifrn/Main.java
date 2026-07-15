package br.edu.ifrn;

import br.edu.ifrn.nexora.modelo.Motorista;
import br.edu.ifrn.nexora.servico.MotoristaServico;
import br.edu.ifrn.nexora.servico.MotoristaServico;

public class Main {
    public static void main(String[] args) {
        MotoristaServico motoristaService = new MotoristaServico();

        System.out.println("\n--- [C] - INSERINDO Motoristas no MySQL (Nexora) ---");
        Motorista mot1 = new Motorista("Emanuel", "12345678900", "AD");
        Motorista mot2 = new Motorista("Bruno", "98765432100", "B");

        motoristaService.salvarNovoMotorista(mot1);
        motoristaService.salvarNovoMotorista(mot2);
        
        System.out.println("\n--- [R] - SELECIONANDO e exibindo os registros ---");
        motoristaService.listarMotoristas().forEach(System.out::println);

        System.out.println("\n--- [U] - ATUALIZANDO Dados do Motorista ---");
        mot2.setAtivo(false); 
        motoristaService.alterarDadosMotorista(mot2); 
        motoristaService.listarMotoristas().forEach(System.out::println);

        System.out.println("\n--- [D] - EXCLUINDO um motorista do MySQL ---");
        motoristaService.removerMotorista(mot1.getId()); 
        
        System.out.println("\nEstado final da tabela no MySQL:");
        motoristaService.listarMotoristas().forEach(System.out::println);
    }
}