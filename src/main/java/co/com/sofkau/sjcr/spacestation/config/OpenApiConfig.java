package co.com.sofkau.sjcr.spacestation.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI openApi() {
        return new OpenAPI().info(apiInfo());
    }

    public Info apiInfo() {
        return new Info()
                .title("Space Station API")
                .description("Technical Straight: Training League")
                .version("v1.0.0")
                .license(new License()
                        .name("Apache License, Version 2.0")
                        .url("https://www.apache.org/licenses/LICENSE-2.0"))
                .contact(new Contact()
                        .name("STIWARD JHERIKOF CARRILLO RAMIREZ")
                        .url("https://stiwardjherikofcr.github.io/")
                        .email("stiwardcarrillo09@gmail.com"))
                .termsOfService("https://www.ufps.edu.co/");
    }

}