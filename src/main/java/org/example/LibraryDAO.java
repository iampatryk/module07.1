package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class LibraryDAO {

    private final SessionFactory sessionFactory = AuthorSessionFactory.getAuthorSessionFactory();

    public void addAuthor(Author a) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.merge(a);
        transaction.commit();
        session.close();
    }

    public void addBookToAuthor(String authorName, Book book) {}

//    public void getBooksOfAuthor(String authorName) {}
//
//
//    public void getAllAuthors() {}
//
//    public void getAllBooks() {}
//
//    public void getAllBooksAndAuthors() {}
//
//    public void deleteBook(String title) {}
//
//    public void deleteAuthor(String authorName) {}

}
