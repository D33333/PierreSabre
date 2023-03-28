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
	
	public void provoquer(Yakuza adversaire) {
		int force = honneur * 2;
		if (force >= adversaire.getReputation()) {
			parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
			parler("Je t'ai eu petit yakusa!");
			int gain = adversaire.perdre();
			super.gagnerArgent(gain);
			honneur += 1;
		} else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse en ont pris un coup.");
			adversaire.gagner(super.getArgent());
			honneur -= 1;
			super.perdreArgent(super.getArgent());
		}
	}
}
