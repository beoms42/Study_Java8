package com.example.study_java8.store.jpa;

import com.example.study_java8.domain.Board;
import com.example.study_java8.store.jpa.jpo.BoardJpo;

import java.util.List;
import java.util.Optional;

public interface BoardStore {

    List<Board> findAllBoards();

    void save(BoardJpo boardJpo);

    void deleteById(String title);

    void update(Board board);

    Optional<BoardJpo> findById(String title);
}
