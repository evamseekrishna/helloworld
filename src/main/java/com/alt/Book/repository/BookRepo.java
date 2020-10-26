package com.alt.Book.repository;

import com.alt.Book.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book,String> {
}
