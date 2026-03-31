class Book {
    String title, author; double price;
    Book(String t,String a,double p){title=t;author=a;price=p;}
    void display(){System.out.println(title+" by "+author+" Price: "+price);}
}

public class TestBooks {
    public static void main(String[] args) {
        Book[] books = {
            new Book("Java","James",500),
            new Book("Python","Guido",600)
        };
        for(Book b: books) b.display();
    }
}
