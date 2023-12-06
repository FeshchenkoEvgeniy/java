package net.proselyte.springbootbook.service;

import net.proselyte.springbootbook.model.Book;
import net.proselyte.springbootbook.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookService {
    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public Book findById(Long id){
        return bookRepository.getOne(id);
    }
    public List<Book> findAll(){
        return bookRepository.findAll();
    }
    public Book saveBook(Book user){
        return bookRepository.save(user);
    }
    public void deleteById(Long id){
        bookRepository.deleteById(id);
    }
}
