package Entity;

import java.util.Date;

public class Commande {

    private int id;
    private int tableId;
    private Date date;
    private String status;

    public Commande(int id, int tableId, Date date, String status) {
        this.id = id;
        this.tableId = tableId;
        this.date = date;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTableId() {
        return tableId;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
