package ejercicio7;

public enum Procesadores {
	
	INTEL("8Gb"), AMD("4Gb");
	
	private String RAM;
	
	Procesadores(String ram) {
		this.RAM = ram;
	}
	
	public String getRam() {
		return RAM;
	}
}
