package com.example.study_java8.store.jpa;

import com.example.study_java8.domain.Board;
import com.example.study_java8.store.jpa.BoardStore;
import com.example.study_java8.store.jpa.jpo.BoardJpo;
import com.example.study_java8.store.jpa.repository.BoardRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Repository
@RequiredArgsConstructor
public class BoardJpaStore implements BoardStore {
    private final BoardRepository boardRepository;

    @Override
    public List<Board> findAllBoards() {
        return boardRepository.findAll().stream()
                .map(BoardJpo::toDomain)
                .sorted()
                .collect(Collectors.toList());
    }

    @Override
    public void save(BoardJpo boardJpo) {
        boardRepository.save(boardJpo);
    }
}
