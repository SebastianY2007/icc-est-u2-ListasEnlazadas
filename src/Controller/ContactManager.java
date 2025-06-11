package Controller;

import java.util.HashMap;
import java.util.Map;

public class ContactManager {
    private Map<String, String> contacts;

    public ContactManager() {
        contacts = new HashMap<>();
    }

    public void addContact(String name, String phone) {
        contacts.put(name, phone);
    }

    public String findContact(String name) {
        if (contacts.containsKey(name)) {
            return name + " - " + contacts.get(name);
        } else {
            return null;
        }
    }

    public boolean deleteContact(String name) {
        if (contacts.containsKey(name)) {
            contacts.remove(name);
            return true;
        } else {
            return false;
        }
    }

    public String listContacts() {
        if (contacts.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            sb.append(entry.getKey()).append(" - ").append(entry.getValue()).append("\n");
        }
        return sb.toString();
    }
}
