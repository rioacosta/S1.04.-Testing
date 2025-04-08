package nivel1.ex1;

import java.util.ArrayList;
import java.util.Collections;

public class BookCollection {
	private ArrayList<Book> bookCollection = new ArrayList<Book>();
	String name = "";

	public BookCollection(String name) {
		this.name = name;
	}

	public ArrayList<Book> getBookCollection() {
		return bookCollection;
	}


	public ArrayList<Book> getBookCollectionSorted() {
		ArrayList<Book> sortedCollection = new ArrayList<>(bookCollection);
		Collections.sort(sortedCollection);
		return sortedCollection;
	}

	public void addBook(Book book) {
		if (!bookCollection.contains(book)) {
			this.bookCollection.add(book);
		}
	}

	public Book getBookAtSpecificPosition(int i) {
		if (i >= 0 && i < bookCollection.size()) {
			return bookCollection.get(i);
		}
		throw new IndexOutOfBoundsException("La posició especificada no és vàlida.");
	}

	public void addBookAtSpecificPosition(int i, Book book) {
		if (!bookCollection.contains(book)) {
			if (i >= 0 && i <= bookCollection.size()) {
				bookCollection.add(i, book);
			} else {
				throw new IndexOutOfBoundsException("La posició especificada no és vàlida.");
			}
		}
	}

	public String deleteBook(String bookName) {
		for (int i = 0; i < this.bookCollection.size(); i++) {
			if (bookCollection.get(i).getName().equals(bookName)) {
				bookCollection.remove(i);
				return "Se ha eliminado el libro: " + bookName;
			}
		}
		return "El libro no se encuentra en la colección.";
	}

	public String toString() {
		String answer = "";
		for (Book book : bookCollection) {
			answer += book.toString() + "\n";
		}
		return answer;
	}
}