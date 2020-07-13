package packageFloristeria;

public class Arbre extends Producte{

	int alsada;
	
	public Arbre(int alsada, int preu) {
		super(preu);
		this.alsada = alsada;
		tipus="arbre";
	}
	
	public String toString() {
		return "Arbre amb alçada: " + alsada + " i preu: " + preu;
	}

}
