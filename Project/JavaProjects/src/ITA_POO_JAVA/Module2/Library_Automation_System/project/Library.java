package ITA_POO_JAVA.Module2.Library_Automation_System.project;
import java.util.ArrayList;
import java.util.Objects;

public class Library {
    public String name;
    public ArrayList<Book> titlesCatalog = new ArrayList<Book>();
    public ArrayList<LibraryUser> usersList = new ArrayList<LibraryUser>();


    public void registerUser(String userName) {
        LibraryUser newUser = new LibraryUser(userName);
        usersList.add(newUser);
    }

    public void registerBook(String title) {
        Book newBook = new Book(title);
        newBook.available = true;
        titlesCatalog.add(newBook);
    }

    public void registerBook(String title, String author) {
        Book newBook = new Book(title, author);
        newBook.available = true;
        titlesCatalog.add(newBook);
    }

    public void registerBook(String title, int id) {
        Book newBook = new Book(title, id);
        newBook.available = true;
        titlesCatalog.add(newBook);
    }

    public void registerBook(String title, String author, int id) {
        Book newBook = new Book(title, author, id);
        newBook.available = true;
        titlesCatalog.add(newBook);
    }

    public void bookInfo(String bookTitle){
        for (Book book : titlesCatalog){
            if (book.title.equalsIgnoreCase(bookTitle)){
                book.bookStatus();
                return;
            }
        }
        System.out.println("Sorry, the book '"+ bookTitle+ "' was not found in the system.");

    }

    public void rentBook(String bookTitle, LibraryUser user) {
        for (Book book : titlesCatalog) {
            if (book.title.equalsIgnoreCase(bookTitle)) {
                if (book.available) {
                    book.available = false;
                    book.lastUser = user;
                    user.addBookToRentedList(book);
                    System.out.println("You have successfully rented: " + bookTitle);
                } else {
                    System.out.println("Sorry, the book '" + bookTitle + "' is already rented.");
                }
                return;
            }
        }
        System.out.println("Sorry, the book '" + bookTitle + "' was not found in the system.");
    }

    public void returnBook(String bookTitle) {
        for (Book book : titlesCatalog) {
            if (book.title.equalsIgnoreCase(bookTitle)) {
                if (!book.available) {
                    book.available = true;
                    System.out.println("You have successfully returned: " + bookTitle);
                } else {
                    System.out.println("Sorry, the book '" + bookTitle + "' is not rented.");
                }
                return;
            }
        }
    }

    public void showAvailableBooks() {
        for (Book title : titlesCatalog) {
            if (title.available) {
                System.out.println(title.title);
            }
        }
    }

    public void showUnavailableBooks () {
        for (Book title : titlesCatalog) {
            if (!title.available) {
                System.out.println(title.title);
            }
        }
    }
}

