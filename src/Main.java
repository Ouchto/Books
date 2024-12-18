import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book livre = new Book();
        int choix;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("\n----- Menu -----");
            System.out.println("1. Ajouter un livre");
            System.out.println("2. Afficher tous les livres");
            System.out.println("3. Supprimer un livre par ISBN");
            System.out.println("4. Modifier un livre par ISBN");
            System.out.println("5. Rechercher un livre par titre");
            System.out.println("6. Quitter");
            System.out.print("Entrez votre choix : ");
            choix = input.nextInt();

            switch (choix) {
                case 1:
                    livre.ajouter();
                    break;
                case 2:
                    livre.afficher();
                    break;
                case 3:
                    livre.supprimer();
                    break;
                case 4:
                    livre.modifier();
                    break;
                case 5:
                    livre.rechercher();
                    break;
                case 6:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide.");
            }
        } while (choix != 6);



    }
}