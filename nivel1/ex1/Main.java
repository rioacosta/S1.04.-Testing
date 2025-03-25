package nivel1.ex1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BookCollection library = new BookCollection("Biblioteca");
			
		Book b3 = new Book("Momo");				//agregar libros
		library.getBookCollection().add(b3);
		Book b2 = new Book("La guerra mas larga de la historia");
		library.getBookCollection().add(b2);
				
		System.out.println(library.toString());	//recuperar lista completa
		
		System.out.println(library.getBookAtSpecificPosition(0)+ "\n");		//Recuperar libro en una posicion especifica
		
		Book b1 = new Book("Sputnik my love");
		library.addBookAtSpecificPosition(0, b1);		//Agregar libro en una posicion especifica
		System.out.println(library.toString());
	
		
		library.deleteBook("Momo");			//Eliminar Libro por titulo

		System.out.println(library.toString());  //Lista final

	}

}
