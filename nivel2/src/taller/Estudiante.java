package taller;

import java.util.ArrayList;

public class Estudiante {
    String nombre;
    int edad;
    ArrayList<Double> notas = new ArrayList<>();

    public Estudiante(String n, int e) {
        nombre = n;
        edad = e;
    }

    public void agregarCalificacion(double n) {
        notas.add(n);
    }

    public double promedio() {
        double s = 0;
        for(double n: notas) s+=n;
        return notas.size()==0?0:s/notas.size();
    }

    public void mostrarInfo() {
        System.out.println(nombre + " Promedio: " + promedio());
    }
 
}
