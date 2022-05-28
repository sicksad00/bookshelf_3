package ru.bookshelf.books.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.bookshelf.books.enteties.Book;

import java.util.List;

/**
 * @author Raphael Kalimullin <raphaelkalimullin@gmail.com>
 */
@Repository
public interface BooksRepository extends JpaRepository<Book, Long> {
    List<Book> findByTitleStartingWith(String title);
}
