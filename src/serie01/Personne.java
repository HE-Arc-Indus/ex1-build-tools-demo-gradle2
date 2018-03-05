package serie01;

public class Personne {
	private String nom;
	private String prenom;
	
	public Personne(String nom, String prenom){
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public void setNom (String nom){
		this.nom = nom;
	}
	
	public String getNom(){
		return nom;
	}
	
	public void setPrenom (String prenom){
		this.prenom = prenom;
	}
	
	public String getPrenom(){
		return prenom;
	}
	
	public void sePresenter(){
		System.out.println("Bonjour, je m'appelle " + prenom +" "+ nom);
	}
	
}