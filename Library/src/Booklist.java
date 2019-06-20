import java.util.ArrayList;
import java.util.List;

public class Booklist {

    List<Books> allBooks = new ArrayList<>();

    Booklist() {


        allBooks.add(new Books("To Kill a Mockingbird", "Harper Lee", 1960));
        allBooks.add(new Books("Pride and Prejudice", "Jane Austen", 1813));
        allBooks.add(new Books("The Diary of Anne Frank", "Anne Frank", 1952));
        allBooks.add(new Books("1984", "George Orwell", 1949));
        allBooks.add(new Books("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 1997));
        allBooks.add(new Books("The Lord of the Rings", "J.R.R. Tolkien", 1954));
        allBooks.add(new Books("Animal Farm", "George Orwell", 1945));
        allBooks.add(new Books("The Hobbit", "J.R.R. Tolkien", 1937));

    }

    public List<Books> getBookList() {
        return this.allBooks;
    }
}