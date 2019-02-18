package Entity;

public class ProduitIngredients {

    private int id;
    private int produitId;
    private int ingredientId;
    private int qte;
    private String details;

    public ProduitIngredients(int id, int produitId, int ingredientId, int qte, String details) {
        this.id = id;
        this.produitId = produitId;
        this.ingredientId = ingredientId;
        this.qte = qte;
        this.details = details;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProduitId() {
        return produitId;
    }

    public void setProduitId(int produitId) {
        this.produitId = produitId;
    }

    public int getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(int ingredientId) {
        this.ingredientId = ingredientId;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
