package org.example;

public class Main {
    public static void main(String[] args) {

        LibraryDAO dao = new LibraryDAO();

        Author firstAuthor = new Author();
        firstAuthor.setName("Henryk");
        firstAuthor.setAge(60);
        firstAuthor.setFavouriteGenre("Poezja");

        dao.addAuthor(firstAuthor);
    }
}