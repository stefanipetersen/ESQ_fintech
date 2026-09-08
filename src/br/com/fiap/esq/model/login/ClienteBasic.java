package br.com.fiap.esq.model.login;

import javax.sql.rowset.spi.SyncResolver;

public class ClienteBasic extends Cliente {
    private int limiteCategoriasGastos;

    public ClienteBasic() {
    }

    public ClienteBasic(String nome, String cpf, String email, int plano) {
        super(nome, cpf, email, plano);
        this.limiteCategoriasGastos = 5;
    }

    @Override
    public boolean temAcesso(String funcionalidade) {
        switch (funcionalidade.toLowerCase()) {
            case "categorizar_gastos_basico":
            case "extrato_mensal":
            case "meta_economia_simples":
                return true;
            case "relatorios_ia":
            case "planejamento_investimentos":
            case "alerta_gastos_preditivo":
                return false;
            default:
                return false;
        }
    }

    @Override
    public double calcularTaxaManutencao() {
        return 0.0;
    }

    public int getLimiteCategoriasGastos() { return limiteCategoriasGastos; }
    public void setLimiteCategoriasGastos(int limiteCategoriasGastos) { this.limiteCategoriasGastos = limiteCategoriasGastos; }
}
