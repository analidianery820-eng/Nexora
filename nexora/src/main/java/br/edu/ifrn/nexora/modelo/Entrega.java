package br.edu.ifrn.nexora.modelo;

public class Entrega {
    
    private String cliente;
    private String endereco;
    private String codigoProduto;
    private String status; // "Pendente", "Em Andamento", "Concluída", etc.

    // Construtor padrão
    public Entrega() {
        this.status = "Pendente"; // Toda entrega nova começa como Pendente
    }

    // Construtor cheio para facilitar a criação no Main
    public Entrega(String cliente, String endereco, String codigoProduto) {
        this.cliente = cliente;
        this.endereco = endereco;
        this.codigoProduto = codigoProduto;
        this.status = "Pendente";
    }

    // Getters e Setters
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}



