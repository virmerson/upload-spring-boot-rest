package br.com.fabricadeprogramador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableAutoConfiguration
@ComponentScan

//http://docs.spring.io/autorepo/docs/spring-boot/current/reference/html/using-boot-using-springbootapplication-annotation.html
@SpringBootApplication
public class EasyUploadApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasyUploadApplication.class, args);
	}
	
}
