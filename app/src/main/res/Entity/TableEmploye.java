package Entity;

import java.util.Date;

public class TableEmploye {

    private int id;
    private int tableId;
    private int employeId;
    private Date date;

    public TableEmploye(int id, int tableId, int employeId, Date date) {
        this.id = id;
        this.tableId = tableId;
        this.employeId = employeId;
        this.date = date;
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

    public int getEmployeId() {
        return employeId;
    }

    public void setEmployeId(int employeId) {
        this.employeId = employeId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
