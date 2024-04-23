package Persistencia;

import P1.Pieza;

public class Main {
    public static void main(String[] args) {
        String rutaArchivo = "piezas.json";
        Pieza[] piezas = CargarPiezas.desdeJSON(rutaArchivo);

        if (piezas != null) {
            
            for (Pieza pieza : piezas) {
                System.out.println(pieza);
            }
        }
    }
    }
