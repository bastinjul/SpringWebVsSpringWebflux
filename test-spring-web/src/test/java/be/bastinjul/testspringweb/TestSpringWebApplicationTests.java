package be.bastinjul.testspringweb;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(locations = "classpath:test.properties") //TODO: add specific database for the tests
class TestSpringWebApplicationTests {

    @Test
    void contextLoads() {
    }

}
