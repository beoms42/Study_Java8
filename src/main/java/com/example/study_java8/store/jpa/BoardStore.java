package com.example.study_java8.store.jpa;

import com.example.study_java8.domain.Board;
import com.example.study_java8.store.jpa.jpo.BoardJpo;

import java.util.List;

public interface BoardStore {

    List<Board> findAllBoards();

    void save(BoardJpo boardJpo);

}
