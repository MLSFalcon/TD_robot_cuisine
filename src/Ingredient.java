public class Ingredient {
    private String nom;

    private int quantite;

    private String unite;
    public Ingredient (String nom, int quantite, String unite){
        this.nom = nom;
        this.quantite = quantite;
        this.unite = unite;
    }
    public String getNom(){
        return this.nom;
    }
    public int getQuantite(){
        return this.quantite;
    }
    public String getUnite(){
        return this.unite;
    }
    public void setQuantite(int quantite){
        this.quantite = quantite;
    }
    public String afficher(){
        String laRecette = this.nom+" "+this.quantite+" "+this.unite;
        return laRecette;
    }
}
