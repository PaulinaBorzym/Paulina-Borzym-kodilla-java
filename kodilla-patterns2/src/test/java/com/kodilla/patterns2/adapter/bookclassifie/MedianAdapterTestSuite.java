package com.kodilla.patterns2.adapter.bookclassifie;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest(){
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("Author1","Title1",1999,"10"));
        bookSet.add(new Book("Author2","Title2",1989,"11"));
        bookSet.add(new Book("Author3","Title3",1945,"12"));
        bookSet.add(new Book("Author4","Title4",2009,"13"));
        bookSet.add(new Book("Author5","Title5",2001,"14"));
        bookSet.add(new Book("Author6","Title6",2019,"15"));
        bookSet.add(new Book("Author7","Title7",1992,"16"));
        //When
        int median = medianAdapter.publicationYearMedian(bookSet);
        //Then
        assertEquals(1999,median);
    }
}
