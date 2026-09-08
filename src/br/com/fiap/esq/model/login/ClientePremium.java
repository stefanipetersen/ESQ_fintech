package br.com.fiap.esq.model.login;

public class ClientePremium extends Cliente {
    private double mensalidadePlano;
    private boolean consultorFinanceiroDedicado;

    public ClientePremium() {
    }

    public ClientePremium(String nome, String cpf, String email, double mensalidadePlano, int plano) {
        super(nome, cpf, email, plano);
        this.mensalidadePlano = mensalidadePlano;
        this.consultorFinanceiroDedicado = true;
    }

    @Override
    public boolean temAcesso(String funcionalidade) {
        return true;
    }

    @Override
    public double calcularTaxaManutencao() {
        return this.mensalidadePlano;
    }

    public double getMensalidadePlano() { return mensalidadePlano; }
    public void setMensalidadePlano(double mensalidadePlano) { this.mensalidadePlano = mensalidadePlano; }

    public boolean isConsultorFinanceiroDedicado() { return consultorFinanceiroDedicado; }
    public void setConsultorFinanceiroDedicado(boolean consultorFinanceiroDedicado) { this.consultorFinanceiroDedicado = consultorFinanceiroDedicado; }
}
