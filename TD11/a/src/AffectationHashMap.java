import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AffectationHashMap {
    import java.util.HashMap;
import java.util.Map;

    public class AffectationHashMap {

        private Map<String, String> affectations;
        public AffectationHashMap() {
            this.affectations = new TreeMap<>();  // Utilisation de TreeMap pour le tri
        }
        public TreeMap<Employe, Departement> trierMap() {
            return new TreeMap<>(affectations);
        }

        // Const
        public AffectationHashMap() {
            this.affectations = new HashMap<>();
        }


        public void affecterEmploye(String employe, String departement) {

            if (affectations.containsKey(employe)) {
                System.out.println("Erreur : L'employé est déjà affecté à un département.");
            } else {

                affectations.put(employe, departement);
                System.out.println("Affectation réussie : " + employe + " est affecté au département " + departement);
            }
        }

        public String obtenirDepartement(String employe) {
            // Retourner le département de l'employé
            return affectations.get(employe);
        }

        public void ajouterEmployeDepartement(Employe employe, Departement departement) {


            affectations.put(employe, departement);
            System.out.println("Affect réussie : " + employe.getNom() + " est affecte au déparmt " + departement.getNom());
        }
    }

    public void afficherEmployesEtDepartements() {
        System.out.println("Liste employés et départements :");
        for (Map.Entry<Employe, Departement> entry : affectations.entrySet()) {
            System.out.println(entry.getKey().getNom() + " -> " + entry.getValue().getNom());
        }
    }

    public void supprimerEmploye(Employe employe) {
        // Supprimer l'employé de la collection
        if (affectations.containsKey(employe)) {
            affectations.remove(employe);
            System.out.println("Suppress réussie : " + employe.getNom());
        } else {
            System.out.println("Erreur");
        }
    }

    public void afficherEmployes() {
        System.out.println("Liste des employé :");
        for (Employe employe : affectations.keySet()) {
            System.out.println(employe.getNom());
        }
    }

    public void afficherDepartements() {
        System.out.println("Liste des départements :");
        Set<Departement> departements = new HashSet<>(affectations.values());
        for (Departement departement : departements) {
            System.out.println(departement.getNom());
        }
    }







