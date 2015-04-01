package fr.iut.valence.td2d.projet.abalone;

/**Repr�sentation d'un plateau. 
 * 
 * @author blouinm et bouhassa
 * @version 1.0
 */
public class Plateau {
	public final static int TAILLE_PLATEAU = 9;
	private final Case[][] plateau;
	
	/**Cr�ation d'un plateau
	 * 
	 */
	public Plateau(){
		this.plateau = new Case[TAILLE_PLATEAU][TAILLE_PLATEAU];
		this.initialisationPlateau();
	}
	
	/**D�placer une boule.
	 * 
	 * @param depart la case de d�part
	 * @param arrivee la case d'arriv�e
	 */
	public void deplacerBoule(Case depart, Case arrivee){
		arrivee.poserBoule(depart.obtenirBoule());
		depart.enleverBoule();
	}
	
	/**Initialise un Plateau. 
	 * Rempli un plateau avec des cases
	 */
	private void initialisationPlateau(){
		for(int numeroDeLigne=0; numeroDeLigne < TAILLE_PLATEAU; numeroDeLigne++){
			for(int numeroDeColonne=0; numeroDeColonne < TAILLE_PLATEAU; numeroDeColonne++){
				this.plateau[numeroDeLigne][numeroDeColonne] = new Case(new Position(numeroDeLigne,numeroDeColonne));
			}
		}
	}
}
