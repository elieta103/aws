package com.tutorial.dockeraws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerAwsApplication {
	
	@GetMapping("/hola/{nombre}")
	public String holaMundo(@PathVariable("nombre") String nombre) {
		return "Hola "+nombre+" !!";
	}
	

	public static void main(String[] args) {
		SpringApplication.run(DockerAwsApplication.class, args);
	}

}
