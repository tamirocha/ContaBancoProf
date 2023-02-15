package br.com.contaprof;

public interface Conta {

    public void abrirConta(String t);
    public void fecharConta();
    public void depositar(double v);
    public void sacar(double v);
    public void pagarMensal();

}

