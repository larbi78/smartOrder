package DAO;

import android.content.Context;
import android.database.Cursor;

public class TableClientDAO extends DAOBase {

    public TableClientDAO(Context pContext) {
        super(pContext);
    }

    public static final String TABLE_NAME = "table_client";
    public static final String KEY = "id";
    public static final String NUMERO = "numero";
    public static final String SEATS = "seats";
    public static final String STATUS = "status";

    public static final String TABLE_CREATE = "CREATE TABLE " + TABLE_NAME + " (" + KEY + " INTEGER PRIMARY KEY AUTOINCREMENT, " + NUMERO + " INT NOT NULL, " + SEATS + " INT NOT NULL, " + STATUS + "VARCHAR(10))";

    public static final String TABLE_DROP =  "DROP TABLE IF EXISTS " + TABLE_NAME + ";";

    /**
     * @param tableClient
     */
    public void ajouter(TableClient tableClient) {
        // CODE
    }

    /**
     * @param id
     */
    public TableClient select(int id) {
        Cursor c = mDb.rawQuery("select * from " + TABLE_NAME + " where id = ?", new String[]{String.valueOf(id)});
        int newId = c.getInt(c.getColumnIndexOrThrow(KEY));
        int numero = c.getInt(c.getColumnIndexOrThrow(NUMERO));
        int seats = c.getInt(c.getColumnIndexOrThrow(SEATS));
        String status = c.getString(c.getColumnIndexOrThrow(STATUS));
        return new TableClient(newId, numero, seats, status);
    }
}
