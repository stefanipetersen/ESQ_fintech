package br.com.fiap.esq.model;

public class Objetivo {

    private String objetivo;
    private double valorFinalObjetivo;
    private double valorInicialObjetivo;

    public Objetivo(String objetivo, double valorFinalObjetivo, double valorInicialObjetivo) {
        this.objetivo = objetivo;
        this.valorFinalObjetivo = valorFinalObjetivo;
        this.valorInicialObjetivo = valorInicialObjetivo;
    }

    public Objetivo() {
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public double getValorFinalObjetivo() {
        return valorFinalObjetivo;
    }

    public void setValorFinalObjetivo(double valorFinalObjetivo) {
        this.valorFinalObjetivo = valorFinalObjetivo;
    }

    public double getValorInicialObjetivo() {
        return valorInicialObjetivo;
    }

    public void setValorInicialObjetivo(double valorInicialObjetivo) {
        this.valorInicialObjetivo = valorInicialObjetivo;
    }

}
