package com.daniel.dojosandninjas.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.daniel.dojosandninjas.models.Ninja;


@Repository
public interface NinjaRepo extends CrudRepository<Ninja, Long> {
	// this method retrieves all the books from the database
    List<Ninja> findAll();
    
    List<Ninja> findByDojo_id(Long id);
    // this method finds books with descriptions containing the search string
//    List<Ninja> findByDescriptionContaining(String search);
    // this method counts how many titles contain a certain string
//    Long countByTitleContaining(String search);
    // this method deletes a book that starts with a specific title
//    Long deleteByTitleStartingWith(String search);

}
