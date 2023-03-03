package vlv.springframework.spring6webapp.services;

import vlv.springframework.spring6webapp.domain.Book;

public interface BookService {
    Iterable<Book> findAll();
}
