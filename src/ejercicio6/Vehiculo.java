package ejercicio6;

public class Vehiculo {
	
	private String modelo;
	private double potencia;
	private boolean cRuedas;

	public Vehiculo(String modelo) {
		this.modelo = modelo;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	public boolean iscRuedas() {
		return cRuedas;
	}

	public void setcRuedas(boolean cRuedas) {
		this.cRuedas = cRuedas;
	}
	
	

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		
		String datosCoche;
		datosCoche = String.format("Vehículo: \nModelo=%s\nPotencia=%s\ncRuedas=%s", modelo, potencia, cRuedas);
		
		return datosCoche;
	}

	
}
