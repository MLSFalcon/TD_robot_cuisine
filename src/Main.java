import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("saisir le nom de l'ingredient");
        String nom = sc.nextLine();
        System.out.println("Maintenant la quantité");
        int quantite = sc.nextInt();
        sc.skip("\n");
        System.out.println("Pour finir l'unite");
        String unite = sc.nextLine();
        Ingredient monIngredient = new Ingredient(nom,quantite,unite);
        System.out.println(monIngredient.afficher());
    }
}