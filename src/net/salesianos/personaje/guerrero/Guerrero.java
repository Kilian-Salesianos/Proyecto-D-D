package net.salesianos.personaje.guerrero;

import net.salesianos.personaje.Personaje;

public class Guerrero extends Personaje {

    
    private String arma;

    
    public Guerrero(String nombre, int nivel, String arma) {
        super(nombre, nivel);
        this.arma = arma;
    }

    
    public void ataquePesado() {
        gastarEnergia(15);
    }

   
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Arma: " + arma);
    }
}