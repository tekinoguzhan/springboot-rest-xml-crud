package com.otekin.springbootrestxml.repository;

import com.otekin.springbootrestxml.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
   List<Book> findByTitleContaining(String title);
}
