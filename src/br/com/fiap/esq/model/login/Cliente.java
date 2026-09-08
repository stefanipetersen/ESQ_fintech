package br.com.fiap.esq.model.login;

public abstract class Cliente {

    private String nome;

    private String email;

    private String cpf;

    private int plano;

    public Cliente() {
    }

    public Cliente(String nome, String email, String cpf, int plano) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }

    public static String tipodeConta(int tipo) {
        switch (tipo) {
            case 1: return "Basic";
            case 2: return "Premium";
            default: return "A definir";
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getPlano() {
        return plano;
    }

    public void setPlano(int plano) {
        this.plano = plano;
    }

    public String resumoConta(){
        return "Cliente: " + nome + "| E-mail: " + email + " | CPF: " + cpf + " | Tipo da Conta: " + tipodeConta(plano);
    }

    public abstract boolean temAcesso(String funcionalidade);

    public abstract double calcularTaxaManutencao();
}

