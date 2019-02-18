package DAO;

import android.content.Context;
import android.database.Cursor;

import java.util.Date;

public class TableEmployeDAO extends DAOBase {

    public TableEmployeDAO(Context pContext) {
        super(pContext);
    }

    public static final String TABLE_NAME = "table_employe";
    public static final String KEY = "id";
    public static final String TABLE_ID = "table_id";
    public static final String EMPLOYE_ID = "employe_id";
    public static final String DATE = "date";

    public static final String TABLE_CREATE = "CREATE TABLE " + TABLE_NAME + " (" + KEY + " INTEGER PRIMARY KEY AUTOINCREMENT, " + TABLE_ID + " INT NOT NULL, " + EMPLOYE_ID + " INT NOT NULL, " + DATE + " DATE NOT NULL)";

    public static final String TABLE_DROP =  "DROP TABLE IF EXISTS " + TABLE_NAME + ";";

    /**
     * @param tableEmploye
     */
    public void ajouter(TableEmploye tableEmploye) {
        // CODE
    }

    /**
     * @param id
     */
    public TableEmploye select(int id) {
        Cursor c = mDb.rawQuery("select * from " + TABLE_NAME + " where id = ?", new String[]{String.valueOf(id)});
        int newId = c.getInt(c.getColumnIndexOrThrow(KEY));
        int tableId = c.getInt(c.getColumnIndexOrThrow(TABLE_ID));
        int employeId = c.getInt(c.getColumnIndexOrThrow(EMPLOYE_ID));
        Date date = new Date(c.getLong(c.getColumnIndexOrThrow(DATE)) * 1000);
        return new TableEmploye(newId, tableId, employeId, date);
    }
}
