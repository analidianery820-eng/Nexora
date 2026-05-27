package br.edu.ifrn.nexora.modelo;

public class Motorista { 
   
    private String nome;
    private String cnh;
    private String contato;

    // Construtor padrão (opcional, mas bom para o Main)
    public Motorista() {}

    public Motorista(String nome, String cnh, String contato) {
        this.nome = nome;
        this.cnh = cnh;
        this.contato = contato;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
}


