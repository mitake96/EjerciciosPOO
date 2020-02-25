package ejercicio4;

public class DVDCine {
	
<<<<<<< Updated upstream
	private String nombre;
	private String nombre_traducido;
	private Genero genero;
	private String resumen;
	private int duracion;
	private String actores;
	private String director;

	public String getActores() {
		return actores;
	}


	public void setActores(String actores) {
		this.actores = actores;
	}


	public String getDirector() {
		return director;
	}


	public void setDirector(String director) {
		this.director = director;
	}


	public String getResumen() {
		return resumen;
	}


	public void setResumen(String resumen) {
		this.resumen = resumen;
	}


	public int getDuracion() {
		return duracion;
	}


	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}


	public DVDCine(String nombre, String nombre_traducido, String actores, String director, Genero genero, String resumen, int duracion) {
		
		this.nombre=nombre;
		this.nombre_traducido=nombre_traducido;	
		this.actores = actores;
		this.director = director;
		this.genero = genero;
		this.resumen = resumen; 
		this.duracion = duracion;
		
	}
	

	// Getter y setters
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getNombre_traducido() {
		return nombre_traducido;
	}


	public void setNombre_traducido(String nombre_traducido) {
		this.nombre_traducido = nombre_traducido;
	}
	
	public Genero getGenero() {
		return genero;
	}
	
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	// Métodos
	
	public boolean esThriller() {
		return (genero == Genero.Thriller);
	}
	
	public boolean tieneResumen() {
		return (resumen != null) && (resumen.length() != 0);
	}
	
	public String muestraDuracion() {
		return String.format("%d min", duracion);
	}
	
	public String toString() {
		return String.format("Nombre %s\nNombre traducido: %s\nNombre director:  %s\nActores: %s\nGenero: %s\nDuracion: %s\nResumen: %s\n", getNombre(), getNombre_traducido(), getDirector(), getActores(), getGenero(), getDuracion(), tieneResumen() ? ("Resumen: " + resumen): "" );
	}
=======
	
	String nombre;
	String nombre_traducido;

	public DVDCine(String nombre, String nombre_traducido) {	
		
		
		// TODO Auto-generated constructor stub
	}

>>>>>>> Stashed changes
}
