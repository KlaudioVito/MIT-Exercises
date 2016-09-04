/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A4;

import java.util.ArrayList;

/**
 *
 * @author Klaudio Vito © 2016
 */
public class Library {
    // Add the missing implementation to this class
    private String libAddress;
    boolean borrowed;
    ArrayList <Book> books = new ArrayList <>();
    int bookIndex = 0;
    private Library (String libName){
        libAddress = libName;
    }
    
    private static void printOpeningHours(){
        System.out.println("Libraries are open daily from 9am to 5pm.");
    }
    
    private void printAddress(){
        System.out.println(libAddress);
    }
    
    private void addBook(Book book){
        books.add(book);
    }
    
    private void borrowBook(String title){
        boolean inCatalog = false;
        Book newBook = null;
        for (Book bk : books) {
            if (bk.getTitle().equals(title)) {
                inCatalog = true;
                newBook = bk;
            }
        }
        
        if(!inCatalog) System.out.println("Sorry, this book is not in our catalog.");
        else if(newBook.isBorrowed()) System.out.println("Sorry, this book is already borrowed.");
        else {
            newBook.borrowed();
            System.out.println("You successfully borrowed " + title);    
        }
        
    }
    
    private void printAvailableBooks(){
        if(books.isEmpty()) System.out.println("No book in catalog");
        else for(Book bk : books) if(!bk.isBorrowed()) System.out.println(bk.getTitle());
    }
    
    private void returnBook(String title){
        for(Book bk : books){
            if(bk.getTitle().equals(title)){
                bk.returned();
                System.out.println("You successfully returned " + title);
            }
        }
    }
    
    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }
}
