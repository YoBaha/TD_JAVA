import java.util.TreeSet;

public class Departement implements IDepartement<Departement> {
    private int id;
    private String nom;
    private int nombreEmployes;

    // Constructeurs
    public Departement() {
    }

    public Departement(int id, String nom, int nombreEmployes) {
        this.id = id;
        this.nom = nom;
        this.nombreEmployes = nombreEmployes;
    }

//equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Departement other = (Departement) obj;
        return id == other.id && nom.equals(other.nom);
    }

//to string
    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", nombreEmployes=" + nombreEmployes +
                '}';
    }


    @Override
    public void ajouterDepartement(Departement departement) {

    }

    @Override
    public boolean rechercherDepartement(String nom) {

        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {

        return false;
    }

    @Override
    public void supprimerDepartement(Departement departement) {

    }

    @Override
    public void displayDepartement() {

    }

    @Override
    public TreeSet<Departement> trierDepartementById() {

        return null;
    }
}
