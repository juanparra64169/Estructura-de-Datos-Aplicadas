
package taller;

public class Ejercicios {

    public static void ejercicioEstudiante() {
        Estudiante e = new Estudiante("Juan", 20);
        e.agregarCalificacion(4);
        e.agregarCalificacion(5);
        e.mostrarInfo();
    }

    public static void ejercicioContactos() {
        Agenda a = new Agenda();
        a.agregar(new Contacto("Ana","123","a@mail.com"));
        a.listar();
    }

    public static void ejercicioCuenta() {
        CuentaBancaria c = new CuentaBancaria("Juan",1000);
        c.depositar(500);
        c.mostrar();
    }

    public static void ejercicioCarrito() {
        Carrito c = new Carrito();
        c.agregar(new Producto("Mouse",50,2));
        c.mostrar();
    }

    public static void ejercicioEmpleado() {
        Empleado e = new Empleado("Carlos",1,2000,"IT");
        e.aumentar(10);
        e.mostrar();
    }
}
