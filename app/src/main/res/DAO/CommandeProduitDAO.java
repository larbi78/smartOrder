package DAO;

import android.content.Context;
import android.database.Cursor;

public class CommandeProduitDAO extends DAOBase {

    public CommandeProduitDAO(Context pContext) {
        super(pContext);
    }

    public static final String TABLE_NAME = "commande_produits";
    public static final String KEY = "id";
    public static final String COMMANDE_ID = "commande_id";
    public static final String PRODUIT_ID = "produit_id";
    public static final String QTE = "qte";
    public static final String STATUS = "status";

    public static final String TABLE_CREATE = "CREATE TABLE " + TABLE_NAME + " (" + KEY + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COMMANDE_ID + " INT NOT NULL, " + PRODUIT_ID + " INT NOT NULL, " + QTE + " INT, " + STATUS + "VARCHAR(10))";

    public static final String TABLE_DROP =  "DROP TABLE IF EXISTS " + TABLE_NAME + ";";

    /**
     * @param commandeProduit
     */
    public void ajouter(CommandeProduit commandeProduit) {
        // CODE
    }

    /**
     * @param id
     */
    public CommandeProduit select(int id) {
        Cursor c = mDb.rawQuery("select * from " + TABLE_NAME + " where id = ?", new String[]{String.valueOf(id)});
        int newId = c.getInt(c.getColumnIndexOrThrow(KEY));
        int commandeId = c.getInt(c.getColumnIndexOrThrow(COMMANDE_ID));
        int produitId = c.getInt(c.getColumnIndexOrThrow(PRODUIT_ID));
        int qte = c.getInt(c.getColumnIndexOrThrow(QTE));
        String status = c.getString(c.getColumnIndexOrThrow(STATUS));
        return new CommandeProduit(newId, commandeId, produitId, qte, status);
    }
}
