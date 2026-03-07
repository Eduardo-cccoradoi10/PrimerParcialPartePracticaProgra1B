package Problemas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	 
	 static List<Double> calificaciones = new ArrayList<>();
	    
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
	Scanner scanner = new Scanner(System.in);
	int cont = 1;
	 while (cont <= 5) {
	        calificacion(scanner);
	        cont++;
	    }
	 calcularPromedioCalificaciones();
}
public static void calificacion(Scanner scanner) {
	

    System.out.print("Ingrese la calificación del estudiante: ");
    double calificacion;

    try {
        calificacion = Double.parseDouble(scanner.nextLine());
    } catch (NumberFormatException e) {
        System.out.println("Calificación inválida. Intente de nuevo.");
        return;
    }

    
    calificaciones.add(calificacion);

}
public static void calcularPromedioCalificaciones() {
	if (calificaciones.isEmpty()) {
        System.out.println("No hay calificaciones registradas.");
    } else {
        double suma = 0;

        for (double calificacion : calificaciones) {
            suma += calificacion;
        }

        double promedio = suma / calificaciones.size();
        System.out.println("El promedio de calificaciones es: " + promedio);
    }
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