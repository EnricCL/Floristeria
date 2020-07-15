package packageFloristeria;

import java.util.Scanner;

public class MenuFloristeria {

	String nom;

	public MenuFloristeria(String nom) {
		this.nom = nom;
	}

	public void menuFloristeria() {
		
		String opcio, dada1,dada2;	
		
		boolean menu = true;
		
		Scanner entrada = new Scanner(System.in);
		
		Floristeria floristeria = new Floristeria();
		floristeria.crearFloristeria(nom);
		
		while(menu) {
			System.out.println("Floristeria "+ nom + " | Què vols fer?"
								+ "\n 1: Afegir un arbre."
								+ "\n 2: Afegir una flor."
								+ "\n 3: Afegir una decoració."
								+ "\n 4: Mostrar l'estoc."
								+ "\n 5: Sortir."
								);
			opcio = entrada.nextLine();
			if(esNumeric(opcio)) {
				
				//Si es vol afegir un arbre
				if(opcio.equals("1")) {
					System.out.println("Per a crear un arbre, introdueix l'alçada:");
					dada1=entrada.nextLine();
					if(esNumeric(dada1)) {
						System.out.println("Introdueix un preu:");
						dada2=entrada.nextLine();
						if(esNumeric(dada2)) {
							floristeria.afegirArbre(Integer.parseInt(dada1), Integer.parseInt(dada2));
							System.out.println("Arbre d'alçada "+dada1+" i preu "+dada2+" introduït!");
						}else {
							System.out.println("Dada incorrecte.");
						}
					}else {
						System.out.println("Dada incorrecte.");
					}
				}
				
				//Si es vol afegir una flor
				if(opcio.equals("2")) {
					System.out.println("Per a crear una flor, introdueix el color:");
					dada1=entrada.nextLine();
					System.out.println("Introdueix un preu:");
					dada2=entrada.nextLine();
					if(esNumeric(dada2)) {
						floristeria.afegirFlor(dada1, Integer.parseInt(dada2));
						System.out.println("Flor de color "+dada1+" i preu "+dada2+" introduït!");
					}else {
						System.out.println("Dada incorrecte.");
					}
				}
				
				//Si es vol afegir una decoracio
				if(opcio.equals("3")) {
					System.out.println("Per a crear una decoració, introdueix el material (fusta o plàstic):");
					dada1=entrada.nextLine();
					if(dada1.equals("fusta")||dada1.equals("plàstic")) {
						System.out.println("Introdueix un preu:");
						dada2=entrada.nextLine();
						if(esNumeric(dada2)) {
							floristeria.afegirDecoracio(dada1, Integer.parseInt(dada2));
							System.out.println("Flor de material "+dada1+" i preu "+dada2+" introduït!");
						}else {
							System.out.println("Dada incorrecte.");
						}
					}else {
						System.out.println("Dada incorrecte.");
					}
				}
				
				//Si es vol mostrar l'estoc
				if(opcio.equals("4")) {
					System.out.println(floristeria.stock());
				}
				
				if(opcio.equals("5")) {
					System.out.println("Programa finalitzat.");
					System.out.println("Adéu!");
					entrada.close();
					System.exit(0);
				}
				
			}else {
				System.out.println("Dada incorrecte, torna a seleccionar una opció correcte."); 
			}
			
		}
		
		entrada.close();
		
	}
	
	/*
	 * Mètode per veure si l'String és un número o no
	 * @param String a comprobar
	 * @return retorna booleà segons si deixa fer càsting o salta l'excepció
	 */
	public static boolean esNumeric(String strNum) {
	    if (strNum == null) {
	        return false;
	    }
	    try {
	        @SuppressWarnings("unused")
			int i = Integer.parseInt(strNum);
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	    return true;
	}
}
