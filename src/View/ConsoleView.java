package View;

import java.util.Scanner;

public class ConsoleView {
    private final Scanner scanner = new Scanner(System.in);

    public void displayMenu() {
        System.out.println("\nGestor de Contactos");
        System.out.println("1. Agregar contacto");
        System.out.println("2. Encontrar contacto");
        System.out.println("3. Eliminar contacto");
        System.out.println("4. Listar contactos");
        System.out.println("5. Salir");
    }

    public String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}