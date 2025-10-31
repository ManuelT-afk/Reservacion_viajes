package POO;

public class Cliente {

    // Propiedades
    private String nombre;
    private String email;
    private String telefono;

    // Constructor 
    public Cliente(String nombre, String email, String telefono){
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // Imprime la info del cliente
    public void mostrarInfo() {
        System.out.println("Cliente: " + this.nombre);
        System.out.println("Email: " + this.email);
        System.out.println("Telefono: " + this.telefono);
    }
}
