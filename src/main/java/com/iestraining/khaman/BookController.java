package com.iestraining.khaman;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController // == @Controller and @ResponseBody
@EnableAutoConfiguration  //  This enables auto configuration for the Application Context.
public class BookController {

    @Autowired
    private BookRepository bookRepository;

//    GET METHOD
    @GetMapping(value = BookRestURIConstants.GET_ALL_BOOK, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Book> getAllBooks() {
        return bookRepository.getAllBooks();
    }

    @GetMapping(value = BookRestURIConstants.GET_BOOK, produces = MediaType.APPLICATION_JSON_VALUE)
    public Book getBook(@PathVariable Long id) {
        return bookRepository.getBook(id);
    }

//    POST METHOD
//    Empty Post
    @PostMapping(value = BookRestURIConstants.GENERATE_DUMMY_BOOK)
    public void generateDummy() {
        bookRepository.genDummyData();
    }

//    Example of using @RequestBody
    @PostMapping(value = BookRestURIConstants.ADD_BOOK)
    public void addBook(@RequestBody Book book) {
        bookRepository.addBook(book);
    }

//    PUT METHOD
//    Example of using @PathVariable and @RequestBody
    @PutMapping(value = BookRestURIConstants.UPDATE_PRICE)
    public void editPrice(@PathVariable Long id, @RequestParam float price) {
        bookRepository.editPrice(id,price);
    }
//    Example of using @PathVariable and @RequestParam
    @PutMapping(value = BookRestURIConstants.UPDATE_RATING)
    public void editRating(@PathVariable Long id,  float rating) {  //--- Even without @RequestParam still works
        bookRepository.giveRating(id,rating);
    }

//    DELETE METHOD
    @DeleteMapping(value = BookRestURIConstants.DELETE_BOOK)
    public void deleteBook(@PathVariable Long id){
        bookRepository.deleteBook(id);
    }



}
