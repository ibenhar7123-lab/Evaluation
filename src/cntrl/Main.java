package cntrl;

public class Main {
    public static void main(String[] args) {
       
        Client c1 = new Client(1, "Alaoui", "Karim");
        Client c2 = new Client(2, "Bennani", "Sara");

       
        Voiture v1 = new Voiture("A-1234-1", "Dacia", 300, 5);
        Voiture v2 = new Voiture("B-5678-2", "Renault", 400, 7);
        Moto m1 = new Moto("C-9012-3", "Yamaha", 150, 125);

        Vehicule[] vehicules = { v1, v2, m1 };

        System.out.println("===== Liste des véhicules =====");
        for (Vehicule v : vehicules) {
            v.afficherDetails(); 
        }
        System.out.println();

       
        Location[] locations = new Location[3];
        locations[0] = new Location(c1, vehicules[0], 3);
        locations[1] = new Location(c2, vehicules[1], 2);
        locations[2] = new Location(c1, vehicules[2], 6);

        System.out.println("===== Récapitulatifs des locations =====");
        double total = 0;
        for (Location l : locations) {
            l.afficherRecapitulatif();
            total += l.calculerMontant();
        }

        System.out.println("Montant total de toutes les locations : " + total + " DH");
    }
}
