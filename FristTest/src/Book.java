import java.util.Comparator;
import java.util.Objects;

class CustomException extends Exception{
    public CustomException(String message){
        super(message);
    }
}

 class Book  {
    int bookId;
    String title;
    String author;
    double price;
    String category;

    public Book(int bookId, String title, String author, double price, String category) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Book : " +
                "BookId :" + bookId +
                ", Title :'" + title + '\'' +
                ", Author :'" + author + '\'' +
                ", Price :" + price +
                ", Category :'" + category + '\'' ;
    }

    public String getCategory() {
        return category;
    }

}
