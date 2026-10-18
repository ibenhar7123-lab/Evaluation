package cntrl;

public class Moto extends Vehicule {
    private int cylindree;

    public Moto(String immatriculation, String marque, double tarifJournalier, int cylindree) {
        super(immatriculation, marque, tarifJournalier);
        this.cylindree = cylindree;
    }

    
    public double calculerCout(int nbJours) {
        double cout = getTarifJournalier() * nbJours;
        if (nbJours >= 5) {
            cout = cout * 0.90; 
        }
        return cout;
    }
}
