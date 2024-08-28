package estudo.rest_springboot_application;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(servers = { @Server(url = "/", description = "Defaut Server URL")})
@SpringBootApplication
public class RestSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestSpringbootApplication.class, args);
	}

}
