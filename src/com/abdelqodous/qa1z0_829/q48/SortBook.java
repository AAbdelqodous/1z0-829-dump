package com.abdelqodous.qa1z0_829.q48;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortBook {
    public static void main(String[] args) {

        /*List books = List.of( new Book("A1","T1"),      //line 1
                            new Book("A2","T2"),
                            new Book("A1","T2"));*/

        /*List books = Arrays.asList( new Book("A1","T1"),      //line 1
                                    new Book("A2","T2"),
                                    new Book("A1","T2"));*/

        /*List books = Arrays.asList( new Book("A1","T1"),      //line 1
                                    new Book("A2","T2"),
                                    new Book("A1","T2"));*/

        List books = new ArrayList<Book>();
        books.add( new Book("A1","T1"));     //line 1
        books.add( new Book("A2","T2"));
        books.add( new Book("A1","T2"));

//        books.sort( (Book a, Book b) -> a.title.compareTo(b.title));    //line 2
//        books.stream().sorted((Book a, Book b) -> a.title.compareTo(b.title));
//        books.stream().sorted(); // same order as you entered

        System.out.println(books);
    }
}
