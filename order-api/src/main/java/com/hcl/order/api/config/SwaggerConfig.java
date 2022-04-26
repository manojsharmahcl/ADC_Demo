package com.hcl.order.api.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Value("${app.components.scan.controllers}")
	String basePackage;

	@Bean
	public Docket customDocket() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage(basePackage)).paths(PathSelectors.regex("/.*")).build()
				.apiInfo(apiInfo());
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("CodeGen Apis")
				.description("Codegen project for Java Spring Boot app auto code generation").version("1.0.0")
				.termsOfServiceUrl("Terms of service").contact(new Contact("Susanth", "HCL", "susanthb@hcl.com"))
				.license("License of API").licenseUrl("https://swagger.io/docs/").build();
	}
}
