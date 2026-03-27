import net.salesianos.personaje.Personaje;
import net.salesianos.personaje.guerrero.Guerrero;
import net.salesianos.personaje.mago.Mago;


public class App {
    public static void main(String[] args) {

        Personaje viajero = new Personaje("Eldrin", 3);

        viajero.entrenar(4);

        viajero.gastarEnergia(30);

        
        viajero.mostrarInfo();

        
  }

 }
