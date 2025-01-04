package cst339;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Topic1 {

	public static void main(String[] args) {
		
		System.out.println("Topic1 before");
		
		SpringApplication.run(Topic1.class, args);
		
		System.out.println("Topic1 after");
	}

}
