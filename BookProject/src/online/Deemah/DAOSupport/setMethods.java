
package online.Deemah.DAOSupport;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import online.Deemah.entities.Book;
import online.Deemah.exceptions.DAOException;

public class setMethods {
    
     // setMethods    
///////////////////////////////////////////////////////////////////////////////////////   
    public static void setStatementParas(PreparedStatement PS, Book entity) throws DAOException {

        try {
            PS.setLong(1, entity.getISBN());
            PS.setString(2, entity.getTitle());
            PS.setString(3, entity.getAuthorName());
            PS.setLong(4, entity.getPublishYear());

        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);
        }
    }
    
      public static void setStatementParasUpdate(PreparedStatement PS, Book entity) throws DAOException {

        try {

          
                PS.setString(1, entity.getTitle());
                PS.setString(2, entity.getAuthorName());
                PS.setLong(3, entity.getPublishYear());
                PS.setLong(4, entity.getISBN());

            

        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);
        }
    }

    public static void setStatementWhereISBN(PreparedStatement PS, Long ISBN) throws DAOException {

        try {
            PS.setLong(1, ISBN);
        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);
        }
    }

    public static Book map0bject(ResultSet rs) throws DAOException {

        Book book = new Book();
        try {
            book.setISBN(rs.getLong("ISBN"));
            book.setTitle(rs.getString("Title"));
            book.setAuthorName(rs.getString("Author_name"));
            book.setPublishYear(rs.getLong("Publish_year"));

        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);
        }
        return book;
    }

}
