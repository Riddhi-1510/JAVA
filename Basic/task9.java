class Book{
    int bookId;
    String bookTitle;
    String author;
    double price;

    Book(int bookId,String bookTitle,String author,double price){
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.author = author;
        this.price =  price;
    }

    void printData(){
        System.out.println("Book id is : " + bookId);
        System.out.println("BookTitale is : " + bookTitle);
        System.out.println("Book author is : " +author);
        System.out.println("Price is : " + price);
    }

};

public class task9 {
    public static void main(String[] args) {
        Book obj = new Book(110, "Rich Dad Poor Dad", "Robert Kiyosaki and Sharon Lechter", 190);
        obj.printData();
    }
}
/*

Problem 3: Book Information
Design a Java class "Book" with private data members bookId (int), bookTitle (String), author (String), and price (double). Create a parameterized constructor to initialize these attributes and provide a method to display the book information.
 */