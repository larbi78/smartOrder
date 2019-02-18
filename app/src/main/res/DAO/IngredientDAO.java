package DAO;

import android.content.Context;
import android.database.Cursor;

public class IngredientDAO extends DAOBase {

    public IngredientDAO(Context pContext) {
        super(pContext);
    }

    public static final String TABLE_NAME = "ingredient";
    public static final String KEY = "id";
    public static final String NAME = "name";
    public static final String QTE = "qte";

    public static final String TABLE_CREATE = "CREATE TABLE " + TABLE_NAME + " (" + KEY + " INTEGER PRIMARY KEY AUTOINCREMENT, " + NAME + " VARCHAR(100) NOT NULL, " + QTE + " INT NOT NULL)";

    public static final String TABLE_DROP =  "DROP TABLE IF EXISTS " + TABLE_NAME + ";";

    /**
     * @param ingredient
     */
    public void ajouter(Ingredient ingredient) {
        // CODE
    }

    /**
     * @param id
     */
    public Ingredient select(int id) {
        Cursor c = mDb.rawQuery("select * from " + TABLE_NAME + " where id = ?", new String[]{String.valueOf(id)});
        int newId = c.getInt(c.getColumnIndexOrThrow(KEY));
        String name = c.getString(c.getColumnIndexOrThrow(NAME));
        int qte = c.getInt(c.getColumnIndexOrThrow(QTE));
        return new Ingredient(newId, name, qte);
    }
}