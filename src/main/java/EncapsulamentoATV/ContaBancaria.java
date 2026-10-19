package EncapsulamentoATV;

public class ContaBancaria {
    private String titular;
    private double saldo;
    private String numeroConta = "011-X";

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setTitular(String titular) {
        if (titular == null || titular.isEmpty()){
            System.out.println("Inválido! Mantido " + this.titular);
            return;
        }
        this.titular = titular;
    }


    public String getTitular(){
        return this.titular;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public double depositar(double valor){
        if(valor <= 0) {
            System.out.println("Valor inválido!");
            return valor;
        }
        else {
            registrarLog("depósito de " + valor);
            this.saldo += valor;
            return valor;
        }
    }

    public double sacar(double valor){
        if (!temSaldo(valor)){
            System.out.println("Saldo insuficinete");
            return valor;
        } else{
            this.saldo -= valor;
           registrarLog("saque de " + valor);
            return valor;

        }
    }

    private boolean temSaldo(double valor) {
        return valor <= this.saldo;
    }

    private void registrarLog(String acao) {
        System.out.printf("[LOG] %s : %s%n",this.titular, acao);
    }
}
