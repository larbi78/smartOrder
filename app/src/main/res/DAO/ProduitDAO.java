package DAO;

import android.content.Context;
import android.database.Cursor;

public class ProduitDAO extends DAOBase {

    public ProduitDAO(Context pContext) {
        super(pContext);
    }

    public static final String TABLE_NAME = "produit";
    public static final String KEY = "id";
    public static final String NAME = "name";
    public static final String STATUS = "status";
    public static final String PRICE = "price";

    public static final String TABLE_CREATE = "CREATE TABLE " + TABLE_NAME + " (" + KEY + " INTEGER PRIMARY KEY AUTOINCREMENT, " + NAME + "VARCHAR(100) NOT NULL, " + STATUS + "VARCHAR(10), " + PRICE + " FLOAT NOT NULL)";

    public static final String TABLE_DROP =  "DROP TABLE IF EXISTS " + TABLE_NAME + ";";

    /**
     * @param produit
     */
    public void ajouter(Produit produit) {
        // CODE
    }

    /**
     * @param id
     */
    public Produit select(int id) {
        Cursor c = mDb.rawQuery("select * from " + TABLE_NAME + " where id = ?", new String[]{String.valueOf(id)});
        int newId = c.getInt(c.getColumnIndexOrThrow(KEY));
        String name = c.getString(c.getColumnIndexOrThrow(NAME));
        String status = c.getString(c.getColumnIndexOrThrow(STATUS));
        float price = c.getFloat(c.getColumnIndexOrThrow(PRICE));
        return new Produit(newId, name, status, price);
    }
}
