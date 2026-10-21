package ExercicioConstrutores;

public class Main {
    public static void main(String[] args) {
        Agendamento thor = new Agendamento("Thor","banho", "14h", true, true, false, "alérgico a shampoo", 0.1);
        thor.mostrar();
        Agendamento luna = new Agendamento("Luna", "tosa", "10h", false, false, false, "", 0.00);
        luna.mostrar();
        Agendamento mel = new Agendamento("Mel", "banho", "16h", false, false,true, "",0.00 );
        mel.mostrar();
    }
}
