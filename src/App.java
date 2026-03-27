import net.salesianos.personaje.Personaje;
import net.salesianos.personaje.guerrero.Guerrero;
import net.salesianos.personaje.mago.Mago;


public class App {
    public static void main(String[] args) {

        Personaje viajero = new Personaje("Eldrin", 3);

        viajero.entrenar(4);

        viajero.gastarEnergia(30);

        viajero.mostrarInfo();

        System.out.println("Te tocan-");

        Guerrero Thorak = new Guerrero("Thorak", 5, "Hacha doble");

       Thorak.ataquePesado();

        Thorak.descansar(10);

        Thorak.mostrarInfo();

        System.out.println("Le toca al listillo");

        
        
  }

 }
