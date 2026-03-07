package Problemas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion = -1; // valor inicial distinto de 0

		while (opcion != 0) {

		    mostrarMenu(); // mostramos el menú

		    opcion = leerEntero(); // pedimos la opción con validación

		    switch (opcion) {
		        case 1:
		            problemaA();
		            break;
		        case 2:
		            problemaB();
		            break;
		        case 3:
		        	problemaC();
		        	break;
		        case 4:
		        	problemaD();
		        	break;
		        case 0:
		            System.out.println("Saliendo...");
		            break;
		        default:
		            System.out.println("Opcion invalida");
		    }
		}

	}
public static void mostrarMenu() {
	System.out.println("===== MENU PRIMER PARCIAL=====");
    System.out.println("1. Problema A");
    System.out.println("2. Problema B");
    System.out.println("3. Problema C");
    System.out.println("4. Problema D");
    System.out.println("0. Salir");	
	}
public static void problemaA() {
	System.out.println("===== TABLA DE MULTIPLICAR =====");

    
    int numero = leerEntero();

    System.out.println("\nTabla del " + numero + ":");
    mostrarTabla(numero);
}
public static void mostrarTabla(int n) {
    int i = 1;

    while (i <= 12) {
        System.out.println(n + " x " + i + " = " + (n * i));
        i++;
    }
    }
public static void problemaB() {
	
}
public static void problemaC() {
	
}
public static void problemaD() {
	
}
public static int leerEntero() {
    Scanner sc = new Scanner(System.in);

    while (true) {
        try {
            System.out.print("Ingrese un numero entero: ");
            int numero = sc.nextInt();
            return numero; // si llega aquí, el número es válido
        } catch (Exception e) {
            System.out.println("Error: debe ingresar un numero entero valido.");
            sc.nextLine(); // limpia el buffer para evitar bucles infinitos
        }
    }
}


public static double leerDouble() {
    Scanner sc = new Scanner(System.in);

    while (true) {
        try {
            System.out.print("Ingrese un numero decimal: ");
            double numero = sc.nextDouble();
            return numero; // si llega aquí, el número es válido
        } catch (Exception e) {
            System.out.println("Error: debe ingresar un numero decimal valido.");
            sc.nextLine(); // limpia el buffer para evitar bucles infinitos
        }
    }
}
}