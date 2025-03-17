package ITA_POO_JAVA.Modules.Module2.Library_Automation_System.project;

import java.util.ArrayList;

public class LibraryUser {
    public String name;
    public int id;
    public ArrayList<Book> rentedBooks = new ArrayList<Book>();

    public LibraryUser(String name, int id) {
        this.name = name;
        this.id = id;
    }
    LibraryUser(String name){
        this.name = name;
    }

    public void addBookToRentedList(Book book){
        rentedBooks.add(book);
    }

    public void showRentedBooks () {
        System.out.println("""
                ______________________
                """);
        System.out.printf("""
                Books rented by '%s':
                
                """,name);
        for (Book title : rentedBooks) {
            System.out.printf("""
                    %s
                    """,title.title);
        }
        System.out.println("""
                
                ______________________
                """);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
