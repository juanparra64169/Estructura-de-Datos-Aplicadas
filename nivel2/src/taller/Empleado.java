
package taller;

public class Empleado {
    String nombre, depto;
    int id;
    double salario;

    public Empleado(String n,int i,double s,String d){
        nombre=n; id=i; salario=s; depto=d;
    }

    public void aumentar(double p){
        salario+=salario*p/100;
    }

    public void mostrar(){
        System.out.println(nombre+" Salario: "+salario);
    }
}

