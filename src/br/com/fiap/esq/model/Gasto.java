package br.com.fiap.esq.model;

public class Gasto {

    private String estabelecimento;
    private int tipoDoEstabelecimento;
    private double valorGasto;

    public Gasto(String estabelecimento, int tipoDoEstabelecimento, double valorGasto) {
        this.estabelecimento = estabelecimento;
        this.tipoDoEstabelecimento = tipoDoEstabelecimento;
        this.valorGasto = valorGasto;
    }

    public Gasto() {
    }

    public String getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(String estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

    public int getTipoDoEstabelecimento() {
        return tipoDoEstabelecimento;
    }

    public void setTipoDoEstabelecimento(int tipoDoEstabelecimento) {
        this.tipoDoEstabelecimento = tipoDoEstabelecimento;
    }

    public double getValorGasto() {
        return valorGasto;
    }

    public void setValorGasto(double valorGasto) {
        this.valorGasto = valorGasto;
    }

}
