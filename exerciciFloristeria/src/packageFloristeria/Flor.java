package packageFloristeria;

public class Flor extends Producte{

	String color;
	
	public Flor(String color, int preu) {
		super(preu);
		this.color=color;
		tipus="flor";
		
	}
	
	public String toString() {
		return "Flor amb color: " + color + " i preu: " + preu;
	}

}
