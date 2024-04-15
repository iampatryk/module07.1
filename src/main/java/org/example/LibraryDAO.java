package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class LibraryDAO {

    private final SessionFactory sessionFactory = AuthorSessionFactory.getAuthorSessionFactory();

    public void addAuthor(Author a) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.merge(a);
        transaction.commit();
        session.close();
    }

//    public void addBookToAuthor(String authorName, Book book) {
//
//    }
//
//    private void addBook(List<Book> books) {
//        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
//        books.forEach(session::merge);
//        transaction.commit();
//        session.close();
//    }

//    public void getBooksOfAuthor(String authorName) {}
//
//
    public void getAllAuthors() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

    }
//
//    public void getAllBooks() {}
//
//    public void getAllBooksAndAuthors() {}
//
//    public void deleteBook(String title) {}
//
//    public void deleteAuthor(String authorName) {}

}
