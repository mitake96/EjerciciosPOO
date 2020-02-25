package ejercicio6;

import java.util.Scanner;

import ejercicio4.ConsoleInput;

public class APP {

	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);		
		ConsoleInput keyboard = new ConsoleInput(scanner);
		Vehiculo coche[] = new Vehiculo[100];
		
		String modelo;
		double potencia;
		boolean traccion;
		int counter = 0;
		
		do {
		System.out.println("Introduzca el modelo de un vehiculo o escriba 'fin' si desea terminar el programa ");
		modelo = keyboard.readString();
		
		
			if (!modelo.equalsIgnoreCase("fin")) {
				coche[counter] = new Vehiculo(modelo);
				System.out.println("Introduce la potencia: ");
				potencia = keyboard.readDouble();
				coche[counter].setPotencia(potencia);
				System.out.println("Si el vehiculo tiene traccion a las cuatro ruedas, introduzca '1'");
				traccion = keyboard.readBooleanUsingInt(1);

				if (traccion) {
					coche[counter].setcRuedas(true);
				}

				counter++;
			} 
		} while (!modelo.equalsIgnoreCase("fin"));
		
		for (int i = 0; i < counter; i++) {
			System.out.println("Coche " + (i + 1));
			System.out.println(coche[i]);
		}
		
		

	}

}
