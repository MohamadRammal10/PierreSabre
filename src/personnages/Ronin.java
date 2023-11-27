package personnages;

public class Ronin extends Humain {
	private int honneur;
	
	public Ronin(String nom, String boissonPrefere, int argent) {
		super(nom, boissonPrefere, argent);
		this.honneur = 1;
	}
	
	public void donner(Commercant beneficiaire) {
		int sommeADonner = this.argent / 10;
		System.out.println(parler() + beneficiaire.getNom() + " prend ces " + sommeADonner + " sous.");
		beneficiaire.recevoir(sommeADonner);
		perdreArgent(sommeADonner);
	}
}
