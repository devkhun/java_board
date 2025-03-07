package com.example.java_board;

import com.example.java_board.domain.entity.Board;
import com.example.java_board.domain.repository.BoardRepository;
import com.example.java_board.service.BoardService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class JavaBoardApplicationTests {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private BoardService boardService;

    @Autowired
    private BoardRepository boardRepository;

    @Test
    void contextLoads() {
    }

    @Test
    public void testDatabaseConnection() throws SQLException {
        try (Connection connection = dataSource.getConnection()) {
            // 데이터베이스에 정상적으로 연결되었는지 확인
            assertThat(connection).isNotNull();
            assertThat(connection.isValid(2)).isTrue(); // 연결이 유효한지 확인 (2초)
        }
    }

    @Test
    public void testInsertBoard() throws Exception {
        // Given: 테스트용 게시글 객체 생성
        Board board = new Board(
                "테스트 제목",
                "테스트 내용",
                "active",
                "작성자",
                0
        );

        // When: 게시글 저장
        Board savedBoard = boardService.createBoard(board);

        System.out.println(savedBoard.getBoardId());
        System.out.println(savedBoard.getBoardTitle());
        System.out.println(savedBoard.getCreatedAt());

        // Then: 저장된 게시글이 데이터베이스에 존재하는지 확인
        //assertNotNull(savedBoard.getId());  // 저장 후 id가 null이 아니어야 함
        //assertEquals("테스트 제목", savedBoard.getTitle());  // 제목이 맞는지 확인
        //assertEquals("테스트 내용", savedBoard.getContent());  // 내용이 맞는지 확인
    }
}
