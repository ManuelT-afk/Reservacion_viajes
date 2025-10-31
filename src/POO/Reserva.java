package POO;

import java.util.Date;

public class Reserva { //LAS PROPIEDADES 

    private Cliente cliente;
    private Viaje viaje;
    private String fechaReserva;

    //EL CONSTRUCTOR
    public Reserva(Cliente cliente, Viaje viaje, String fechaReserva) {
        this.cliente = cliente;
        this.viaje = viaje;
        this.fechaReserva = fechaReserva;
    }

    //METODOS
    //GET
    public Cliente getCliente() {
        return cliente;
    }

    public Viaje getViaje() {
        return viaje;

    }

    public String fechaReserva() {
        return fechaReserva;

    }

    //Setters
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setViaje(Viaje viaje) {
        this.viaje = viaje;
    }

    public void setFehcaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    //Mostrar la info de la reserva
    public void mostrarInfo() {
        System.out.println("=== Reserva ===");
        cliente.mostrarInfo();
        viaje.mostrarinfo();
        System.out.println("Fecha a conservar: " + this.fechaReserva);
        System.out.println("===========");

    }

}
