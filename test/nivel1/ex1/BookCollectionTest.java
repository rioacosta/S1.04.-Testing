package nivel1.ex1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

public class BookCollectionTest {
    private BookCollection bookCollection;
    
	  @BeforeEach
	    public void setUp() {
		  bookCollection = new BookCollection("My Library");
	    }

	    @Test
	    public void testBookListIsNotNullAfterCreation() {
	        assertNotNull(bookCollection.getBookCollection());
			assertEquals(0, bookCollection.getBookCollection().size());
		}

	    @Test
	    public void testListSizeAfterInsertingBooks() {
	        bookCollection.addBook(new Book("Book A"));
	        bookCollection.addBook(new Book("Book B"));
	        assertEquals(2, bookCollection.getBookCollection().size());
	    }

	    @Test
	    public void testBookInCorrectPosition() {
	        bookCollection.addBook(new Book("Book A"));
	        bookCollection.addBook(new Book("Book B"));
	        assertEquals("Book A", bookCollection.getBookAtSpecificPosition(0).getName());
	        assertEquals("Book B", bookCollection.getBookAtSpecificPosition(1).getName());
	    }

	    @Test
	    public void testNoDuplicateTitles() {
	        Book bookA = new Book("Book A");
	        bookCollection.addBook(bookA);
	        bookCollection.addBook(bookA); 
	        List<Book> books = bookCollection.getBookCollection();
	        assertEquals(1, books.stream().filter(book -> book.getName().equals("Book A")).count());
	    }

	    @Test
	    public void testRetrieveBookByPosition() {
	        bookCollection.addBook(new Book("Book A"));
	        bookCollection.addBook(new Book("Book B"));
			assertEquals("Book B", bookCollection.getBookAtSpecificPosition(1).getName());
	    }

	    @Test
	    public void testAddingBookModifiesList() {
	        bookCollection.addBook(new Book("Book A"));
	        bookCollection.addBook(new Book("Book B"));
	        assertEquals(2, bookCollection.getBookCollection().size());
	        assertTrue(bookCollection.getBookCollection().stream().anyMatch(book -> book.getName().equals("Book A")));
	        assertTrue(bookCollection.getBookCollection().stream().anyMatch(book -> book.getName().equals("Book B")));
	    }

	    @Test
	    public void testRemovingBookDecreasesListSize() {
			bookCollection.addBook(new Book("Book A"));
			bookCollection.addBook(new Book("Book B"));
			bookCollection.deleteBook("Book A");

			assertEquals(1, bookCollection.getBookCollection().size());

			assertFalse(bookCollection.getBookCollection().stream().anyMatch(book -> book.getName().equals("Book A")));

			assertTrue(bookCollection.getBookCollection().stream().anyMatch(book -> book.getName().equals("Book B")));
		}


		@Test
		public void testListIsAlphabeticallyOrdered() {
			bookCollection.addBook(new Book("Book B"));
			bookCollection.addBook(new Book("Book A"));
			bookCollection.addBook(new Book("Book C"));
	
			List<Book> books = bookCollection.getBookCollectionSorted();
	
			assertEquals("Book A", books.get(0).getName());
			assertEquals("Book B", books.get(1).getName());
			assertEquals("Book C", books.get(2).getName());
	
			bookCollection.deleteBook("Book B");
			books = bookCollection.getBookCollectionSorted();
			assertEquals("Book A", books.get(0).getName());
			assertEquals("Book C", books.get(1).getName());
		}
	}