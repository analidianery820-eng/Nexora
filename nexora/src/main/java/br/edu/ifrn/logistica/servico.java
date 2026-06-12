package br.edu.ifrn.logistica;

public class servico {
    public void cadastrar(servico centro.capacidadeMax ) {

        if (centro.capacidadeMax <= 0) {

            throw new IllegalArgumentException(
                "A capacidade deve ser maior que zero."
            );
        }

        System.out.println(
            "Centro cadastrado com sucesso!"
        );
    }

}
