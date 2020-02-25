package ejercicio7;

public class Producto {
	

	private Procesadores procesador;
	private String modelo;
	private float precio;
	private int stock;
	

	public Producto() {
		this("000-NNNN", Procesadores.INTEL, 0.0f, 0);
	}
	
	public Producto(String modelo, Procesadores procesadores, float precio, int stock) {
		setModelo(modelo);
		setProce(procesadores);;
		setPrecio(precio);
		setStock(stock);
	}
	

	String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		if(!modelo.matches("\\p{Digit}{3}-[A-ZÑ]{4}")) {
			throw new IllegalArgumentException("Introduzca el formato: 000-NNNN.");
		} 
		
		this.modelo = modelo;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		if (precio < 0) {
			throw new IllegalArgumentException("Introduce un valor mayor que 0");
		}
		
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		if (stock < 0 ) {
			throw new IllegalArgumentException("Introduzca un valor mayor que 0");
		}
		this.stock = stock;
	}
	
	public Procesadores getProcesador() {
		return procesador;
	}

	public void setProce(Procesadores procesador) {
		if (procesador == null) {
			throw new IllegalArgumentException("Ha introducido un valor nulo");
		}
		this.procesador = procesador;
	}
	

	public void disminuirStock() {
		if (stock <= 0) {
			throw new IllegalArgumentException("Introduce un valor mayor que 0");
		}
		
		stock -= 1;
	}

	@Override
	public String toString() {
		return String.format("Producto: Procesador=%s\nModelo=%s\nPrecio=%s\nStock=%s\n", procesador, modelo, precio,
				stock);
	}
	

}