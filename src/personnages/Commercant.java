package personnages;

public class Commercant extends Humain {
	public Commercant(String nom, int argent) {
		super(nom,"thé",argent);
	}
	
	public int seFaireExtorquer() {
		int argentAvant = super.getArgent();
		super.perdreArgent(super.getArgent());
		parler("J'ai tout perdu! Le monde est trop injuste...");
		return argentAvant;
	}
	
	public void recevoir(int argent) {
		super.gagnerArgent(argent);
		parler(argent+" sous! Je te remercie généreux donateur!");
	}
}
