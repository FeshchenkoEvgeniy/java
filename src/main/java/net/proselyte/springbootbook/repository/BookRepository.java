package net.proselyte.springbootbook.repository;

import net.proselyte.springbootbook.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
