package com.example.java_board.domain.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "board")
@NoArgsConstructor
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer boardId; // 게시글 ID

    private String boardTitle; // 게시글 제목

    private String boardContent; // 게시글 내용

    private String boardStatus; // 게시글 상태 (예: active, deleted)

    private String boardWriter; // 작성자

    private Integer viewCnt; // 조회수

    private LocalDateTime createdAt = LocalDateTime.now(); // 생성일

    private LocalDateTime updatedAt = LocalDateTime.now(); // 수정일

    private LocalDateTime deletedAt; // 삭제일

    @PostPersist
    public void onPostPersist() {
        System.out.println("Board entity has been persisted with ID: " + this.boardId);
    }

    @Builder
    public Board(String boardTitle,
                 String boardContent,
                 String boardStatus,
                 String boardWriter,
                 Integer viewCnt){
        this.boardTitle = boardTitle;
        this.boardContent = boardContent;
        this.boardStatus = boardStatus;
        this.boardWriter = boardWriter;
        this.viewCnt = viewCnt;
    }
}