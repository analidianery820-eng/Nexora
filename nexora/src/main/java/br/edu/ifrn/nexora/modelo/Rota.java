package br.edu.ifrn.nexora.modelo;

public class Rota {

    private String pontoPartida;
    private String destino;
    private double distanciaEstimada;

    public Rota() {}

    public Rota(String pontoPartida, String destino, double distanciaEstimada) {
        this.pontoPartida = pontoPartida;
        this.destino = destino;
        this.distanciaEstimada = distanciaEstimada;
    }

    public String getPontoPartida() { return pontoPartida; }
    public void setPontoPartida(String pontoPartida) { this.pontoPartida = pontoPartida; }
    public String getDestino() { return destino; }
    public void setDestino(String destino) { this.destino = destino; }
    public double getDistanciaEstimada() { return distanciaEstimada; }
    public void setDistanciaEstimada(double distanciaEstimada) { this.distanciaEstimada = distanciaEstimada; }
}


