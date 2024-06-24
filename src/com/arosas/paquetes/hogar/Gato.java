package com.arosas.paquetes.hogar;

class Gato { // Solo puede existir dentro del paquete 'hogar'. No puede salir al jardin
    private String color;

    public Gato (String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }
}
