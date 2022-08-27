package online.Deemah.services;

import java.util.Optional;
import online.Deemah.DAO.MySQLBookDAO;
import online.Deemah.Validators.LengthValidator;
import online.Deemah.Validators.NullValidator;
import online.Deemah.Validators.Validator;
import online.Deemah.entities.Book;
import online.Deemah.exceptions.BookNotFoundException;
import online.Deemah.exceptions.ServiceException;

public class BookServiceImpl implements BookService {

    private MySQLBookDAO bookDAO;

    public BookServiceImpl() {
        bookDAO = new MySQLBookDAO();
    }

    @Override
    public Book add(Book book) throws ServiceException {

        checkNull("Book", book);
        validateBook(book);
        if (contains(book.getISBN())) {
            throw new ServiceException(" Book with ISBN " + book.getISBN() + " already exists ");
        }
        try {
            return bookDAO.insert(book);

        } catch (Exception ex) {

            throw new ServiceException(" could not save the book " + ex.getMessage());

        }
    }

    @Override
    public Book getByISBN(Long isbn) throws ServiceException, BookNotFoundException {

        try {
            checkNull(" ISBN ", isbn);
            Optional<Book> optionalBook = bookDAO.readByISBN(isbn);
            if (!optionalBook.isPresent()) {

                throw new BookNotFoundException(" Book with ISBN " + isbn + " not found ");
            }
            Book book = optionalBook.get();
            return book;

        } catch (Exception ex) {

            throw new ServiceException(" could not featch book ");

        }

    }

    @Override
    public Book update(Book book) throws ServiceException, BookNotFoundException {

        checkNull(" Book ", book);
        Long isbn = book.getISBN();

        if (!contains(isbn)) {
            throw new BookNotFoundException(" Can’t update , the Book with ISBN " + isbn + " is not found ");
        }
        try {
            return bookDAO.Update(book);
        } catch (Exception ex) {

            throw new ServiceException(" could not featch Book ");

        }
    }

    @Override
    public void removeByISBN(Long isbn) throws ServiceException, BookNotFoundException {
        checkNull(" ISBN ", isbn);
        if (!contains(isbn)) {
            throw new BookNotFoundException(" Can’t remove , Book with ISBN " + isbn + " is not found");
        }
        try {
            bookDAO.delete(isbn);
        } catch (Exception ex) {
            throw new ServiceException(" could not remove Book ");
        }
    }

    @Override
    public boolean contains(Long isbn) throws ServiceException {
        try {
            checkNull(" ISBN ", isbn);
            return bookDAO.contains(isbn);
        } catch (Exception ex) {
            throw new ServiceException(" could not featch book  ");
        }
    }
    /////////////////////////////////////////////////

    private void checkNull(String field, Object obj) {
        Validator validator = new NullValidator(field, obj);
        validator.validate();
        validator = null;
    }

    private void validateBook(Book book) {

        String isbn = book.getISBN().toString();
        String title = book.getTitle();
        String authorName = book.getAuthorName();
        String publishYear = book.getPublishYear().toString();

        //validate nationality ISBN 
        LengthValidator validator = new LengthValidator(" ISBN ", isbn, 10, 13);
        validator.validate();
        // validate Title 
        validator.setValues(" Title ", title, 2, 20);
        validator.validate();

        // validate Author name 
        validator.setValues(" Author Name ", authorName, 2, 20);
        validator.validate();

        // validate Publish Year  
        validator.setValues(" Publish Year ", publishYear, 2, 4);
        validator.validate();

        validator = null;

    }
}
