import java.util.ArrayList;
import java.util.List;

class TestComposition {
    public static void main(String[] args) {

        // Создание объектов класса Book
        Book b1 = new Book("EffectiveJ Java", "Joshua Bloch");
        Book b2 = new Book("Thinking in Java", "Bruce Eckel");
        Book b3 = new Book("Java: The Complete Reference", "Herbert Schildt");

        // Создание списка, который содержит
        //  книги.
        ArrayList<Book> books = new ArrayList<>();
        books.add(b1);
        books.add(b2);
        books.add(b3);

        Library library = new Library(books);

        List<Book> bks = library.getTotalBooksInLibrary();
        for (Book bk : bks) {

            System.out.println("Title : " + bk.title + " and "
                    + " Author : " + bk.author);
        }
    }
}
