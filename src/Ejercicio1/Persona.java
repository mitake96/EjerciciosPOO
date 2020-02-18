package Ejercicio1;

public class Persona {
	
	private String nombre;
	private int edad;
	private float altura;
	private String ocupacion;
	private int sueldo;
	
	int getSueldo() {
		return sueldo;
	}
	
	void setSueldo(int sueldo) {
		this.sueldo=sueldo;
	}
	
	String getNombre() {
		return nombre;
	}
	
	void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	int getEdad() {
		return edad;
	}
	
	void setEdad(int edad) {
		this.edad=edad;
	}
	
	float getAltura() {
		return altura;
	}
	
	void setAltura(float altura) {
		this.altura=altura;
	}
	
	String getOcupacion() {
		return ocupacion;
	}
	
	void setOcupacion(String ocupacion) {
		this.ocupacion=ocupacion;
	}
	
	public Persona(String nombre, int edad, float altura, String ocupacion, int sueldo) {
		this.nombre=nombre;
		this.edad=edad;
		this.altura=altura;
		this.ocupacion=ocupacion;
		this.sueldo=sueldo;
	}
	
	public Persona() {
		this("Noelia",21,1.60f,"biologa",1800);
	}
	
	void sumarSueldo(Persona p) {
		sueldo+=p.sueldo;
	}
	
	void doblarSueldo (Persona p) {
		sumarSueldo(this);
	}
	
	public static void main(String[] args) {
		
		Persona p = new Persona();
		
		System.out.printf("Nombre: %s",p.getNombre());
		System.out.printf(" Edad: %d",p.getEdad());
		System.out.printf(" Altura: %.1f",p.getAltura());
		System.out.printf(" Ocupacion: %s",p.getOcupacion());
		p.sumarSueldo(p);
		p.doblarSueldo(p);
		System.out.printf(" Sueldo: %d",p.getSueldo());
		

		
		
		
	}
	
	
	
}