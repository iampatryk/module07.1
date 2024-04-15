package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        LibraryDAO dao = new LibraryDAO();

        Author firstAuthor = new Author();
        firstAuthor.setName("Henryk");
        firstAuthor.setAge(60);
        firstAuthor.setFavouriteGenre("Poezja");

        dao.addAuthor(firstAuthor);

        Author secondAuthor = new Author();
        secondAuthor.setName("Adam");
        secondAuthor.setAge(44);
        secondAuthor.setFavouriteGenre("Dramat");

        dao.addAuthor(secondAuthor);


//        List<Book> booksList = new ArrayList<>();
//        Book book1 = new Book();
//        book1.setAuthor(firstAuthor);
//        book1.setTitle("Ksiazka numer jeden");
//        book1.setGenre("Genre");
//        book1.setNumberOfPages(321);
//        booksList.add(book1);
    }
}