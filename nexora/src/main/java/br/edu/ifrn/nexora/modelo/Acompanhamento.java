package br.edu.ifrn.nexora.modelo;

public class Acompanhamento {
    
    private String statusAtual;
    private String dataHoraAtualizacao;

    public Acompanhamento() {}

    public Acompanhamento(String statusAtual, String dataHoraAtualizacao) {
        this.statusAtual = statusAtual;
        this.dataHoraAtualizacao = dataHoraAtualizacao;
    }

    public String getStatusAtual() { return statusAtual; }
    public void setStatusAtual(String statusAtual) { this.statusAtual = statusAtual; }
    public String getDataHoraAtualizacao() { return dataHoraAtualizacao; }
    public void setDataHoraAtualizacao(String dataHoraAtualizacao) { this.dataHoraAtualizacao = dataHoraAtualizacao; }
}


