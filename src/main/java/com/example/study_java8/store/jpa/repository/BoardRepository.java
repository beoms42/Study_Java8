package com.example.study_java8.store.jpa.repository;

import com.example.study_java8.store.jpa.jpo.BoardJpo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Transactional(readOnly = true)
public interface BoardRepository extends CrudRepository<BoardJpo, String> {

    List<BoardJpo> findAll();
}
