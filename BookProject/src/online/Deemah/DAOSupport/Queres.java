
package online.Deemah.DAOSupport;

import online.Deemah.entities.Book;

public class Queres {
    
    private static final int UPDATE_EXECUTED_SUCCESSFULLY = 1;
    private static final String TABLE_NAME = "book";
    
// Queres
///////////////////////////////////////////////////////////////////////////////////////
    
    public static String InsertQuere(Book entity) {

        return " INSERT INTO " + TABLE_NAME + "(ISBN , Title , Author_Name , Publish_Year )" +" VALUES (?, ?, ?, ?)";

    }

    public static String UpdateQuereyWhereISBN() {
        return " UPDATE " + TABLE_NAME + " SET Title = ?, Author_name = ?, Publish_year = ? WHERE ISBN = ?";
    }

    public static String ReadByISBN() {

        return " SELECT * FROM " + TABLE_NAME + " WHERE ISBN = ? ";

    }

    public static String deleteWhereISBN() {
        return " DELETE FROM " + TABLE_NAME + " WHERE ISBN = ? ";

    }

    
    
    
}
