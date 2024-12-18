import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        int choix;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("\n----- Menu -----");
            System.out.println("1. Ajouter un livre");
            System.out.println("2. Afficher tous les livres");
            System.out.println("3. Rechercher un livre par titre");
            System.out.println("4. Modifier un livre par ISBN");
            System.out.println("5. Supprimer un livre par ISBN");
            System.out.println("6. Quitter");
            System.out.print("Entrez votre choix : ");
            choix = input.nextInt();

            switch (choix) {
                case 1:
                    book.ajouter();
                    break;
                case 2:
                    book.afficher();
                    break;
                case 3:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide.");
            }
        } while (choix != 3);



    }
}