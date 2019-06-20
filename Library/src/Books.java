
class Books {

    private final String bookname;
    private final String author;
    private final int year;

    Books(String bookname, String author, int year) {
        this.author = author;
        this.bookname = bookname;
        this.year = year;
    }

    String getBookname() {
        return bookname;
    }

    String getAuthor() {
        return author;
    }

    int getYear() {
        return year;
    }

}