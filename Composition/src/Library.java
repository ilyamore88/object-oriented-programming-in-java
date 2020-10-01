import java.util.ArrayList;

class Library {

    // ссылка на список книг в библиотеке.
    private final ArrayList<Book> books;

    Library(ArrayList<Book> books) // конструктор
    {
        this.books = books;
    }

    public ArrayList<Book> getTotalBooksInLibrary() {

        return books;
    }

}

