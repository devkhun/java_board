package com.example.java_board.domain.dto;

import java.util.Date;

public class BoardDto {
    private Integer boardId; // 게시글 ID
    private String boardTitle; // 게시글 제목
    private String boardContent; // 게시글 내용
    private String boardStatus; // 게시글 상태 (예: active, deleted)
    private String boardWriter; // 작성자
    private String viewCnt; // 조회수
    private Date createdAt; // 생성일
    private Date updatedAt; // 수정일
    private Date deletedAt; // 삭제일
}
