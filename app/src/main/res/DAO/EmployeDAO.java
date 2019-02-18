package DAO;

import android.content.Context;
import android.database.Cursor;

public class EmployeDAO extends DAOBase {

    public EmployeDAO(Context pContext) {
        super(pContext);
    }

    public static final String TABLE_NAME = "employe";
    public static final String KEY = "id";
    public static final String NAME = "name";

    public static final String TABLE_CREATE = "CREATE TABLE " + TABLE_NAME + " (" + KEY + " INTEGER PRIMARY KEY AUTOINCREMENT, " + NAME + "VARCHAR(50))";

    public static final String TABLE_DROP =  "DROP TABLE IF EXISTS " + TABLE_NAME + ";";

    /**
     * @param employe
     */
    public void ajouter(Employe employe) {
        // CODE
    }

    /**
     * @param id
     */
    public Employe select(int id) {
        Cursor c = mDb.rawQuery("select * from " + TABLE_NAME + " where id = ?", new String[]{String.valueOf(id)});
        int newId = c.getInt(c.getColumnIndexOrThrow(KEY));
        String name = c.getString(c.getColumnIndexOrThrow(NAME));
        return new Employe(newId, name);
    }
}