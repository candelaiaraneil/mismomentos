package com.example.mismomentos.modelos;

public class Momento {
    private int id;
    private String momentofav, descripcion;
    private int fecha;

    public Momento (){
        
    }
    public Momento(int id, String momentofav, String descripcion, int fecha) {
        this.id = id;
        this.momentofav = momentofav;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }
}
