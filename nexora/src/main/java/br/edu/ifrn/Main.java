package br.edu.ifrn;

// Importamos os modelos e os serviços para a Main poder usá-los
import br.edu.ifrn.nexora.modelo.Motorista;
import br.edu.ifrn.nexora.modelo.Entrega;
import br.edu.ifrn.nexora.servico.MotoristaServico;
import br.edu.ifrn.nexora.servico.EntregaServico;

public class Main {
    public static void main(String[] args) {
        System.out.println("Testando o sistema de logistica");

          // Instanciamos os nossos serviços (os cérebros das validações)
        MotoristaServico motoristaServico = new MotoristaServico();
        EntregaServico entregaServico = new EntregaServico();

        // ------------------------------------------------------------------
        // TESTES DO MOTORISTA
        // ------------------------------------------------------------------
        System.out.println("\n--- Testando Cadastro de Motorista ---");

        // Cenário 1: Sucesso (Todos os dados preenchidos)
        Motorista mot1 = new Motorista("Carlos Alencar", "123456789-0", "(84) 98888-1111");
        motoristaServico.cadastrarMotorista(mot1);

        // Cenário 2: Falha (Tentando cadastrar sem CNH para testar a validação)
        try {
            Motorista mot2 = new Motorista("Roberto Souza", "", "(84) 99999-2222");
            motoristaServico.cadastrarMotorista(mot2);
        } catch (IllegalArgumentException e) {
            // O sistema vai cair aqui e mostrar a mensagem de erro que criamos no service
            System.out.println("Validação funcionou! Erro: " + e.getMessage());
        }

        // ------------------------------------------------------------------
        // TESTES DA ENTREGA
        // ------------------------------------------------------------------
        System.out.println("\n--- Testando Cadastro de Entrega ---");

        // Cenário 1: Sucesso (Todos os dados preenchidos)
        Entrega ent1 = new Entrega("Supermercado Ideal", "Av. Central, 500", "COD-PROD-99");
        entregaServico.cadastrarEntrega(ent1);

        // Cenário 2: Falha (Tentando cadastrar sem endereço)
        try {
            Entrega ent2 = new Entrega("Loja Tech", "   ", "COD-PROD-10");
            entregaServico.cadastrarEntrega(ent2);
        } catch (IllegalArgumentException e) {
            // O sistema vai barrar e mostrar o erro de endereço obrigatório
            System.out.println("Validação funcionou! Erro: " + e.getMessage());
        }

        System.out.println("\n=== FIM DOS TESTES ===");
    }
    }
