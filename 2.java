import java.util.ArrayList;
class Book {
    String title, author, ISBN;
    Book(String t, String a, String i) {
        title = t; author = a; ISBN = i;
    }
    void display() {
        System.out.println(title + " by " + author + " (ISBN: " + ISBN + ")");
    }
}
class Library {
    ArrayList<Book> books = new ArrayList<>();
    void addBook(Book b) { books.add(b); }
    void removeBook(String isbn) {
        books.removeIf(b -> b.ISBN.equals(isbn));
    }
    void showBooks() {
        for(Book b: books) b.display();
    }
    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBook(new Book("Java Basics","James","111"));
        lib.addBook(new Book("OOP Concepts","Martin","222"));
        lib.showBooks();
        lib.removeBook("111");
        System.out.println("After removal:");
        lib.showBooks();
    }
}
