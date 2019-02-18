package DAO;

import android.content.Context;
import android.database.Cursor;

import java.util.Date;

public class CommandeDAO extends DAOBase {

    public CommandeDAO(Context pContext) {
        super(pContext);
    }

    public static final String TABLE_NAME = "commande";
    public static final String KEY = "id";
    public static final String TABLE_ID = "table_id";
    public static final String DATE = "date";
    public static final String STATUS = "status";

    public static final String TABLE_CREATE = "CREATE TABLE " + TABLE_NAME + " (" + KEY + " INTEGER PRIMARY KEY AUTOINCREMENT, " + TABLE_ID + " INT NOT NULL, " + DATE + " DATE NOT NULL, " + STATUS + "VARCHAR(10))";

    public static final String TABLE_DROP =  "DROP TABLE IF EXISTS " + TABLE_NAME + ";";

    /**
     * @param commande
     */
    public void ajouter(Commande commande) {
        // CODE
    }

    /**
     * @param id
     */
    public Commande select(int id) {
        Cursor c = mDb.rawQuery("select * from " + TABLE_NAME + " where id = ?", new String[]{String.valueOf(id)});
        int newId = c.getInt(c.getColumnIndexOrThrow(KEY));
        int tableId = c.getInt(c.getColumnIndexOrThrow(TABLE_ID));
        Date date = new Date(c.getLong(c.getColumnIndexOrThrow(DATE)) * 1000);
        String status = c.getString(c.getColumnIndexOrThrow(STATUS));
        return new Commande(newId, tableId, date, status);
    }
}