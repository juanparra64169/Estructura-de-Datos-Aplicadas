
package taller;

import java.util.ArrayList;

public class Agenda {
    ArrayList<Contacto> lista = new ArrayList<>();

    public void agregar(Contacto c){
        lista.add(c);
    }

    public void listar(){
        for(Contacto c: lista){
            System.out.println(c.nombre + " - " + c.telefono);
        }
    }
}

