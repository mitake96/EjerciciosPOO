package ejercicio4;

import java.util.Scanner;

public class APP {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		ConsoleInput keyboard = new ConsoleInput(scanner);
		
		String nombre;
		String nombre_traducido;
		String actores;
		String director;
		Genero genero;
		Genero[] g = Genero.values();
		String resumen;
		int duracion;
		byte eleccion;
		DVDCine pelicula;
		
		System.out.println("Introduce el nombre de la pelicula: ");
		nombre = keyboard.readString();
		System.out.println("Introduce el nombre traducido de la pelicula: ");
		nombre_traducido = keyboard.readString();
		System.out.println("Introduce el nombre de los actores de la pelicula: ");
		actores = keyboard.readString();
		System.out.println("Introduce el nombre del director: ");
		director = keyboard.readString();
		
		System.out.println("¿De qué género es la película?");
		for (int i = 0; i < g.length; i++) {
			System.out.printf("%d. %s\n", 1+i, g[i]);
		}
		eleccion = keyboard.readByteInRangeInclusive((byte) 1, (byte) (g.length));
		genero = Genero.valueOf(g[eleccion-1].toString());
		
		System.out.println("Introduzca el resumen de la pelicula (si tiene) ");
		resumen = keyboard.readString();
		System.out.println("Introduzca la duracion (en minutos): ");
		duracion = keyboard.readInt();
		
		pelicula = new DVDCine(nombre, nombre_traducido, actores, director, genero, resumen, duracion);

		System.out.println("¿Es un thriller?");
		System.out.println(pelicula.esThriller() ? "Sí" : "No");
		
		System.out.println("¿Tiene resumen?");
		System.out.println(pelicula.tieneResumen() ? "Sí" : "No");
		
		System.out.println("¿Cuánto dura?");
		System.out.println(pelicula.muestraDuracion());
		
		System.out.println("Ahora mostraré un resumen completo con todos los datos: ");
		System.out.println(pelicula.toString());
	}

}
