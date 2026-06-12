package br.edu.ifrn.logistica;

public class modelo {
    public String nome;
    public int capacidadeMax;
    public int cargasOcupadas;

    public int getEspacosDisponiveis() {
        return capacidadeMax - cargasOcupadas;
    }

    public boolean isLotado() {
        return cargasOcupadas >= capacidadeMax;
    }


}
