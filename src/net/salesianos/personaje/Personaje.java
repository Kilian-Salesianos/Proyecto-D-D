package net.salesianos.personaje;

public class Personaje {
    private String nombre;
    private int nivel;
    private int energia;


public Personaje(String nombre, int nivel) {
    this.nombre = nombre;
    this.nivel = nivel;
    this.energia = 100;
}

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getEnergia() {
        return energia;
    }

    public void setNivel(int nivel) {
        if (nivel > 0) {
            this.nivel = nivel;
        }
    }

    public void setEnergia(int energia) {
        if (energia >= 0 && energia <= 100) {
            this.energia = energia;
        }
    }

  
    
}
