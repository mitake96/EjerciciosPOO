package Ejercicio1;


import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Persona p = new Persona();
		
		Scanner keyboard = new Scanner(System.in);
		
		ConsoleInput consola = new ConsoleInput(keyboard);
		
		System.out.println("Introduce un nombre: ");
		p.setNombre(consola.readString());
		

	}

}
