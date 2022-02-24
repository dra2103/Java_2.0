package com.daniel.loginandregistration.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.daniel.loginandregistration.models.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
	List<Book> findAll();
}
