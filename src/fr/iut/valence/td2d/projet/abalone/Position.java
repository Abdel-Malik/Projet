package fr.iut.valence.td2d.projet.abalone;

/**Mod�lisation des positions.
 * Utilis� dans Case
 * @author blouinm et bouhassa
 * @version 1.0
 */
public class Position {
	private final int abscisse;
	private final int ordonnee;
	
	/**Cr�ation d'une position.
	 * 
	 * @param x = abscisse
	 * @param y = ordonn�e
	 */
	public Position(int x,int y){
		this.abscisse = x;
		this.ordonnee = y;
	}
	
	/**Renvoie la valeur de l'abscisse. 
	 * 
	 * @return l'abscisse de la position
	 */
	public int obtenirAbscisse(){
		return this.abscisse;
	}
	
	/**Renvoie la valeur de l'ordonn�e.
	 * 
	 * @return l'ordonn�e de la position
	 */
	public int obtenirOrdonnee(){
		return this.ordonnee;
	}
	
}
