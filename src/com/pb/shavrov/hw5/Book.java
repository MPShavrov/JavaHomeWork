package com.pb.shavrov.hw5;

public class Book {
    private String title;
    private String bookAuthor;
    private int theYearOfPublishing;

    public Book() {
    }

    public Book(String title, String bookAuthor, int theYearOfPublishing) {
        this.title = title;
        this.bookAuthor = bookAuthor;
        this.theYearOfPublishing = theYearOfPublishing;
    }

    public static void allBook(Object... book) {
        for (Object b : book) {
            System.out.println(b);
        }
    }

    public String getTitle() {
        return title;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public int getTheYearOfPublishing() {
        return theYearOfPublishing;
    }

    @Override
    public String toString() {
        return  title + "(" + bookAuthor + " " +  theYearOfPublishing + " г.)" ;
    }
}
