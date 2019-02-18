package Entity;

public class Ingredient {

    private int id;
    private String name;
    private int qte;

    public Ingredient(int id, String name, int qte) {
        this.id = id;
        this.name = name;
        this.qte = qte;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }
}
