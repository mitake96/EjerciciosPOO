package ejercicio2;

public class Visibilidad {

	
	private int mismaclase = 15;
	private int mismopaquete;
	private int mismopaquete2;
	private int otropaquete;
	
	
	public int getMismaclase() {
		return mismaclase;
	}
	
	public void setMismaclase(int mismaclase) {
		this.mismaclase = mismaclase;
	}
	
	public int getMismopaquete() {
		return mismopaquete;
	}
	
	public void setMismopaquete(int mismopaquete) {
		 this.mismopaquete = mismopaquete;
	}
	
	public int getMismopaquete2() {
		return mismopaquete2;
	}
	
	public void setMismopaquete2(int mismopaquete2) {
		this.mismopaquete2 = mismopaquete2;
	}
	
	public int getOtropaquete() {
		return otropaquete;
	}
	
	public void setOtropaquete(int otropaquete) {
		this.otropaquete=otropaquete;
	}
	
	public static void main(String[] args) {
		
		Visibilidad vis = new Visibilidad();
		
		System.out.println(vis.getMismaclase());
		
	}
	
}
