package online.Deemah.services;

import online.Deemah.entities.Book;
import online.Deemah.exceptions.BookNotFoundException;
import online.Deemah.exceptions.ServiceException;

public interface BookService {

    //save
    public abstract Book add(Book book) throws ServiceException;

    //read
    public abstract Book getByISBN(Long isbn) throws ServiceException, BookNotFoundException;

    public abstract boolean contains(Long isbn) throws ServiceException;

    //update
    public abstract Book update(Book book) throws ServiceException, BookNotFoundException;

    //delete
    public abstract void removeByISBN(Long isbn) throws ServiceException, BookNotFoundException;

}
