package ITA_POO_JAVA.Modules.Module2.Library_Automation_System.project;

public class Book {
    public String title;
    public String author;
    public int id;
    public boolean available;
    public LibraryUser lastUser = null;

    public Book(String title, String author,int id) {
        this.id = id;
        this.author = author;
        this.title = title;
    }

    public Book(String title, String author) {
        this.author = author;
        this.title = title;
    }

    public Book(String title, int id) {
        this.title = title;
        this.id = id;
    }

    public Book(String title) {
        this.title = title;
    }

    public void bookStatus() {
        System.out.printf("""
                        
                        _______________________
                        Book Info
                        
                        Title: %s
                        Author: %s
                        Id: %d
                        Is Available: %b
                        Last User: %s
                        
                        _______________________
                        """,
                title,
                author,
                id,
                available,
                (lastUser != null ? lastUser.getName() : "None")
        );
    }
}
