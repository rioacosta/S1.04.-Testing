package nivel1.ex1;

import java.util.Objects;

public class Book implements Comparable<Book> {
    private String name;

    public Book(String bookName) {
        this.name = bookName;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Book other = (Book) obj;
        return Objects.equals(name, other.name);
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book: " + this.name;
    }

    @Override
    public int compareTo(Book o) {

        String oneBookName = this.name == null ? "" : this.name;
        String otherBookName = o.getName() == null ? "" : o.getName();

        return oneBookName.compareTo(otherBookName);

    }

}
