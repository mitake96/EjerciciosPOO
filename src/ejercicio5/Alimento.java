package ejercicio5;

public class Alimento {

	
	private String nombre;
	private double lipidos;
	private double hidratos;
	private double proteinas;
	private boolean esAnimal;
	private Contenido vitaminas;
	private Contenido minerales;
	
	
	//Getters y setters
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getLipidos() {
		return lipidos;
	}

	public void setLipidos(double lipidos) {
		this.lipidos = lipidos;
	}

	public double getHidratos() {
		return hidratos;
	}

	public void setHidratos(double hidratos) {
		this.hidratos = hidratos;
	}

	public double getProteinas() {
		return proteinas;
	}

	public void setProteinas(double proteinas) {
		this.proteinas = proteinas;
	}

	public boolean isEsAnimal() {
		return esAnimal;
	}

	public void setEsAnimal(boolean esAnimal) {
		this.esAnimal = esAnimal;
	}

	public Contenido getVitaminas() {
		return vitaminas;
	}

	public void setVitaminas(Contenido vitaminas) {
		this.vitaminas = vitaminas;
	}

	public Contenido getMinerales() {
		return minerales;
	}

	public void setMinerales(Contenido minerales) {
		this.minerales = minerales;
	}

	public Alimento(String nombre) {
		this.nombre = nombre;
	}


	public Alimento(String nombre, double lipidos, double hidratos, double proteinas, boolean esAnimal,
			Contenido vitaminas, Contenido minerales) {
		
		this.nombre = nombre;
		this.lipidos = lipidos;
		this.hidratos = hidratos;
		this.proteinas = proteinas;
		this.esAnimal = esAnimal;
		this.vitaminas = vitaminas;
		this.minerales = minerales;
	}
	
	public boolean esDietetico(){
		
		if(lipidos < 20 && vitaminas != Contenido.BAJO) {
			
			return true;
			
		}
		
		else {
			return false;
		}
	
	
	}


	@Override
	public String toString() {
		return String.format(
				"Alimento [nombre=%s, lipidos=%s, hidratos=%s, proteinas=%s, esAnimal=%s, vitaminas=%s, minerales=%s]",
				nombre, lipidos, hidratos, proteinas, esAnimal, vitaminas, minerales);
	}

	

	public String calculaContenidoEnergetico() {
		
		double kcal;
		
		kcal = (lipidos/100*9.4) + (proteinas/100*5.3) + (hidratos/100*4.1);
		
		return String.format("%.4f", kcal);
	}
	
	public boolean esRecomendableParaDeportistas() {
		
		return ((proteinas >= 10 && proteinas <=15) && (lipidos >=30 && lipidos <=35) && (hidratos >= 55 && hidratos <= 65));
		
	}
	
	

}


