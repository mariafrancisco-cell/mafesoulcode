package EncapsulamentoATV;

import aula13.atvpolimorfismo.Professora;

public class main {
    static void main(String[] args) {
        ContaBancaria c = new ContaBancaria();
        c.setTitular("Ana");
        System.out.println("Titular: " +c.getTitular());
        System.out.println("Saldo: " + c.getSaldo());

        c.depositar(500);
        System.out.println("Saldo: " + c.getSaldo());
        c.depositar(-100);
        System.out.println("Saldo: " + c.getSaldo());
        c.sacar(2000);
        c.sacar(200);
        System.out.println("Saldo: " + c.getSaldo());

        System.out.println(Produto.nome);
        System.out.println(Produto.preco);
        //System.out.println(Produto.codigoInterno);

        System.out.println("Número da conta " + c.getNumeroConta());
        //c.setNumeroConta("999-Z");
    }
}
