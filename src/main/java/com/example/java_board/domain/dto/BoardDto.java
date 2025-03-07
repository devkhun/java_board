package com.example.java_board.domain.dto;

import com.example.java_board.domain.entity.Board;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class BoardDto {
    private Integer boardId; // 게시글 ID
    private String boardTitle; // 게시글 제목
    private String boardContent; // 게시글 내용
    private String boardStatus; // 게시글 상태 (예: active, deleted)
    private String boardWriter; // 작성자
    private Integer viewCnt; // 조회수
    private LocalDateTime createdAt; // 생성일
    private LocalDateTime updatedAt; // 수정일
    private LocalDateTime deletedAt; // 삭제일

    public BoardDto(Board board) {
        this.boardId = board.getBoardId();
        this.boardTitle = board.getBoardTitle();
        this.boardStatus = board.getBoardStatus();
        this.boardWriter = board.getBoardWriter();
        this.viewCnt = board.getViewCnt();
        this.createdAt = board.getCreatedAt();
        this.updatedAt = board.getUpdatedAt();
        this.deletedAt = board.getDeletedAt();
    }
}
