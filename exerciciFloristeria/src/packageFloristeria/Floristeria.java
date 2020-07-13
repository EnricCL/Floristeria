package packageFloristeria;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Floristeria {
	
	String nom;
	
	List <Producte> productes;
	
	Arbre arbre;
	Flor flor;
	Decoracio decoracio;
	
	String color, material;
	int alsada, preu;
	
	String estoc, classe;
	
	List <Arbre> arbres;
	List <Flor> flors;
	List <Decoracio> decoracions;

	/*
	 * Mètode per a crear floristeries
	 * @param String amb el nom de la floristeria
	 * @return 
	 */
	public void crearFloristeria(String nom) {
		this.nom = nom;
		productes = new ArrayList<>();
	}
	
	/**
	 * Per a afegir un arbre a la llista de productes
	 * @param alsada metres d'alçada de l'arbre
	 * @param preu de l'arbre
	 */
	public void afegirArbre(int alsada, int preu) {
		this.alsada = alsada;
		this.preu = preu;
		arbre = new Arbre(alsada, preu);
		productes.add(arbre);
	}
	
	/**
	 * Per a afegir flors a la llista de productes
	 * @param color de la flor
	 * @param preu de la flor
	 */
	public void afegirFlor(String color, int preu) {
		this.color = color;
		this.preu = preu;
		flor = new Flor(color, preu);
		productes.add(flor);
	}
	
	/**
	 * Per a afegir una decoració a la llista de productes
	 * @param material de la decoració, ha de ser fusta o plàstic
	 * @param preu de la decoració
	 */
	public void afegirDecoracio(String material, int preu) {
		this.material = material;
		this.preu = preu;
		decoracio = new Decoracio(material, preu);
		productes.add(decoracio);
	}
	
	/**
	 * Mètode per a mostrar l'estoc
	 * @return
	 */
	public String stock() {
		
		//Es fan 3 llistes per recollir els productes i mostrar-los en l'ordre que es demana
		arbres = new ArrayList<>();
		flors = new ArrayList<>();
		decoracions = new ArrayList<>();
		
		//S'afegeix cada producte a la llista del tipus al que correspon
		for(int i=0; i<productes.size(); i++) {
			if(productes.get(i).tipus == "arbre") {
				Arbre arbrebuit =  (Arbre)productes.get(i);
				arbres.add(arbrebuit);
			}
			else if(productes.get(i).tipus == "flor") {
				Flor florbuit = (Flor)productes.get(i);
				flors.add(florbuit);
			}
			else if (productes.get(i).tipus == "decoracio") {
				Decoracio decoraciobuit = (Decoracio)productes.get(i);
				decoracions.add(decoraciobuit);
			}
		}
		
		//Mostrar llistat amb el format demanat
		Iterator<Arbre> iteArbre = arbres.iterator();
		estoc="ARBRES:\n";
		while (iteArbre.hasNext()) {
			Arbre a = (Arbre) iteArbre.next();
			estoc += a.toString()+"\n";
		}
		
		Iterator<Flor> iteFlor = flors.iterator();
		estoc+="\nFLORS:\n";
		while (iteFlor.hasNext()) {
			Flor f = (Flor) iteFlor.next();
			estoc += f.toString()+"\n";
		}
		
		Iterator<Decoracio> iteDeco = decoracions.iterator();
		estoc+="\nDECORACIONS:\n";
		while (iteDeco.hasNext()) {
			Decoracio d = (Decoracio) iteDeco.next();
			estoc += d.toString()+"\n";
		}
		
		return estoc;
	}

}
