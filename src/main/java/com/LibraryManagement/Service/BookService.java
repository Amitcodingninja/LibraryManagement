package com.LibraryManagement.Service;

import com.LibraryManagement.DTO.BookDTO;
import com.LibraryManagement.Entity.Book;
import com.LibraryManagement.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    private static final Logger logger = Logger.getLogger(BookService.class.getName());

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book getBookById(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if (optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            logger.warning("Book with ID " + id + " not found");
            return null;
        }
    }

    public Book addBook(BookDTO bookDTO) {
        Book book = mapToEntity(bookDTO);
        return bookRepository.save(book);
    }

    public Book updateBook(Long id, BookDTO bookDTO) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if (optionalBook.isPresent()) {
            Book oldBook = optionalBook.get();
            oldBook.setTitle(bookDTO.getTitle());
            oldBook.setAuthor(bookDTO.getAuthor());
            oldBook.setIsbn(bookDTO.getIsbn());
            oldBook.setIsAvailable(bookDTO.getIsAvailable());
            oldBook.setQuantity(bookDTO.getQuantity());
            return bookRepository.save(oldBook);
        }
        return null;
    }

    public void deleteBookById(Long id) {
        bookRepository.deleteById(id);
    }

    private Book mapToEntity(BookDTO bookDTO) {
        Book book = new Book();
        book.setTitle(bookDTO.getTitle());
        book.setAuthor(bookDTO.getAuthor());
        book.setIsbn(bookDTO.getIsbn());
        book.setIsAvailable(bookDTO.getIsAvailable());
        book.setQuantity(bookDTO.getQuantity());
        return book;
    }
}