package cntrl;
public class Voiture extends Vehicule {
    private int nbPlaces;

    public Voiture(String immatriculation, String marque, double tarifJournalier, int nbPlaces) {
        super(immatriculation, marque, tarifJournalier);
        this.nbPlaces = nbPlaces;
    }

   
    public double calculerCout(int nbJours) {
        double cout = getTarifJournalier() * nbJours;
        if (nbPlaces > 5) {
            cout += 50 * nbJours; 
        }
        return cout;
    }
}
