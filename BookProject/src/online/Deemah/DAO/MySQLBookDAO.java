package online.Deemah.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Optional;
import online.Deemah.datasource.ConnectionFactory;
import online.Deemah.datasource.dataSourceType;
import online.Deemah.entities.Book;
import static online.Deemah.DAOSupport.Queres.InsertQuere;
import static online.Deemah.DAOSupport.Queres.ReadByISBN;
import static online.Deemah.DAOSupport.Queres.UpdateQuereyWhereISBN;
import static online.Deemah.DAOSupport.Queres.deleteWhereISBN;
import static online.Deemah.DAOSupport.setMethods.map0bject;
import static online.Deemah.DAOSupport.setMethods.setStatementParas;
import static online.Deemah.DAOSupport.setMethods.setStatementParasUpdate;
import static online.Deemah.DAOSupport.setMethods.setStatementWhereISBN;
import online.Deemah.exceptions.DAOException;

public class MySQLBookDAO {

    private static final int UPDATE_EXECUTED_SUCCESSFULLY = 1;
    private static final String TABLE_NAME = "book";
    private static final String[] colos = {"ISBN", "Title", "Author_name", "Publish_Year"};

    protected ConnectionFactory getConnectionFactory() {
        return ConnectionFactory.getConnectionFactory(dataSourceType.MY_SQL);
    }

    public Book insert(Book obj) throws DAOException {

        String insertQuere = InsertQuere(obj);

        try ( Connection con = getConnectionFactory().creatConnection();  PreparedStatement ps = con.prepareStatement(insertQuere)) {

            setStatementParas(ps, obj);
            if (ps.executeUpdate() < UPDATE_EXECUTED_SUCCESSFULLY) {
                throw new DAOException(" could NOT save the object ");
            }

        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);
        }
        return obj;
    }

    public Book Update(Book obj) throws DAOException {

        String UpdateQuerey = UpdateQuereyWhereISBN();

        try ( Connection con = getConnectionFactory().creatConnection();  
                PreparedStatement ps = con.prepareStatement(UpdateQuerey)) {

            setStatementParasUpdate(ps, obj);
            if (ps.executeUpdate() < UPDATE_EXECUTED_SUCCESSFULLY) {
                throw new DAOException(" could NOT update the object ");
            }

        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);
        }
        return obj;
    }

    public Optional<Book> readByISBN(Long ISBN) throws DAOException {

        Book obj;

        String selectByISBNQuere = ReadByISBN();
        try ( Connection connection = getConnectionFactory().creatConnection();  PreparedStatement ps = connection.prepareStatement(selectByISBNQuere)) {

            setStatementWhereISBN(ps, ISBN);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                obj = map0bject(rs);
            } else {
                return Optional.empty();
            }

        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);

        }
        return Optional.of(obj);

    }

    public boolean contains(Long isbn) throws DAOException {
        try {
            Optional<Book> optionalBook = readByISBN(isbn);
            if (optionalBook.isPresent()) {
                return true;
            }
        } catch (DAOException ex) {
            throw new DAOException(ex.getMessage(), ex);
        }
        return false;
    }

    public void delete(Long ISBN) throws DAOException {

        String deleteQuere = deleteWhereISBN();

        try ( Connection connection = getConnectionFactory().creatConnection();  PreparedStatement ps = connection.prepareStatement(deleteQuere)) {

            setStatementWhereISBN(ps, ISBN);

            if (ps.executeUpdate() < UPDATE_EXECUTED_SUCCESSFULLY) {
                throw new DAOException(" could NOT delete the object ");
            }

        } catch (Exception ex) {
            throw new DAOException(ex.getMessage(), ex);
        }
    }

}
