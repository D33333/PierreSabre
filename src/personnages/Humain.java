package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int argent;
	protected int nbConnaissance = 0;
	protected Humain[] memoire = new Humain[30];
	
	public Humain(String nom, String boissonFav, int argent) {
		this.nom = nom;
		this.boissonFavorite = boissonFav;
		this.argent = argent;
	}
	
	public String getNom() {
		return nom;
	}
	public int getArgent() {
		return argent;
	}
	
	public void setArgent(int montant) {
		this.argent = montant;
	}
	
	protected void gagnerArgent(int gain) {
		this.argent += gain;
	}
	
	protected void perdreArgent(int perte) {
		this.argent -= perte;
	}
	
	protected void parler(String texte) {
		System.out.println('(' + nom + ") - " + texte);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle "+nom+" et j'aime boire du "+boissonFavorite+".");
	}
	
	public void boire() {
		parler("Mmm, un bon verre de "+boissonFavorite+" ! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		if (prix <= argent) {
			parler("J'ai "+argent+" sous en poche. Je vais pouvoir m'offrir un "+bien+" à "+prix+" sous.");
			perdreArgent(prix);
		} else {
			parler("Je n'ai plus que "+argent+" sous en poche. Je ne peux même pas m'offrir un "+bien+" à "+prix+" sous.");
		}
	}
	
	public void faireConnaissanceAvec(Humain autreHumain) {
		this.direBonjour();
		autreHumain.repondre(this);
		memoriser(autreHumain);
	}

	private void repondre(Humain humain) {
		this.direBonjour();
		this.memoriser(humain);
	}

	private void memoriser(Humain humain) {
		for(int i = 29; i>0; i--) {
			memoire[i] = memoire[i-1];
		} //le 1er élément est libre
		memoire[0] = humain;
		if (nbConnaissance < 30){
			nbConnaissance++;
		}
	}
	
	public void listerConnaissance() {
		String connaissances = "";
		int taille_mem = memoire.length;
		connaissances = memoire[0].getNom();
		int i = 1;
		while ((i < taille_mem) && (memoire[i] != null)) {
				connaissances = memoire[i].getNom() + ", " + connaissances;
			i++;
		}
		this.parler("Je connais beaucoup de monde dont : "+connaissances);
	}
}
