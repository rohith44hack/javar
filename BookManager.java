package book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManager {

    static class Book {
        String title;
        String author;
        String ISBN;

        public Book(String title, String author, String ISBN) {
            this.title = title;
            this.author = author;
            this.ISBN = ISBN;
        }
    }

    static class BookCollection {
        ArrayList<Book> books;

        public BookCollection() {
            books = new ArrayList<>();
        }

        public void addBook(Book book) {
            books.add(book);
        }

        public void removeBook(String ISBN) {
            for (int i = 0; i < books.size(); i++) {
                if (books.get(i).ISBN.equals(ISBN)) {
                    books.remove(i);
                    break;
                }
            }
        }

        public void displayBooks() {
            for (Book book : books) {
                System.out.println("Title: " + book.title + ", Author: " + book.author + ", ISBN: " + book.ISBN);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookCollection collection = new BookCollection();

        while (true) {
            System.out.println("Enter the option:\n1. Add Book\n2. Remove Book\n3. Display Books");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline character

            if (choice == 1) {
                System.out.print("Enter Book Title: ");
                String title = scanner.nextLine();

                System.out.print("Enter Book Author: ");
                String author = scanner.nextLine();

                System.out.print("Enter Book ISBN: ");
                String ISBN = scanner.nextLine();

                Book newBook = new Book(title, author, ISBN);
                collection.addBook(newBook);
                System.out.println("Book added successfully!");
            } 
            else if (choice == 2) {
                System.out.print("Enter ISBN of the book to remove: ");
                String ISBN = scanner.nextLine();
                collection.removeBook(ISBN);
                System.out.println("Book removed (if it existed).");
            } 
            else if (choice == 3) {
                collection.displayBooks();
            } 
            else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
