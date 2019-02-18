package DAO;

import android.content.Context;
import android.database.Cursor;

public class ProduitIngredientsDAO extends DAOBase {

    public ProduitIngredientsDAO(Context pContext) {
        super(pContext);
    }

    public static final String TABLE_NAME = "produit_ingredients";
    public static final String KEY = "id";
    public static final String PRODUIT_ID = "produit_id";
    public static final String INGREDIENT_ID = "ingredient_id";
    public static final String QTE = "qte";
    public static final String DETAILS = "details";

    public static final String TABLE_CREATE = "CREATE TABLE " + TABLE_NAME + " (" + KEY + " INTEGER PRIMARY KEY AUTOINCREMENT, " + PRODUIT_ID + " INT NOT NULL, " + PRODUIT_ID + " INT NOT NULL, " + QTE + " INT, " + DETAILS + "VARCHAR(1000))";

    public static final String TABLE_DROP =  "DROP TABLE IF EXISTS " + TABLE_NAME + ";";

    /**
     * @param produitingredients
     */
    public void ajouter(ProduitIngredients produitingredients) {
        // CODE
    }

    /**
     * @param id
     */
    public ProduitIngredients select(int id) {
        Cursor c = mDb.rawQuery("select * from " + TABLE_NAME + " where id = ?", new String[]{String.valueOf(id)});
        int newId = c.getInt(c.getColumnIndexOrThrow(KEY));
        int produitId = c.getInt(c.getColumnIndexOrThrow(PRODUIT_ID));
        int ingredientId = c.getInt(c.getColumnIndexOrThrow(INGREDIENT_ID));
        int qte = c.getInt(c.getColumnIndexOrThrow(QTE));
        String details = c.getString(c.getColumnIndexOrThrow(DETAILS));
        return new ProduitIngredients(newId, produitId, ingredientId, qte, details);
    }
}
