package com.example.java_board.controller;

import com.example.java_board.domain.dto.BoardDto;
import com.example.java_board.domain.entity.Board;
import com.example.java_board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/board")
public class BoardController {
    private final BoardService boardService;

    // 게시물 리스트 조회
    @GetMapping("/list")
    public void getList() {

    }

    // 게시물 등록
    @PostMapping("/register")
    public BoardDto register(@RequestBody BoardDto boardDto) {
        Board board = boardService.createBoard(boardDto);
        return new BoardDto(board);
    }

    // 특정 게시물 조회
    @GetMapping("/view/{id}")
    public void getBoardView(@PathVariable String id) {

    }

    // 게시물 수정
    @PostMapping("/modify")
    public void modify() {

    }

    // 게시물 삭제
    @PostMapping("/delete")
    public void delete() {

    }
}
