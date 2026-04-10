import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        //While loop that takes inputs, until the user enters an empty input

        while (true) {

            System.out.print("Title: ");
            String bookName = scanner.nextLine();

            if (bookName.isEmpty()){
                break;
            }
            
            System.out.print("Pages: ");
            int pagesNumber = Integer.valueOf(scanner.nextLine());

            System.out.print("Publication year: ");
            int publicationYear = Integer.valueOf(scanner.nextLine());

            books.add(new Book(bookName, pagesNumber, publicationYear));

        }
        System.out.println();
        System.out.print("What information will be printed? ");
        String query = scanner.nextLine();

        for (Book eachBook: books){
            if (query.equals("everything")){
                System.out.println(eachBook);
            } else if (query.equals("name")){
                System.out.println(eachBook.getName());
            }
        }

    }
}
