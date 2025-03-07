package com.example.java_board.service;


import com.example.java_board.domain.dto.BoardDto;
import com.example.java_board.domain.entity.Board;
import com.example.java_board.domain.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

@Component
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    public Board createBoard(@RequestBody BoardDto boardDto) {
        Board board = new Board();
        board.setBoardTitle(boardDto.getBoardTitle());
        board.setBoardContent(boardDto.getBoardContent());
        board.setBoardStatus(boardDto.getBoardStatus());
        board.setBoardWriter(boardDto.getBoardWriter());

        return boardRepository.save(board);
    }
}
