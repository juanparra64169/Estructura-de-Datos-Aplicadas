package src;


import java.util.Scanner;

import taller.Ejercicios;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int op;

        do {
            System.out.println("\n===== MENÚ =====");
            System.out.println("6. Estudiante");
            System.out.println("7. Contactos");
            System.out.println("8. Cuenta");
            System.out.println("9. Carrito");
            System.out.println("10. Empleado");
            System.out.println("0. Salir");

            op = sc.nextInt();

            switch (op) {
                case 6: Ejercicios.ejercicioEstudiante(); break;
                case 7: Ejercicios.ejercicioContactos(); break;
                case 8: Ejercicios.ejercicioCuenta(); break;
                case 9: Ejercicios.ejercicioCarrito(); break;
                case 10:Ejercicios.ejercicioEmpleado(); break;
            }

        } while (op != 0);
    }
}

