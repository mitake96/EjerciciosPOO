package ejercicio1;


import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Persona p = new Persona();
		
		Persona p2 = new Persona();
		
		Scanner keyboard = new Scanner(System.in);
		
		ConsoleInput consola = new ConsoleInput(keyboard);
		
		System.out.println("Introduce un nombre: ");
		p.setNombre(consola.readString());
		System.out.println("Introduce una edad: ");
		p.setEdad(consola.readInt());
		System.out.println("Introduce una altura: ");
		p.setAltura(consola.readFloat());
		System.out.println("Introduce una ocupacion: ");
		p.setOcupacion(consola.readString());
		
		
		System.out.println("Persona 2: ");
		p2.setNombre("Guillermo");
		p2.setEdad(27);
		p2.setAltura(1.82f);
		p2.setOcupacion("Carcelero");
		
		System.out.println("Nombre: " + p2.getNombre());
		System.out.println("Edad: " + p2.getEdad());
		System.out.println("Altura: " + p2.getAltura());
		System.out.println("Ocupacion: " + p2.getOcupacion());
	}

}
