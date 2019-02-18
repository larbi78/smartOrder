package Entity;

public class CommandeProduit {

    private int id;
    private int commandeId;
    private int produitId;
    private int qte;
    private String status;

    public CommandeProduit(int id, int commandeId, int produitId, int qte, String status) {
        this.id = id;
        this.commandeId = commandeId;
        this.produitId = produitId;
        this.qte = qte;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCommandeId() {
        return commandeId;
    }

    public void setCommandeId(int commandeId) {
        this.commandeId = commandeId;
    }

    public int getProduitId() {
        return produitId;
    }

    public void setProduitId(int produitId) {
        this.produitId = produitId;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
