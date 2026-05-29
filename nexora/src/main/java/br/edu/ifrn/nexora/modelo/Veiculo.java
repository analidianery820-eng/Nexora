package br.edu.ifrn.nexora.modelo;

public class Veiculo {
    
    private String placa;
    private String tipo;
    private double capacidadeCarga;

    public Veiculo() {}

    public Veiculo(String placa, String tipo, double capacidadeCarga) {
        this.placa = placa;
        this.tipo = tipo;
        this.capacidadeCarga = capacidadeCarga;
    }

    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public double getCapacidadeCarga() { return capacidadeCarga; }
    public void setCapacidadeCarga(double capacidadeCarga) { this.capacidadeCarga = capacidadeCarga; }


}
