package nivel1.ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookCollection {
		private ArrayList<Book> bookCollection = new ArrayList<Book>();
		String name = "";
		
		public BookCollection(String name) {
			this.name = name;
		}
		
		public ArrayList<Book> getBookCollection() {
			return bookCollection;
		}

		//----------------------------------------
		
		public void setBook(Book book) {
		this.bookCollection.add(book);
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
		                Collections.sort(getBookCollection()); 
		            } else {
		                throw new IndexOutOfBoundsException("La posició especificada no és vàlida.");
		            }
		       }
		}
		
		public String deleteBook(String bookName) {
			for (int i = 0; i < this.bookCollection.size(); i++) {
			String currentName = bookCollection.get(i).getName();	
				if (currentName.equals(bookName)) {
					bookCollection.remove(i);
				}
			}
			return "Se ha eliminado el libro: " + bookName;
		}
		
		//------------------------------------------
		public String toString() {
			String answer= "";
			for (Book book : bookCollection) {
				answer += book.toString() + "\n";
			}
			return answer;
		}
		
}
