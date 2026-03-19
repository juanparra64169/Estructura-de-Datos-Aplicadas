package funcion;

import java.util.*;

public class Funciones {

    static Scanner sc = new Scanner(System.in);

    // ================= MENU PRINCIPAL =================
    public static void menuPrincipal() {
        int opcion;

        do {
            System.out.println("\n*** MENU PRINCIPAL ***");
            System.out.println("1. Calculadora");
            System.out.println("2. Validador de Numeros");
            System.out.println("3. Manipulacion de Cadenas");
            System.out.println("4. Operaciones con Listas");
            System.out.println("5. Conversor de Unidades");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    menuCalculadora();
                    break;
                case 2:
                    menuValidador();
                    break;
                case 3:
                    menuCadenas();
                    break;
                case 4:
                    menuListas();
                    break;
                case 5:
                    menuConversor();
                    break;
                case 0:
                    System.out.println("Programa finalizado");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }

        } while (opcion != 0);
    }

    // ================= CALCULADORA =================
    public static void menuCalculadora() {
        int op;
        do {
            System.out.println("\n--- CALCULADORA ---");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Potencia");
            System.out.println("6. Raíz cuadrada");
            System.out.println("0. Volver");
            System.out.print("Opción: ");

            op = sc.nextInt();

            double a, b;

            switch (op) {
                case 1:
                    System.out.print("Ingrese dos números: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println("Resultado: " + (a + b));
                    break;

                case 2:
                    System.out.print("Ingrese dos números: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println("Resultado: " + (a - b));
                    break;

                case 3:
                    System.out.print("Ingrese dos números: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println("Resultado: " + (a * b));
                    break;

                case 4:
                    System.out.print("Ingrese dos números: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    if (b == 0) {
                        System.out.println("Error: No se puede dividir por cero");
                    } else {
                        System.out.println("Resultado: " + (a / b));
                    }
                    break;

                case 5:
                    System.out.print("Base y exponente: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println("Resultado: " + Math.pow(a, b));
                    break;

                case 6:
                    System.out.print("Número: ");
                    a = sc.nextDouble();
                    if (a < 0) {
                        System.out.println("Error: Raíz de número negativo");
                    } else {
                        System.out.println("Resultado: " + Math.sqrt(a));
                    }
                    break;
            }

        } while (op != 0);
    }

    // ================= VALIDADOR =================
    public static void menuValidador() {
        int op, num;

        do {
            System.out.println("\n--- VALIDADOR ---");
            System.out.println("1. Par o Impar");
            System.out.println("2. Primo");
            System.out.println("3. Perfecto");
            System.out.println("4. Palíndromo");
            System.out.println("0. Volver");
            System.out.print("Opción: ");

            op = sc.nextInt();

            if (op != 0) {
                System.out.print("Ingrese número: ");
                num = sc.nextInt();

                switch (op) {
                    case 1:
                        System.out.println(num % 2 == 0 ? "Par" : "Impar");
                        break;

                    case 2:
                        boolean primo = true;
                        if (num <= 1) primo = false;
                        for (int i = 2; i < num; i++) {
                            if (num % i == 0) {
                                primo = false;
                                break;
                            }
                        }
                        System.out.println(primo ? "Es primo" : "No es primo");
                        break;

                    case 3:
                        int suma = 0;
                        for (int i = 1; i < num; i++) {
                            if (num % i == 0) suma += i;
                        }
                        System.out.println(suma == num ? "Perfecto" : "No es perfecto");
                        break;

                    case 4:
                        int original = num, invertido = 0;
                        while (num > 0) {
                            invertido = invertido * 10 + num % 10;
                            num /= 10;
                        }
                        System.out.println(original == invertido ? "Palíndromo" : "No es palíndromo");
                        break;
                }
            }

        } while (op != 0);
    }

    // ================= CADENAS =================
    public static void menuCadenas() {
        int op;
        sc.nextLine();

        do {
            System.out.println("\n--- CADENAS ---");
            System.out.println("1. Contar vocales y consonantes");
            System.out.println("2. Invertir cadena");
            System.out.println("3. Palíndromo");
            System.out.println("4. Contar palabras");
            System.out.println("0. Volver");
            System.out.print("Opción: ");

            op = sc.nextInt();
            sc.nextLine();

            if (op != 0) {
                System.out.print("Ingrese texto: ");
                String texto = sc.nextLine().toLowerCase();

                switch (op) {
                    case 1:
                        int vocales = 0, consonantes = 0;
                        for (char c : texto.toCharArray()) {
                            if ("aeiou".indexOf(c) != -1) vocales++;
                            else if (Character.isLetter(c)) consonantes++;
                        }
                        System.out.println("Vocales: " + vocales + ", Consonantes: " + consonantes);
                        break;

                    case 2:
                        System.out.println("Invertida: " + new StringBuilder(texto).reverse());
                        break;

                    case 3:
                        String inv = new StringBuilder(texto).reverse().toString();
                        System.out.println(texto.equals(inv) ? "Es palíndromo" : "No es palíndromo");
                        break;

                    case 4:
                        String[] palabras = texto.trim().split("\\s+");
                        System.out.println("Palabras: " + palabras.length);
                        break;
                }
            }

        } while (op != 0);
    }

    // ================= LISTAS =================
    public static void menuListas() {
        int op;

        do {
            System.out.println("\n--- LISTAS ---");
            System.out.println("1. Mayor y menor");
            System.out.println("2. Promedio");
            System.out.println("3. Eliminar duplicados");
            System.out.println("4. Ordenar (Bubble Sort)");
            System.out.println("0. Volver");
            System.out.print("Opción: ");

            op = sc.nextInt();

            if (op != 0) {
                System.out.print("Cantidad de elementos: ");
                int n = sc.nextInt();
                int[] arr = new int[n];

                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }

                switch (op) {
                    case 1:
                        int max = arr[0], min = arr[0];
                        for (int num : arr) {
                            if (num > max) max = num;
                            if (num < min) min = num;
                        }
                        System.out.println("Mayor: " + max + ", Menor: " + min);
                        break;

                    case 2:
                        double suma = 0;
                        for (int num : arr) suma += num;
                        System.out.println("Promedio: " + (suma / n));
                        break;

                    case 3:
                        Set<Integer> set = new HashSet<>();
                        for (int num : arr) set.add(num);
                        System.out.println("Sin duplicados: " + set);
                        break;

                    case 4:
                        for (int i = 0; i < n - 1; i++) {
                            for (int j = 0; j < n - i - 1; j++) {
                                if (arr[j] > arr[j + 1]) {
                                    int temp = arr[j];
                                    arr[j] = arr[j + 1];
                                    arr[j + 1] = temp;
                                }
                            }
                        }
                        System.out.println("Ordenado: " + Arrays.toString(arr));
                        break;
                }
            }

        } while (op != 0);
    }

    // ================= CONVERSOR =================
    public static void menuConversor() {
        int op;

        do {
            System.out.println("\n--- CONVERSOR ---");
            System.out.println("1. Temperatura");
            System.out.println("2. Longitud");
            System.out.println("3. Peso");
            System.out.println("4. Tiempo");
            System.out.println("0. Volver");
            System.out.print("Opción: ");

            op = sc.nextInt();

            double valor;

            switch (op) {
                case 1:
                    System.out.print("Celsius: ");
                    valor = sc.nextDouble();
                    System.out.println("Fahrenheit: " + (valor * 9/5 + 32));
                    System.out.println("Kelvin: " + (valor + 273.15));
                    break;

                case 2:
                    System.out.print("Metros: ");
                    valor = sc.nextDouble();
                    System.out.println("Km: " + (valor / 1000));
                    System.out.println("Millas: " + (valor * 0.000621371));
                    break;

                case 3:
                    System.out.print("Kg: ");
                    valor = sc.nextDouble();
                    System.out.println("Libras: " + (valor * 2.20462));
                    System.out.println("Onzas: " + (valor * 35.274));
                    break;

                case 4:
                    System.out.print("Segundos: ");
                    valor = sc.nextDouble();
                    System.out.println("Minutos: " + (valor / 60));
                    System.out.println("Horas: " + (valor / 3600));
                    break;
            }

        } while (op != 0);
    }
}