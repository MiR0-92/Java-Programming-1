public class Book {

    private String name;
    private int pagesNumber;
    private int yearOfRelease;

public Book(String bookName, int pagesOfBook, int bookReleaseDate){
    this.name = bookName;
    this.pagesNumber = pagesOfBook;
    this.yearOfRelease = bookReleaseDate;
}
public String getName(){
    return this.name;
}

public String toString(){
    return this.name +", " + this.pagesNumber + " pages, " + this.yearOfRelease;
}
}