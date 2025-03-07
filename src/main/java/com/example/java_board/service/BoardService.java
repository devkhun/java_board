package com.example.java_board.service;


import com.example.java_board.domain.entity.Board;
import com.example.java_board.domain.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

@Component
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    public Board createBoard(@RequestBody Board board) {
        return boardRepository.save(board);
    }
}
