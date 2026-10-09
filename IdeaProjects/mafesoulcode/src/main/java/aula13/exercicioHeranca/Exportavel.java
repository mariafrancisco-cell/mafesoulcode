package aula13.exercicioHeranca;

public interface Exportavel {
    default void exportar(){
        System.out.println("Exportado.");
    }
}
