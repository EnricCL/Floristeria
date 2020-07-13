package packageFloristeria;

public class Decoracio extends Producte{

	String tipusMaterial;
	
	public Decoracio(String material, int preu) {
		super(preu);
		tipusMaterial=material;
		tipus="decoracio";
	}
	
	public String toString() {
		return "Decoració amb material: " + tipusMaterial + " i preu: " + preu;
	}

}
