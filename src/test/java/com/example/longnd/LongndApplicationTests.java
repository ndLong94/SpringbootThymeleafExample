package com.example.longnd;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class LongndApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void test() {
        assertThat("test".getClass().getName()).isEqualTo("java.lang.String");
    }

}
