package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation;
	
	public Yakuza(String nom, String boissonPrefere, int argent, String clan) {
		super(nom, boissonPrefere, argent);
		this.clan = clan;
		this.reputation = 0;
	}
	
	public void extorquer(Commercant victime) {
		System.out.println(parler() + "Tiens, tiens, ne serait-ce pas un faible marchand qui passe par la ?");
		System.out.println(parler() + victime.getNom() + ", si tu te tiens a la vie donne moi ta bourse !");
		this.argent += victime.argent;
		reputation += 1;
		int sommeExtorquee = victime.seFaireExtorquer();
		System.out.println(parler() + "J'ai pique les " + sommeExtorquee + " sous de " + victime.getNom() + ". ce qui me fait " + argent + " dans ma poche. Hi ! Hi !");
	}
}
