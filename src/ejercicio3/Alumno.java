package ejercicio3;

public class Alumno {
	
	int num_matricula;
	String nombre;
	
	private double nota1, nota2;
	
	public Alumno() {
		this.num_matricula= 759196;
		this.nombre= "Nacho";
	}
	
	String getNombre() {
		return nombre;
	}
	
	int getMatricula() {
		return num_matricula;
	}
	
	public void ponNota(double nota1, double nota2) {
		this.nota1=nota1;
		this.nota2=nota2;
	}
	
	double getnota1() {
		return nota1;
	}
	
	double getnota2() {
		return nota2;
	}
	
	double dameMedia() {
		
		return (nota1 += nota2)/2;
		
	}
	
	public String toString() {
		return String.format("Nombre: %s%nMatrícula: %d%nNota1: %.1f%nNota2: %.1f%nMedia: %.1f", nombre, num_matricula, nota1, nota2, dameMedia());
	}

}
