import java.util.ArrayList;
import java.util.Scanner;

public class MainBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Ingredient> ingredientsList = new ArrayList<>();
        boolean exit = false;
        while (!exit) {
            System.out.println("1. Ajouter un ingrédient");
            System.out.println("2. Afficher tous les ingrédients");
            System.out.println("3. Afficher un ingrédient spécifique");
            System.out.println("4. Remplacer un ingrédient");
            System.out.println("5. Supprimer un ingrédient");
            System.out.println("6. Modifier la quantité d'un ingrédient");
            System.out.println("7. Quitter");
            System.out.print("Choisissez une option: ");
            int choix = sc.nextInt();
            sc.nextLine();
            switch (choix) {
                case 1:
                    System.out.println("Saisir le nom de l'ingrédient");
                    String nom = sc.nextLine();
                    System.out.println("Saisir la quantité");
                    int quantite = sc.nextInt();
                    sc.skip("\n");
                    System.out.println("Saisir l'unité");
                    String unite = sc.nextLine();
                    Ingredient ingredient = new Ingredient(nom, quantite, unite);
                    ingredientsList.add(ingredient);
                    break;
                case 2:
                    if (ingredientsList.isEmpty()) {
                        System.out.println("Aucun ingrédient dans la liste");
                    } else {
                        System.out.println("=== Liste des ingrédients ===");
                        for (int i = 0; i < ingredientsList.size(); i++) {
                            System.out.println((i + 1) + ". " + ingredientsList.get(i).afficher());
                        }
                    }
                    break;
                case 3:
                    System.out.println("Saisir la position de l'ingrédient à affiche");
                    int position = sc.nextInt();
                    sc.nextLine();
                    if (position >= 1 && position <= ingredientsList.size()) {
                        System.out.println("Ingrédient à la position " + position + ": " + ingredientsList.get(position - 1).afficher());
                    } else {
                        System.out.println("Position invalide");
                    }
                    break;
                case 4:
                    System.out.println("Saisir la position de l'ingrédient à remplacer");
                    position = sc.nextInt();
                    sc.nextLine();
                    if (position >= 1 && position <= ingredientsList.size()) {
                        System.out.println("Saisir le nom de l'ingrédient");
                        nom = sc.nextLine();
                        System.out.println("Saisir la quantité");
                        quantite = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Saisir l'unité");
                        unite = sc.nextLine();
                        ingredientsList.set(position - 1, new Ingredient(nom, quantite, unite));
                    } else {
                        System.out.println("Position invalide");
                    }
                    break;
                case 5:
                    System.out.println("Saisir la position de l'ingrédient à supprimer");
                    position = sc.nextInt();
                    sc.nextLine();
                    if (position >= 1 && position <= ingredientsList.size()) {
                        ingredientsList.remove(position - 1);
                    } else {
                        System.out.println("Position invalide");
                    }
                    break;
                case 6:
                    System.out.println("Saisir la position de l'ingrédient dont vous voulez modifier la quantité");
                    position = sc.nextInt();
                    sc.nextLine();
                    if (position >= 1 && position <= ingredientsList.size()) {
                        System.out.println("Saisir la nouvelle quantité");
                        int newQuantite = sc.nextInt();
                        sc.skip("\n");
                        ingredientsList.get(position - 1).setQuantite(newQuantite);
                    } else {
                        System.out.println("Position invalide");
                    }
                    break;
                case 7:
                    exit = true;
                    System.out.println("C TCHOI");
                    break;
                default:
                    System.out.println("Erreur");
                    break;
            }
        }
    }
}

