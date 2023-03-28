package histoire;
import personnages.Yakuza;
import personnages.Commercant;

public class HistoireTP4 {
	public static void main(String[] args) {
		Yakuza yakuza = new Yakuza("Yaku Le Noir","whisky",30,"Warsong");
		Commercant marchand = new Commercant("Marco",15);
		yakuza.direBonjour();
		yakuza.extorquer(marchand);
	}
}
