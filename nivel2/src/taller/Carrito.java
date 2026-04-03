
package taller;

import java.util.ArrayList;

public class Carrito {
    ArrayList<Producto> lista = new ArrayList<>();

    public void agregar(Producto p){
        lista.add(p);
    }

    public void mostrar(){
        double total=0;
        for(Producto p: lista){
            total+=p.precio*p.cantidad;
        }
        System.out.println("Total: "+total);
    }
}
