package com.example.java_board.domain.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "board")
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "board_id")
    private Integer boardId; // 게시글 ID

    @Column(name = "board_title", nullable = false)
    private String boardTitle; // 게시글 제목

    @Column(name = "board_content", columnDefinition = "TEXT")
    private String boardContent; // 게시글 내용

    @Column(name = "board_status", nullable = false)
    private String boardStatus; // 게시글 상태 (예: active, deleted)

    @Column(name = "board_writer", nullable = false)
    private String boardWriter; // 작성자

    @Column(name = "view_cnt", nullable = false)
    private Integer viewCnt; // 조회수

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now(); // 생성일

    @Column(name = "updated_at")
    private LocalDateTime updatedAt = LocalDateTime.now(); // 수정일

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt; // 삭제일
}