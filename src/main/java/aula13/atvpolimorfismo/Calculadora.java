package aula13.atvpolimorfismo;

public class Calculadora {
    static void main() {

    }
    void CalcularArea(double ladodoquadrado) {
        double area = ladodoquadrado * ladodoquadrado;
        System.out.println(area + "m2");
    }
    void CalcularArea(double base, double altura){
        double area = base * altura;
        System.out.println(area + "m2");
    }
    void CalcularArea(int raio){
        double area = 3.14159 * raio * raio;
        System.out.println(area + "m2");

    }
}
