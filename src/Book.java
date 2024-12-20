import java.util.ArrayList;
import java.util.Scanner;

public class Book {
    String title, auteur, ISBN;
    boolean disponibilite;

    public Scanner input = new Scanner(System.in);
    public ArrayList<Book> livres = new ArrayList<>();

    public Book(){ }

    // Fonction pour Ajouter un livre
    public void ajouter() {
        Book newLivre = getAjouter();
        livres.add(newLivre);
        System.out.println("Livre ajouté avec succès !");
    }

    private Book getAjouter(){
        Book newLivre = new Book();
        System.out.print("Entrez le titire : ");
        newLivre.title = input.next();
        System.out.print("Entrez l'auteur : ");
        newLivre.auteur = input.next();
        System.out.print("Entrez le ISBN : ");
        newLivre.ISBN = input.next();
        System.out.print("Entrez la disponibilité (true/false): ");
        newLivre.disponibilite = input.nextBoolean();
        return newLivre;
    }

    // Fonction pour Afficher les livres
    public void afficher(){
        if (livres.isEmpty()){
            System.out.println("Aucun livre disponible");
        }else {
            System.out.println("Liste des livres : ");
            for (Book livre : livres) {
                System.out.println(livre);
            }
        }
    }

    // Fonction pour Modifier un livre
    public  void modifier() {
        if (livres.isEmpty()){
            System.out.println("Aucun livre disponible");
        }else {
            System.out.print("Entrez le ISBN du livre à modifier : ");
            String isbnModifier = input.next();
            boolean modifie = false;

            for (Book livre : livres) {
                if (livre.ISBN.equals(isbnModifier)) {
                    int choix;
                    do {
                        System.out.println("1. Modifier le titre : ");
                        System.out.println("2. Modifier l'auteur : ");
                        System.out.println("3. Modifier la disponibilité : ");
                        System.out.println("4. Quitter. ");

                        System.out.print("Entrez votre choix : ");
                        choix = input.nextInt();

                        switch (choix) {
                            case 1:
                                System.out.print("Entrez le titre : ");
                                livre.title = input.next();
                                break;
                            case 2:
                                System.out.print("Entrez l'auteur : ");
                                livre.auteur = input.next();
                                break;
                            case 3:
                                System.out.print("Entrez la disponibilité : ");
                                livre.disponibilite = input.nextBoolean();
                                break;
                            case 4:
                                System.out.println("Livre modifié avec succès !");
                                break;
                            default:
                                System.out.println("choix invalid");
                        }
                    } while (choix != 4);


                    modifie = true;
                    break;
                }
            }
            if (!modifie) {
                System.out.println("Livre non trouvé avec ce ISBN.");
            }
        }
    }

    // Fonction pour supprimer un livre
    public  void supprimer() {
        if (livres.isEmpty()){
            System.out.println("Aucun livre disponible");
        }else {
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

    // Fonction pour Rechercher un livre
    public void rechercher(){
        if (livres.isEmpty()){
            System.out.println("Aucun livre disponible");
        }else {
            System.out.print("Entrez le ISBN  à rechercher : ");
            String isbn = input.next();
            boolean trouve = false;

            for (Book livre : livres) {
                if (livre.title.equalsIgnoreCase(isbn)) {
                    livre.afficher();
                    trouve = true;
                }
            }
            if (!trouve) {
                System.out.println("Livre non trouvé.");
            }
        }

    }

    @Override
    public String toString() {
        return  "-----------------------------\n"+
                "Le title : " + title + "\n"+
                "L'auteur : " + auteur + "\n" +
                "ISBN : " + ISBN + "\n" +
                "La  disponibilite : " + disponibilite + "\n" ;
    }
}


