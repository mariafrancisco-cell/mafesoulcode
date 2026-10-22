package aula19.builder.main;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = Pizza.builder()
                .borda("Catupiry")
                .sabor("mussarela")
                .temQueijo(true)
                .build();

        System.out.println(pizza);
    }
}
