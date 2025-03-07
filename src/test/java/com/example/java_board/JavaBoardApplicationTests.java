package com.example.java_board;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class JavaBoardApplicationTests {

    @Autowired
    private DataSource dataSource;

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
}
