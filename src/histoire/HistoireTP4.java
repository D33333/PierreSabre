package histoire;
import personnages.Commercant;
import personnages.Humain;

public class HistoireTP4 {
	public static void main(String[] args) {
		Commercant marchand = new Commercant("Marco",20);
		marchand.direBonjour();
		marchand.seFaireExtorquer();
		marchand.recevoir(15);
		marchand.boire();
	}
}
