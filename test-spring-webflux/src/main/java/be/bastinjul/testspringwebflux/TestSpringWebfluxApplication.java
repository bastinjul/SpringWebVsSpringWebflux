package be.bastinjul.testspringwebflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "be.bastinjul")
@EntityScan("be.bastinjul")
public class TestSpringWebfluxApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestSpringWebfluxApplication.class, args);
	}

}
