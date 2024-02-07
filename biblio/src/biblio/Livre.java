package biblio;

public class Livre {
	 private int id;
	 private String titre;
	 private String auteur;
	 private int annee;
	 
	 
	public Livre() {
		
	}
	public Livre(int id, String titre, String auteur, int annee) {
		super();
		this.id = id;
		this.titre = titre;
		this.auteur = auteur;
		this.annee = annee;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	 
	 

}
