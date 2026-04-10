public class Book {
    private String author;
    private String name;
    private int pages;

    public Book(String authorName, String bookName, int pagesNumber){
        this.author = authorName;
        this.name = bookName;
        this.pages = pagesNumber;
    }

    public String getAuthor(){
        return this.author;
    }

    public String getName(){
        return this.name;
    }

    public int getPages(){
        return this.pages;
    }
    
    public String toString(){
        return this.author + ", " + this.name + ", " + this.pages + " pages";
    }
}
