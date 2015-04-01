package fr.iut.valence.td2d.projet.abalone;

/**Mod�lisation des boules. 
 * 
 * @author blouinm et bouhassa
 * @version 1.0
 */
public class Boule {
	private final Couleur laCouleur;
	
	/**Cr�ation d'une boule de couleur souhait�. 
	 * 
	 * @param laCouleurVoulue
	 */
	public Boule(Couleur laCouleurVoulue){
		this.laCouleur=laCouleurVoulue;
	}
	/**Renvoie la couleur de la boule. 
	 * 
	 * @return la couleur de la boule
	 */
	public Couleur obtenirCouleur(){
		return this.laCouleur;
	}

}
