package vlv.springframework.spring6webapp.services;

import vlv.springframework.spring6webapp.domain.Author;

public interface AuthorService {
    Iterable<Author> findAll();
}
