package com.project.library.main;

import com.project.library.libraryimplementation.LibraryImplementation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LibraryImplementation li=new LibraryImplementation();
        System.out.println("Choose the operation you want to perform");
        System.out.println("Enter 1 for issue book");
        System.out.println("Enter 2 for return book ");
        System.out.println("Enter 3 for display all books");
        System.out.println("Enter 4 for display available books");
        System.out.println("Enter 5 for Search book by TITLE");
        System.out.println("Enter 6 for Search book by Author");
        System.out.println("Enter 7 for Search book by ISBN");
        int ch=sc.nextInt();
        switch(ch)
        {

            case 1: System.out.println("enter the title of the book");
                String title=sc.nextLine();
                li.issueBook(title);
                break;
            case 2:
        }

    }
}
