package com.Swagger.swagger;

import java.beans.AppletInitializer;
import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class SwaggerApplication {

public static void main(String[] args) {
SpringApplication.run(SwaggerApplication.class, args);
}

@Bean
public Docket swaggerConfig()
{

return new Docket(DocumentationType.SWAGGER_2)
.select().apis(RequestHandlerSelectors.basePackage("com.Swagger.swagger"))
.paths(PathSelectors.ant("/myapi/**"))
.build().apiInfo(apiInfo());

}

public ApiInfo apiInfo()
{
return new ApiInfo(
"My REST API",
"Student Api Docs",
"2.x",
"Terms of service",
new Contact("info@raj.com", "www.rajApis.com", "info@rajApi.com"),
"www.rajApis.com",
"url",Collections.emptyList()
);


}



}
