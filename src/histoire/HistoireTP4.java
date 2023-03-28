package histoire;
import personnages.Ronin;
import personnages.Commercant;

public class HistoireTP4 {
	public static void main(String[] args) {
		Ronin ronin = new Ronin("Roro","shochu",60);
		Commercant marchand = new Commercant("Marco",15);
		ronin.direBonjour();
		ronin.donner(marchand);
	}
}
