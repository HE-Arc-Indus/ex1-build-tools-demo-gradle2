package serie01;

import serie01.Personne;

public class MesPersonnes{
	public static void main (String [ ] args){
		Personne p1 = new Personne("Paratte", "Normand");
		Personne p2 = new Personne("Heche", "Francis");
		
		p2.sePresenter();
		p1.sePresenter();
		
	}
	
}