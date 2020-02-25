package ejercicio5;

public class APP {

	public static void main(String[] args) {
		
		Alimento chocolatina;
		Alimento mazorca;
		
		chocolatina = new Alimento ("Chocolatina", 13, 31, 55, false, Contenido.ALTO, Contenido.MEDIO);
		mazorca = new Alimento ("Mazorca");
		
		
		mazorca.setEsAnimal(false);
		mazorca.setHidratos(51);
		mazorca.setLipidos(81);
		mazorca.setProteinas(96);
		mazorca.setMinerales(Contenido.MEDIO);
		mazorca.setVitaminas(Contenido.ALTO);
		
		System.out.println(chocolatina);		
		if (chocolatina.esDietetico()) {

			System.out.println(chocolatina.getNombre()+" es dietético");

		}

		else {
			System.out.println(chocolatina.getNombre() + " no es dietético");
		}

		System.out.println("El contenido energético de " + chocolatina.getNombre()+ " es "
				+ chocolatina.calculaContenidoEnergetico() + " kcal.");
		if (chocolatina.esRecomendableParaDeportistas()) {
			System.out.println("El alimento " + chocolatina.getNombre()+ " es recomendable para deportistas");
		} else {

			System.out.println("El alimento " + chocolatina.getNombre()+ " no es recomendable para deportistas");

		}
		
		System.out.println(mazorca);
		
		
		
		
		
		
		
		
	}
	
	

}
