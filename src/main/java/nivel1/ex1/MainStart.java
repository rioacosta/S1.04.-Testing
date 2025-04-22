package nivel1.ex1;

public class MainStart {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        BookCollection library = new BookCollection("Biblioteca");

        Book b3 = new Book("Momo");
        library.getBookList().add(b3);
        Book b2 = new Book("La guerra mas larga de la historia");
        library.getBookList().add(b2);

        System.out.println("Agrego libros y recupero lista: \n" + library.toString());

        System.out.println("Consigo el libro en una posicion especifica: \n"
                + library.getBookAtSpecificPosition(0) + "\n");

        Book b1 = new Book("Sputnik my love");
        library.addBookAtSpecificPosition(0, b1);
        System.out.println("Agrego libro en una posicion especifica: \n" + library.toString());


        library.deleteBook("Momo");

        System.out.println("Elimino Libro por titulo: \n" + library.toString());
        System.out.println("Sorteo y devuelvo lista final ordenada alfabeticamente: \n" + library.getBookCollectionSorted());
    }
}