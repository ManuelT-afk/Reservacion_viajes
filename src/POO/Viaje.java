package POO;

public class Viaje {

    //Propiedades 
    private String destino;
    private Double precio;
    private String fechaReserva;

    //Constructor 
    public Viaje(String destino, Double precio, String fechaReserva) {
        this.destino = destino;
        this.precio = precio;
        this.fechaReserva = fechaReserva;
    }

    //Get
    public String getDestino() {
        return destino;
    }

    public Double getPrecio() {
        return precio;
    }

    public String getFecha() {
        return fechaReserva;
    }

    //Metodos 
    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setPreci(Double precio) {
        this.precio = precio;
    }

    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    //El metodo para mostrar el info del viaje 
    public void mostrarinfo() {
        System.out.println("Destino: " + this.destino);
        System.out.println("Precio: " + this.precio);
        System.out.println("Fecha: " + this.fechaReserva);

    }

}
