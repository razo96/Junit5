package com.it;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    @Test
    void testObjectCreation(){
        Book book = new Book ("mybook" , 500 , "Razia");
        assertEquals("mybook",book.getTitle() );
        assertEquals(500, book.getPages());
        assertEquals("Razia",book.getAuthor());
    }

    @Test
    void testSetTitleWithNull(){
        Book book = new Book("myNewBook" , 450 , "Razia");
        book.setTitle(null);
        assertNotNull(book.getTitle());
    }

    @Test
    void testPagesThrows() {
        Book book = new Book("myAnotherBook", 250, "Razia");
        assertThrows(IllegalArgumentException.class,
                () -> book.setPages(-50)
        );
    }

}