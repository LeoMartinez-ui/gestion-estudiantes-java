public class Main {

    public static void main(String[] args) {

        // Creación de objetos (instanciación)
        Estudiante e1 = new Estudiante("Juan Pérez", 18, 85);
        Estudiante e2 = new Estudiante("María López", 19, 65);

        // Mostrar información
        System.out.println("=== Estudiante 1 ===");
        e1.mostrarInfo();
        System.out.println("¿Aprobó? " + e1.aprobo());

        System.out.println("\n=== Estudiante 2 ===");
        e2.mostrarInfo();
        System.out.println("¿Aprobó? " + e2.aprobo());
    }
}