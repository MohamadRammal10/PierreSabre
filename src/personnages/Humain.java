package personnages;

public class Humain {
	protected String nom;
	private String boissonPrefere;
	protected int argent;
	
	
	public Humain(String nom, String boissonPrefere, int argent) {
		this.nom = nom;
		this.boissonPrefere = boissonPrefere;
		this.argent = argent;
	}


	public String getNom() {
		return nom;
	}


	public int getArgent() {
		return argent;
	}
	
	protected String parler() {
		return "(" + nom + ") - ";
	}
	
	public void direBonjour() {
		System.out.println(parler() + "Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonPrefere + ".");
	}
	
	public void boire() {
		System.out.println(parler() + "Mmmm, un bon verre de " + boissonPrefere + " ! GLOUPS !");
	}
	
	protected void gagnerArgent(int gain) {
		argent += gain;
	}
	
	protected void perdreArgent(int perte) {
		argent -= perte;
	}
	
	public void acheter(String bien, int prix) {
		if (prix > argent) {
			System.out.println(parler() + "Je n'ai plus que " + argent + " sous en poche. Je ne peux meme pas m'offrir un " + bien + " a " + prix + " sous.");
		}
		else {
			System.out.println(parler() + "J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " a " + prix + " sous");
			perdreArgent(prix);
		}
	}
}
