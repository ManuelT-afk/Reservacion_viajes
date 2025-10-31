package reserva_viajes;

import POO.Cliente;
import POO.Viaje;
import POO.Reserva;
import java.util.*;

public class Reserva_viajes {

    public static void main(String[] args) {
        //prueba cliente 
        Cliente cliente_1 = new Cliente("Juan Torres", "juanito@gmail.com", "5545456789");
        //Enseña info 
        //cliente_1.mostrarInfo();
        //ahora el de viaje
        Viaje viaje_1 = new Viaje("Puerto Vallarta", 1934.06, "2025-09-24");

        //el que sigue es el de reserva 
        Reserva reserva_1 = new Reserva(cliente_1, viaje_1, "2025-09-25");
        reserva_1.mostrarInfo();
        
        
        //como extras cuando vuelva a entrar debo de mejorarlo con un arraylist para veitar el cliente 1,2....
        //ademas de tratar de practicar las condicionales en el de precio :)

    }

}
