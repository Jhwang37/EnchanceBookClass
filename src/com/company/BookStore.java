package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class BookStore {
    private String bookTitle;
    private String author;
    private String description;
    private int price;
    private boolean isInStock;
    private ArrayList<String> bookDB = new ArrayList<String>();
    Scanner scan = new Scanner(System.in);
    boolean start = true;

    public BookStore(){
        addBook();
        printBook();
        returnPrice();
    }
    public void addBook() {
        int x = 0;
        while (x < 5) {
            try {
                System.out.println("Enter Book Title: ");
                this.bookTitle = scan.nextLine();
                System.out.println("Enter Book Author: ");
                this.author = scan.nextLine();
                System.out.println("Enter Description: ");
                this.description = scan.nextLine();
                System.out.println("Is Book In Stock: true/false ");
                this.isInStock = scan.nextBoolean();
                scan.nextLine();
                String book = "Title: " + bookTitle + "\nAuthor: " + author +
                        "\nDescription: " + description + "\nIn Stock: " + isInStock;
                bookDB.add(book);
                x++;
            }catch(Exception e){
            System.out.println("Entered invalid input");
            continue;
        }
    }
    }
    public int returnPrice() {
        for(String x : bookDB){
            if(x.contains("true")){
                price += 20;
            }else{
                continue;
            }
        }
        System.out.println(price);
        return price;
    }

    public void printBook(){

        for(String x : bookDB){
            System.out.println("========");
            System.out.println(x);
            System.out.println("========");
        }
    }


    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean getIsInStock() {
        return isInStock;
    }

    public void setIsInStock(boolean isInStock) {
        this.isInStock = isInStock;
    }

    public ArrayList<String> getBookDB() {
        return bookDB;
    }

    public void setBookDB(ArrayList<String> bookDB) {
        this.bookDB = bookDB;
    }
}
