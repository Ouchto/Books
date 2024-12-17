import java.util.Scanner;
public class Book {
    String title, auteur, ISBN;
    boolean disponibilite;

    // Fonction pour Ajouter un livre
    public void ajouter() {
        Scanner input = new Scanner(System.in);
        System.out.print("Entrez le titire : ");
        this.title = input.next();
        System.out.print("Entrez l'auteur : ");
        this.auteur = input.next();
        System.out.print("Entrez le ISBN : ");
        ISBN = input.next();
        System.out.print("Entrez la disponibilité (true/false): ");
        disponibilite = input.nextBoolean();

    }

    // Fonction pour Afficher les livres
    public void afficher(){
        System.out.println("Le titre : " + title);
        System.out.println("L'auteur : " + auteur);
        System.out.println("le ISBN : " + ISBN);
        System.out.println("La disponibilité (true/false) : " + (disponibilite?"oui":"no"));

    }



}


