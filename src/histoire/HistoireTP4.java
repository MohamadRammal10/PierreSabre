package histoire;

import personnages.Humain;
import personnages.Commercant;
import personnages.Yakuza;
import personnages.Ronin;

public class HistoireTP4 {

	public static void main(String[] args) {
		/*
		Humain prof = new Humain("Prof", "kombucha", 54);
		prof.direBonjour();
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("un kimono", 50);
		*/
		
		/*
		Commercant marco = new Commercant("Marco", 10);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
		*/
		
		/*
		Commercant marco = new Commercant("Marco", 15);
		Yakuza leNoir = new Yakuza("Yaku Le Noir", "whisky", 30, "clan");
		leNoir.direBonjour();
		leNoir.extorquer(marco);
		*/
		
		/*
		Commercant marco = new Commercant("Marco", 15);
		Ronin roro = new Ronin("Roro", "shochu", 60);
		roro.direBonjour();
		roro.donner(marco);
		*/
		
		Ronin roro = new Ronin("Roro", "shochu", 54);
		Yakuza leNoir = new Yakuza("Yaku Le Noir", "whisky", 45, "Warsong");
		roro.provoquer(leNoir);
	}

}
