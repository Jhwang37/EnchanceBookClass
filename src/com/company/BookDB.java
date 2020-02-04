package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class BookDB {
    Scanner scan = new Scanner(System.in);
    private ArrayList<String> bookDBS = new ArrayList<>();

    public BookDB() {

    }
    public BookDB(String SKU){//Overloaded Constructor
        addToDB();
//        searchDB();
        for (String x : bookDBS) {
            if (x.contains(SKU)) {
                System.out.println(x);
            } else {
                continue;
            }
        }
    }

    public void searchDB() {
        System.out.println("Enter the SKU to get information: ");
        System.out.println("Java1001\nJava1002\nOrcl1003\nPython1004\n" +
                "Zombie1005\nRasp1006");
        String input = scan.nextLine();
        for (String x : bookDBS) {
            if (x.contains(input)) {
                System.out.println(x);
            } else {
                continue;
            }
        }
    }

    public void addToDB() {
        bookDBS.add("Title: Head First Java\nAuthor: Kathy Sierra and Bert Bates\n" +
                "Description: Easy to read Java workbook\nPrice: 47.50\nSKU: Java1001\n");
        bookDBS.add("Title: Thinking in Java\nAuthor: Bruce Eckel\n" +
                "Description: Details about Java under the hood\nPrice: 20.00\n" +
                "SKU: Java 1002\n");
        bookDBS.add("Title: OCP: Oracle Certified Professional Java SE\n" +
                "Author: Jeanne Boyarsky\nDescription: Everything to you need to know in once place" +
                "\nPrice: 45.00\nSKU: ORCL1003\n");
        bookDBS.add("Title: Automate the Boring Stuff with Python\nAuthor: Al Sweigart" +
                "\nDescription: Fun with Python\nPrice: 10.50\nPython1004\n");
        bookDBS.add("Title: The Maker's Guide to the Zombie Apocalypse\nAuthor: Simon Monk\n" +
                "Description: Defend Your Base with Simple Circuits. Arduino, " +
                "Raspberry Pi\n");
        bookDBS.add("Title: Raspberry Pi Projects for the Evil Genius\nAuthor: Donald Norris" +
                "\nDescription: A dozen fiendishly fun projects for the Raspberry Pi\n" +
                "Price: 14.75\nSKU: Rasp1006");
    }

    public ArrayList<String> getBookDBS() {
        return bookDBS;
    }

    public void setBookDBS(ArrayList<String> bookDBS) {
        this.bookDBS = bookDBS;
    }
}
