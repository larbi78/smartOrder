package Entity;

public class TableClient {

    private int id;
    private int numero;
    private int seats;
    private String status;

    public TableClient(int id, int numero, int seats, String status) {
        super();
        this.id = id;
        this.numero = numero;
        this.seats = seats;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
