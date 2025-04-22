package nivel1.ex1;

import java.util.ArrayList;
import java.util.Collections;

public class BookCollection {
    private ArrayList<Book> bookList = new ArrayList<>();
    String name;

    public BookCollection(String name) {
        this.name = name;
    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }


    public ArrayList<Book> getBookCollectionSorted() {
        ArrayList<Book> sortedCollection = new ArrayList<>(bookList);
        Collections.sort(sortedCollection);
        return sortedCollection;
    }

    public void addBook(Book book) {
        if (!bookList.contains(book)) {
            this.bookList.add(book);
        }
    }

    public Book getBookAtSpecificPosition(int i) {
        if (i >= 0 && i < bookList.size()) {
            return bookList.get(i);
        }
        throw new IndexOutOfBoundsException("La posició especificada no és vàlida.");
    }

    public void addBookAtSpecificPosition(int i, Book book) {
        if (!bookList.contains(book)) {
            if (i >= 0 && i <= bookList.size()) {
                bookList.add(i, book);
            } else {
                throw new IndexOutOfBoundsException("La posició especificada no és vàlida.");
            }
        }
    }

    public String deleteBook(String bookName) {
        for (int i = 0; i < this.bookList.size(); i++) {
            if (bookList.get(i).getName().equals(bookName)) {
                bookList.remove(i);
                return "Se ha eliminado el libro: " + bookName;
            }
        }
        return "El libro no se encuentra en la colección.";
    }

    public String toString() {
        String answer = "";
        for (Book book : bookList) {
            answer += book.toString() + "\n";
        }
        return answer;
    }
}