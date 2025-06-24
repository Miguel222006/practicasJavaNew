package Practica;

import java.util.Scanner;

public class practicaScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Ingrese su nombre: ");
		String nombre = entrada.nextLine();
		
		System.out.println("Ingrese su edad: ");
		int edad = entrada.nextInt();
		
		System.out.println("Ingrese su direccion: ");
		entrada.nextLine();
		String direccion = entrada.nextLine();
		
		System.out.println("Nombre: "+nombre);
		System.out.println("Edad: "+edad);
		System.out.println("Direccion: "+direccion);
		
		entrada.close();
	}

}
