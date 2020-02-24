package ejercicio5;

public enum Contenido{
	ALTO("A"), MEDIO("M"), BAJO("B");
	
	private String cantidad;

	Contenido(String ammount) {

		this.cantidad = ammount;

	}

	String getAmmount() {
		return cantidad;
	}

}