package personnages;

import java.util.Random;

public class Traitre extends Samourai{
	private int niveauTraitrise = 0;
	
	public Traitre(String seigneur, String nom, String boissonFav, int argent) {
		super(seigneur,nom,boissonFav,argent);
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		this.parler("Mais je suis un traître et mon niveau de traîtrise est: "+niveauTraitrise+". Chut!");
	}
	
	public void ranconner(Commercant commercant) {
		if (niveauTraitrise < 3){
			int argentRanconner = commercant.getArgent() * 2/10;
			commercant.perdreArgent(argentRanconner);
			this.gagnerArgent(argentRanconner);
			niveauTraitrise++;
			this.parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer ! Donne-moi " + argentRanconner + " sous ou gare à toi !");
			commercant.parler("Tout de suite grand "+this.getNom()+".");
		} else {
			this.parler("Mince je ne peux plus rançonner personne sinon un samouraï risque de me démasquer !");
		}
	}
	
	public void faireLeGentil() {
		if (nbConnaissance < 1) {
			parler("Je ne peux faire ami ami avec personne car je ne connais personne ! Snif.");
		} else {
			Random random = new Random();
			Humain randomH = super.memoire[random.nextInt(super.nbConnaissance)];
			int don = getArgent() * 1/20;
			String nomAmi = randomH.getNom();
			parler("Il faut absolument remonter ma cote de confiance. Je vais faire ami ami avec "+ nomAmi + ".");
			parler("Bonjour l'ami ! "+"Je voudrais vous aider en vous donnant "+ don + " sous.");
			randomH.gagnerArgent(don);
			perdreArgent(don);
			String nom = getNom();
			randomH.parler("Merci " + nom + ". Vous êtes quelqu'un de bien.");
			if (niveauTraitrise > 1) {
				niveauTraitrise--;
			}
		}
	}
}
