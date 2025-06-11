package Model;

public class Contact<T, U> {
    private T name;
    private U phone;

    public Contact() {
    }

    public Contact(T name) {
        this.name = name;
    }

    public Contact(T name, U phone) {
        this.name = name;
        this.phone = phone;
    }

    public T getName() {
        return name;
    }

    public U getPhone() {
        return phone;
    }

    @Override
    public boolean equals (Object obj){
        if (obj == null) return false;
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }

        // Aqui obj y this son clase contacto

        Contact c = (Contact) obj;
        return name != null &&  name.equals(c.getName());
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((phone == null) ? 0 : phone.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return name + " - " + phone;
    }
}