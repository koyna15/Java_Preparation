package Cipher;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

class Book {
    String bookName;
    String authorName;
    boolean isIssued;

    Book(String bookName, String authorName) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.isIssued = false;
    }

    @Override
    public String toString() {
        String status = isIssued ? "Issued" : "Available";
        return "Book Name: \"" + bookName + "\", Author: " + authorName + " [Status: " + status + "]";
    }
}

public class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("✅ Book added successfully: " + book.bookName);
    }

    public void showAllBooks() {
        System.out.println("\n--- Library Collection ---");
        if (books.isEmpty()) {
            System.out.println("The library is currently empty.");
        } else {
            for (int i = 0; i < books.size(); i++) {
                System.out.println((i + 1) + ". " + books.get(i));
            }
        }
        System.out.println("------------------------\n");
    }

    private Book findBook(String bookName) {
        for (Book book : books) {
            if (book.bookName.equalsIgnoreCase(bookName)) {
                return book;
            }
        }
        return null;
    }

    public void issueBook(String bookName) {
        Book book = findBook(bookName);
        if (book != null) {
            if (!book.isIssued) {
                book.isIssued = true;
                System.out.println("✅ Successfully issued: " + book.bookName);
            } else {
                System.out.println("❌ Sorry, \"" + book.bookName + "\" is already issued.");
            }
        } else {
            System.out.println("❌ Book not found in the library.");
        }
    }

    public void returnBook(String bookName) {
        Book book = findBook(bookName);
        if (book != null) {
            if (book.isIssued) {
                book.isIssued = false;
                System.out.println("✅ Thank you for returning: " + book.bookName);
            } else {
                System.out.println("❗ This book was not issued from this library.");
            }
        } else {
            System.out.println("❌ Book not found in the library.");
        }
    }

    public void removeBook(String bookName) {
        Iterator<Book> iterator = books.iterator();
        boolean found = false;
        while(iterator.hasNext()) {
            Book book = iterator.next();
            if (book.bookName.equalsIgnoreCase(bookName)) {
                iterator.remove();
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("🗑️ Successfully removed \"" + bookName + "\" from the library.");
        } else {
            System.out.println("❌ Book not found, could not remove.");
        }
    }

    public static void main(String[] args) {
        Library myLibrary = new Library();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Library Management Tracker! 📚");

        myLibrary.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
        myLibrary.addBook(new Book("1984", "George Orwell"));
        myLibrary.addBook(new Book("To Kill a Mockingbird", "Harper Lee"));

        while (true) {
            System.out.println("\nPlease choose an option:");
            System.out.println("1. Show All Books");
            System.out.println("2. Add a New Book");
            System.out.println("3. Issue a Book");
            System.out.println("4. Return a Book");
            System.out.println("5. Remove a Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    myLibrary.showAllBooks();
                    break;
                case 2:
                    System.out.print("Enter book name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter author name: ");
                    String author = scanner.nextLine();
                    myLibrary.addBook(new Book(name, author));
                    break;
                case 3:
                    System.out.print("Enter the name of the book to issue: ");
                    String issueName = scanner.nextLine();
                    myLibrary.issueBook(issueName);
                    break;
                case 4:
                    System.out.print("Enter the name of the book to return: ");
                    String returnName = scanner.nextLine();
                    myLibrary.returnBook(returnName);
                    break;
                case 5:
                    System.out.print("Enter the name of the book to remove: ");
                    String removeName = scanner.nextLine();
                    myLibrary.removeBook(removeName);
                    break;
                case 6:
                    System.out.println("Thank you for using the Library Tracker! Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        }
    }
}
