import java.util.ArrayList;
import java.util.Scanner;

public class Book {
    String title, auteur, ISBN;
    boolean disponibilite;


    public Scanner input = new Scanner(System.in);
    public ArrayList<Book> livres = new ArrayList<>();


    public Book(boolean disponibilite, String ISBN, String auteur, String title) {
        this.disponibilite = disponibilite;
        this.ISBN = ISBN;
        this.auteur = auteur;
        this.title = title;
    }

    public Book(){ }

    // Fonction pour Ajouter un livre
    public void ajouter() {
        Book newLivre = new Book();
        System.out.print("Entrez le titire : ");
        newLivre.title = input.next();
        System.out.print("Entrez l'auteur : ");
        newLivre.auteur = input.next();
        System.out.print("Entrez le ISBN : ");
        newLivre.ISBN = input.next();
        System.out.print("Entrez la disponibilité (true/false): ");
        newLivre.disponibilite = input.nextBoolean();

        livres.add(newLivre);
        System.out.println("Livre ajouté avec succès !");
    }

    // Fonction pour Afficher les livres
    public void afficher(){
        if (livres.isEmpty()){
            System.out.println("Aucun livre disponible");
        }else {
            System.out.println("Liste des livres : ");
            for (int i = 0; i < livres.size();++i){

                System.out.println(i + 1);
                System.out.println("Le titre : " + livres.get(i).title );
                System.out.println("L'auteur : " + livres.get(i).auteur);
                System.out.println("le ISBN : " + livres.get(i).ISBN);
                System.out.println("La disponibilité : " + (livres.get(i).disponibilite?"oui\n":"no\n"));

            }
        }
    }

    // Fonction pour supprimer un livre
    public  void supprimer() {
        System.out.print("Entrez le ISBN du livre à supprimer : ");
        String toSupprimer = input.next();
        boolean supprime = false;

        for (int i = 0; i < livres.size(); i++) {
            if (livres.get(i).ISBN.equals(toSupprimer)) {
                livres.remove(i);
                supprime = true;
                System.out.println("Livre supprimé avec succès !");
                break;
            }
        }
        if (!supprime) {
            System.out.println("Livre non trouvé avec ce ISBN.");
        }
    }



}


