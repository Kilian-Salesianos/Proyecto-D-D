package net.salesianos.personaje.mago;

import net.salesianos.personaje.Personaje;

public class Mago extends Personaje {

    
    private String elemento;

    
    public Mago(String nombre, int nivel, String elemento) {
        super(nombre, nivel);
        this.elemento = elemento;
    }

    public void ataqueElemental() {
        gastarEnergia(25);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Nivel: " + getNivel());
        System.out.println("Elemento: " + elemento);
    }
}
