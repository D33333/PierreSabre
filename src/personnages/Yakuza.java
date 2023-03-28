package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;
	
	public Yakuza(String nom, String boissonFav, int argent, String clan) {
		super(nom,boissonFav,argent);
		this.clan = clan;
	}
	
	public void extorquer(Commercant victime) {
		this.reputation += 1;
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom()+", si tu tiens à la vie donne moi ta bourse !");
		int argentGagne = victime.seFaireExtorquer();
		super.gagnerArgent(argentGagne);
		parler("J'ai piqué "+argentGagne+" sous de "+victime.getNom()+", ce qui me fait "+super.getArgent()+" sous dans ma poche. Hi! Hi!");
	}
}
