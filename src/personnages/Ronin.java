package personnages;

public class Ronin extends Humain {
	private int honneur = 1;
	
	public Ronin(String nom, String boissonFav, int argent) {
		super(nom,boissonFav,argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int don = super.getArgent() / 10;
		super.perdreArgent(don);
		parler(beneficiaire.getNom() + " prend ces 6 sous.");
		beneficiaire.recevoir(don);
	}
}
