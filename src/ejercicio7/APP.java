package ejercicio7;

public class APP {
public static void main(String[] args) {
		

		Producto ordenador1 = new Producto();
		Producto ordenador2 = new Producto("998-RIZO", Procesadores.INTEL, 2100.36f, 5);
		

		System.out.println(ordenador1.toString());		
		System.out.println(ordenador2.toString());
		ordenador2.disminuirStock();
		System.out.println("Ordenadores actuales: " + ordenador2.getStock());
		
		
		
	}
}
