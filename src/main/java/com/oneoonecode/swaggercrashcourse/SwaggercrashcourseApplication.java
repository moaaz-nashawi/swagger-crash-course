package com.oneoonecode.swaggercrashcourse;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "NFP Employee API", version = "1.0.0"), servers = {
		@Server(url = "http://localhost:8080")})

//@SecurityScheme(name = "basic", scheme = "basic", type = SecuritySchemeType.HTTP)
//@SecurityScheme(name = "bearer", type = SecuritySchemeType.DEFAULT)

@SecurityScheme(name = "bearer", type = SecuritySchemeType.HTTP, scheme = "bearer", bearerFormat = "JWT",
		description = "Bearer token contain the following parameters: employeeId, employerId")
public class SwaggercrashcourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggercrashcourseApplication.class, args);
	}

}
