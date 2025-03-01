package com.NAFKOK.graphQlLearning.repository;

import com.NAFKOK.graphQlLearning.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

}
