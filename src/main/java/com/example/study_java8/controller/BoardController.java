package com.example.study_java8.controller;

import com.example.study_java8.domain.Board;
import com.example.study_java8.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("board")
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @GetMapping("save")
    public void save(@RequestBody Board board){
        boardService.save(board);
    }

    @GetMapping("findAll")
    public List<Board> findAll() {
        return boardService.findAll();
    }
}
