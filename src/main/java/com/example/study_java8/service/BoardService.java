package com.example.study_java8.service;

import com.example.study_java8.domain.Board;
import com.example.study_java8.store.jpa.BoardStore;
import com.example.study_java8.store.jpa.jpo.BoardJpo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardStore boardStore;

    public void save(Board board) {
        boardStore.save(new BoardJpo(
                board.getTitle(),
                board.getContent()
        ));
    }

    public List<Board> findAll() {
        return boardStore.findAllBoards();
    }
}
