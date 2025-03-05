package com.example.java_board.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/board")
public class BoardController {
    // 게시물 리스트 조회
    @GetMapping("/list")
    public void getList() {

    }

    // 게시물 등록
    @PostMapping("/register")
    public void register() {

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
