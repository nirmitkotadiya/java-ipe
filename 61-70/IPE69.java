class Book {
    private String author_name;

    public Book(String author_name) {
        this.author_name = author_name;
    }

    public String getAuthorName() {
        return author_name;
    }

    public void display() {
        System.out.println("Author = " + author_name);
    }
}

class BookPublication extends Book {
    private String title;

    public BookPublication(String author_name, String title) {
        super(author_name);
        this.title = title;
    }

    public void display() {
        System.out.println("book publication : ");
        System.out.println("Title : " + title);
        System.out.println("Author : " + getAuthorName());
    }
}

class PaperPublication extends Book {
    private String title;

    public PaperPublication(String author_name, String title) {
        super(author_name);
        this.title = title;
    }

    public void display() {
        System.out.println("paper publication : ");
        System.out.println("Title : " + title);
        System.out.println("Author : " + getAuthorName());
    }
}

public class IPE69 {
    public static void main(String[] args) {
        // Declare a class called book having author_name as private data member. Extend
        // book class to have two sub classes called book_publication&paper_publication.
        // Each of these classes have private member called title. Write a complete
        // program to show usage of dynamic method dispatch (dynamic polymorphism) to
        // display book or paper publications of given author. Use command line
        // arguments for inputting data.
        String authorName = args[0];
        String bookTitle = args[1];
        String paperTitle = args[2];

        Book bookPublication = new BookPublication(authorName, bookTitle);
        Book paperPublication = new PaperPublication(authorName, paperTitle);

        bookPublication.display();
        paperPublication.display();
    }

}
