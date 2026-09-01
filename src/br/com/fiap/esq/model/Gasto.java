package br.com.fiap.esq.model;

public class Gasto {

    private String estabelecimento;
    private String tipoDoEstabelecimento;
    private double valorGasto;

    public Gasto(String estabelecimento, int tipoDoEstabelecimento, double valorGasto) {
        this.estabelecimento = estabelecimento;
        this.tipoDoEstabelecimento = tipoParaString(tipoDoEstabelecimento);
        this.valorGasto = valorGasto;
    }

    public static String tipoParaString(int tipo) {
        switch (tipo) {
            case 1: return "Comida";
            case 2: return "Moradia";
            case 3: return "Lazer";
            case 4: return "Saúde";
            default: return "Outros";
        }
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

    public double getValorGasto() {
        return valorGasto;
    }

    public void setValorGasto(double valorGasto) {
        this.valorGasto = valorGasto;
    }

}
