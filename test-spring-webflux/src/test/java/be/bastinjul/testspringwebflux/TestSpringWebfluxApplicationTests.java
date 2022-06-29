package be.bastinjul.testspringwebflux;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(locations = "classpath:test.properties")
class TestSpringWebfluxApplicationTests {

	@Test
	void contextLoads() {
	}

}
