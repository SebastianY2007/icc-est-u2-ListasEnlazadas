package Controller;
import View.ConsoleView;

public class MenuController {
    private ContactManager contactManager = new ContactManager();
    private ConsoleView consoleView = new ConsoleView();

    public void showMenu(){
        while (true) {
            consoleView.displayMenu();
            String choice = consoleView.getInput("Escoja una opción: ");
            switch (choice) {
                case "1": addContact(); 
                break;
                case "2": findContact(); 
                break;
                case "3": deleteContact(); 
                break;
                case "4": listContacts(); 
                break;
                case "5": consoleView.showMessage("Saliendo..."); 
                return;
                default: consoleView.showMessage("Opción no válida, intente de nuevo.");
            }
        }
    }

    private void addContact() {
        String name = consoleView.getInput("Ingrese el nombre del contacto: ");
        String phone = consoleView.getInput("Ingrese el número de teléfono: ");
        contactManager.addContact(name, phone);
        consoleView.showMessage("Contacto agregado exitosamente.");
    }

    private void findContact() {
        String name = consoleView.getInput("Ingrese el nombre del contacto a buscar: ");
        String contact = contactManager.findContact(name);
        if (contact != null) {
            consoleView.showMessage("Contacto encontrado: " + contact);
        } else {
            consoleView.showMessage("Contacto no encontrado.");
        }
    }

    private void deleteContact() {
        String name = consoleView.getInput("Ingrese el nombre del contacto a eliminar: ");
        boolean deleted = contactManager.deleteContact(name);
        if (deleted) {
            consoleView.showMessage("Contacto eliminado exitosamente.");
        } else {
            consoleView.showMessage("Contacto no encontrado.");
        }
    }

    private void listContacts() {
        String contacts = contactManager.listContacts();
        if (contacts.isEmpty()) {
            consoleView.showMessage("No hay contactos disponibles.");
        } else {
            consoleView.showMessage("Lista de contactos:\n" + contacts);
        }
    }
}
