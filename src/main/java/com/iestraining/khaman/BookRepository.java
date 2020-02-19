package com.iestraining.khaman;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class BookRepository {
    private static Map<Long, Book> bookRepo = new HashMap<>();

    //    Atomically incremented sequence numbers
    private final AtomicLong counter = new AtomicLong();

    public void genDummyData() {
        Book book1 = Book.builder()
                .id(counter.getAndIncrement())
                .title("Elon Meow")
                .author("Khaman")
                .price(1010.10f)
                .genre("Documentary")
                .rating(100)
                .build();
        Book book2 = Book.builder()
                .id(counter.getAndIncrement())
                .title("1")
                .author("1")
                .price(1)
                .genre("Math")
                .rating(1)
                .build();
        bookRepo.put(book1.getId(), book1);
        bookRepo.put(book2.getId(), book2);
    }


    //    CREATE
    public void addBook(Book response) {
        //    add book with new ID
        Long newID = response.getId();
        while (bookRepo.containsKey(newID)) {
            newID = counter.getAndIncrement();
        }
        Book newBook = Book.builder()
                .id(newID)
                .title(response.getTitle())
                .author(response.getAuthor())
                .price(response.getPrice())
                .genre(response.getGenre())
                .rating(response.getRating())
                .build();
        bookRepo.put(newBook.getId(), newBook);
    }


    //    READ
    public Book getBook(Long id) {
        return bookRepo.get(id);
    }

    public List<Book> getAllBooks() {
        List<Book> books = new ArrayList<>();
        for (Map.Entry<Long, Book> entry : bookRepo.entrySet()) {
            books.add(entry.getValue());
        }
        return books;
    }

    //    UPDATE
    public void editPrice(Long id, float price) {
        Book book = bookRepo.get(id);
        book.setPrice(price);
        bookRepo.replace(id, book);
    }

    public void giveRating(Long id, float rating) {
        Book book = bookRepo.get(id);
        book.setRating(rating);
    }

    //    DELETE
    public void deleteBook(Long id) {
        bookRepo.remove(id);
    }


}