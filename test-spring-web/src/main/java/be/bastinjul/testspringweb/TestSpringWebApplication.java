package be.bastinjul.testspringweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "be.bastinjul")
@EntityScan("be.bastinjul")
public class TestSpringWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestSpringWebApplication.class, args);
    }

}
