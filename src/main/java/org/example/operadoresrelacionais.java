package org.example;

public class operadoresrelacionais {
    static void main() {
        //1- Crie variáveis para as notas de duas alunas. Mostre na tela o resultado de: são iguais, são diferentes, a primeira é maior, a primeira é menor para quando:
        //- a = 10, b = 3
        //- a = 3, b = 10
        //- a = 5, b = 5
        int a1 = 10;
        int b1 = 2;
        System.out.println(a1 == b1);
        System.out.println(a1 != b1);
        System.out.println(a1 > b1);
        System.out.println(a1 < b1);
        int a2 = 3;
        int b2 = 10;
        System.out.println(a2 == b2);
        System.out.println(a2 != b2);
        System.out.println(a2 > b2);
        System.out.println(a2 < b2);
        int a3 = 5;
        int b3 = 5;
        System.out.println(a3 == b3);
        System.out.println(a3 != b3);
        System.out.println(a3 > b3);
        System.out.println(a3 < b3);
        //2- Exiba na tela  a == b, sendo a = 10 e b 3.
        //3- Exiba na tela a != b, sendo a = 10 e b = 3.
        //4- Dado boolean chovendo = true, retorne na tela o resultado de !chovendo
        boolean chovendo = true;
        System.out.println(!chovendo);
    }

}
