package packageFloristeria;

import java.util.Scanner;

/*Exercici
 * En una floristeria, que té un nom, tenim arbres, flors i decoració.
 * 
 * Cada arbre té una alçada
 * Les flors tenen un color
 * La decoració té un tipus de material: fusta o plàstic.
 * 
 * Tots tenen un preu.
 * 
 * Fer funcionalitats en un Main:
 * 		crearFloristeria
 * 		afegirArbre
 * 		afegirFlor
 * 		afegirDecoracio
 * 		stock: tots els arbre, flors i decoració que té la floristeria
 * 
 * EXEMPLE STOCK:
 * ARBRES:
 * TTTTTTT
 * FLORS:
 * YYYYYY
 * DECORACIÓ:
 * XXXXXXXX
 * 
 * @author Enric Comes
 */
public class MainFloristeria {

	public static void main(String[] args) {
		
		String paraula;
			
		Scanner entrada = new Scanner(System.in);	
			
		System.out.println("Escriu el nom de la Floristeria:");
		paraula = entrada.nextLine();
		
		//Es crea el menú d'interacció amb la Floristeria
		MenuFloristeria menuFloristeria = new MenuFloristeria (paraula);
		
		//S'executa el menu d'interacció
		menuFloristeria.menuFloristeria();
		
		entrada.close();
	}
	
	
}
