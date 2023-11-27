package personnages;

public class Commercant extends Humain {
	
	public Commercant(String nom, int argent) {
		super(nom, "the", argent);
	}
	
	public void recevoir(int argent) {
		System.out.println(parler() + argent + " sous ! Je te remercie genereux donateur!");
		this.argent += argent;
	}
	
	public int seFaireExtorquer() {
		int sommeExtorquee = argent;
		System.out.println(parler() + "J'ai tout perdu! Le monde est trop injuste...");
		argent = 0;
		return sommeExtorquee;
	}
}
