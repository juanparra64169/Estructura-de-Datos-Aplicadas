
package taller;

public class CuentaBancaria {
    String titular;
    double saldo;

    public CuentaBancaria(String t,double s){
        titular=t; saldo=s;
    }

    public void depositar(double m){
        saldo+=m;
    }

    public void mostrar(){
        System.out.println("Saldo: "+saldo);
    }
}

