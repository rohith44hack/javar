package library;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static class Book {
        String title;
        String author;
        String isbnNumber;

        public Book(String title, String author, String isbnNumber) {
            this.title = title;
            this.author = author;
            this.isbnNumber = isbnNumber;
        }

        public void displayBook() {
            System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbnNumber);
        }
    }

    static class BookManager {
        ArrayList<Book> books = new ArrayList<>();

        public void addBook(Book book) {
            books.add(book);
        }

        public void removeBook(String isbn) {
            books.removeIf(<any> book -> book.isbnNumber.equals(isbn));
        }

        public void displayBooks() {
            if (books.isEmpty()) {
                System.out.println("No books in the collection.");
            } else {
                for (Book book : books) {
                    book.displayBook();
                }
            }
        }
    }

    public static void main(String[] args) {
        BookManager manager = new BookManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Display Books");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Title: ");
                String title = scanner.nextLine();
                System.out.print("Author: ");
                String author = scanner.nextLine();
                System.out.print("ISBN: ");
                String isbn = scanner.nextLine();
                manager.addBook(new Book(title, author, isbn));
            } else if (choice == 2) {
                System.out.print("Enter ISBN to remove: ");
                String isbn = scanner.nextLine();
                manager.removeBook(isbn);
            } else if (choice == 3) {
                manager.displayBooks();
            }

        } while (choice != 4);

        scanner.close();
    }
}
