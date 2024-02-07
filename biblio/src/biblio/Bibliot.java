package biblio;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*ajouterLivre(Livre livre): void
• chercherLivreParTitre(String titre): Livre
• mettreAJourLivre(Livre livre): void
• supprimerLivre(Livre livre): void
• afficherLivres(): List<Livre>*/

public class Bibliot {
	
	List<Livre> livres;
	
	public void ajouteLivre(Livre livre) {
		
		livres.add(livre);
		
	}
	public Livre chercherLivreParTitre(String titre) {
		for(Livre lv :livres) {
			if(lv.getTitre().equals(titre)) {
				return lv;
			}
		}
		return null;
	}
	
	public void mettreAJourLivre(Livre livre) {
		Livre lvexist= chercherLivreParTitre(livre.getTitre());
		if(lvexist!=null) {
			lvexist.setAuteur(livre.getAuteur());
			lvexist.setAnnee(livre.getAnnee());
		}
		System.out.print("not exist");
	}
	
	public void supprimerLivre(Livre livre) {
		
		livres.remove(livre);
	}
	
	public List<Livre> afficherLivres() {
		return livres;
	}
	
	
	public void triLivre() {
	    Collections.sort(livres, new Comparator<Livre>() {
	        @Override
	        public int compare(Livre livre1, Livre livre2) {
	            return Integer.compare(livre1.getAnnee(), livre2.getAnnee());
	        }
	    });
	}
}
