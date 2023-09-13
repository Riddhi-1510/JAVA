
import java.util.*;
class Book{
    private String title;
    private String author;
    private boolean isAvailable;
    Book(String title,String author){
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public boolean isAvailable(){
        return this.isAvailable;
    }
    public void setAvailability(boolean isAvailable){
        this.isAvailable = isAvailable;
    }
}
class Member{
    private String name;
    private Book[] borrowedBooks;
    private int numBorrowedBooks;
    public Member(String name,int maxBooks){
        this.name = name;
        this.borrowedBooks = new Book[maxBooks];
        this.numBorrowedBooks = 0;
    }
    public String getName(){
        return name;
    }
    public Book[] getBorrowedBook(){
        return borrowedBooks;
    }
    public void borrowBook(Book book){
        if(numBorrowedBooks < borrowedBooks.length && book.isAvailable()){
            borrowedBooks[numBorrowedBooks] = book;
            book.setAvailability(false);
            numBorrowedBooks++;
            System.out.println("Book " + book.getTitle() +" Borrowed By " + name);
        }else{
            System.out.println("Book " + book.getTitle() +" Is not available for borrowing");
        }  
    }

    public void returnBook(Book book){
        int index = -1;
        for(int i=0;i<numBorrowedBooks;i++){
            if(borrowedBooks[i]==book){
                index = i;
                break;
            }
        }
        if(index != -1){
            for(int i=index;i<numBorrowedBooks-1;i++){
                borrowedBooks[i] = borrowedBooks[i+1];
            }
            borrowedBooks[numBorrowedBooks-1] = null;
            book.setAvailability(true);
            numBorrowedBooks--;
            System.out.println("Books " + book.getTitle() + " return by "+name);

        }else{
            System.out.println("You didn't borrow this book.");
        }
    }
    
}
class Library {
    int numberBooks;
    private Book[] books;

    public Library(int maxBooks){
       books = new Book[maxBooks];
       numberBooks = 0;
    }
    void addBook(Book book){
        if(numberBooks < books.length){
            books[numberBooks] = book;
            numberBooks++;
        }
    }
    public Book searchBook(String title){
        for(int i=0;i<numberBooks;i++){
            if(books[i].getTitle().equalsIgnoreCase(title)){
                return books[i];
            }
        }
        return null;
    }

}
public class q_i12{
    public static void main(String[] args) {
            Library library = new Library(10);

            Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
            Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
            Book book3 = new Book("1984", "George Orwell");


            library.addBook(book1);
            library.addBook(book2);
            library.addBook(book3);

            Member member1 = new Member("riddhi", 3);
            Member member2 = new Member("dishant", 5);
    
            library.searchBook("1984"); // Search for a book
            member1.borrowBook(book2); // John borrows a book
            member2.borrowBook(book2); // Emily borrows the same book (not available)
    
            member1.returnBook(book2); // John returns the book
            member2.borrowBook(book2); // Emily borrows the book (now available)
    
           System.out.println(member1.getName() );
           for(Book book : member1.getBorrowedBook()){
                if(book!=null){
                    System.out.println(book.getTitle());
                }
           }
           System.out.println(member2.getName() );
           for(Book book : member2.getBorrowedBook()){
                if(book!=null){
                    System.out.println(book.getTitle());
                }
           }

    }
}