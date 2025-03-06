package com.example.java_board.service;


import com.example.java_board.domain.entity.Board;
import com.example.java_board.domain.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

@Component
public class BoardService {
    private final BoardRepository boardRepository;

    @Autowired
    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    public Board createBoard(@RequestBody Board board) {
        return boardRepository.save(board);
    }
}
