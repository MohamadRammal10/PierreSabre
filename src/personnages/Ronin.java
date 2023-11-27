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
	
	public void provoquer(Yakuza adversaire) {
		System.out.println(parler() + "Je t'ai retrouve vermine, tu vas payer pour ce que tu as fait a ce pauvre marchand!");
		int force = honneur * 2;
		if (force >= adversaire.getReputation()) {
			argent += adversaire.getArgent();
			honneur += 1;
			System.out.println(parler() + "Je t'ai eu petit yakusa!");
			adversaire.perdre();
		}
		else {
			if (honneur > 1) {
				honneur -= 1;
			}
			System.out.println(parler() + "J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			adversaire.gagner(argent);
			argent = 0;
		}
	}
}
