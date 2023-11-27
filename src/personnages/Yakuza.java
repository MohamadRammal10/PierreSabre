package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation;
	
	public Yakuza(String nom, String boissonPrefere, int argent, String clan) {
		super(nom, boissonPrefere, argent);
		this.clan = clan;
		this.reputation = 0;
	}
	
	public int getReputation() {
		return reputation;
	}
	
	public void extorquer(Commercant victime) {
		System.out.println(parler() + "Tiens, tiens, ne serait-ce pas un faible marchand qui passe par la ?");
		System.out.println(parler() + victime.getNom() + ", si tu te tiens a la vie donne moi ta bourse !");
		gagnerArgent(victime.argent);
		reputation += 1;
		int sommeExtorquee = victime.seFaireExtorquer();
		System.out.println(parler() + "J'ai pique les " + sommeExtorquee + " sous de " + victime.getNom() + ". ce qui me fait " + argent + " dans ma poche. Hi ! Hi !");
	}
	
	public int perdre() {
		int argentPerdue = argent;
		argent = 0;
		if (reputation > 0) {
			reputation -= 1;
		}
		System.out.println(parler() + "J' ai perdu mon duel et mes " + argentPerdue + " sous, snif... J'ai deshonore le clan de " + clan + ".");
		return argentPerdue;
	}
	
	public void gagner(int gain) {
		argent += gain;
		reputation += 1;
		System.out.println(parler() + "Ce ronin pensait vraiment battre " + nom + " du clan " + clan + " ? Je l'ai depouille de ses " + gain + " sous.");
	}
}
