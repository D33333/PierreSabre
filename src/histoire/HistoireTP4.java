package histoire;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP4 {
	public static void main(String[] args) {
		Ronin ronin = new Ronin("Roro","shochu",54);
		Yakuza yakuza = new Yakuza("Yaku Le Noir","whisky",45,"Warsong");
		ronin.provoquer(yakuza);
	}
}
