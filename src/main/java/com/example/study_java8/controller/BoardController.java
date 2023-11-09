package com.example.study_java8.controller;

import com.example.study_java8.domain.Board;
import com.example.study_java8.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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

    @PutMapping("update")
    public void updateOne(
            @RequestBody Board board) {
        boardService.updateOne(board);
    }

    @DeleteMapping("delete")
    public void deleteOne(
            @PathVariable("title") String title
    ) {
        boardService.deleteOne(title);
    }
}
