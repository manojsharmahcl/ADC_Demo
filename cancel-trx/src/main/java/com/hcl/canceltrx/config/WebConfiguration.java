package com.hcl.canceltrx.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;


@Configuration
public class WebConfiguration implements WebMvcConfigurer {
	@Override
	public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
		configurer.defaultContentType(MediaType.APPLICATION_JSON);
	}
	@Bean
    public ObjectMapper objectMapper() {

        Jackson2ObjectMapperBuilder builder = new Jackson2ObjectMapperBuilder();           
        builder.featuresToEnable(
                JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES);
       ObjectMapper obj= builder.build();
       obj.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        return obj;
    }
	
	 @Bean
	    public ModelMapper modelMapper() {
	        return new ModelMapper();
	    }

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addRedirectViewController("/v2/swagger.json", "/v2/api-docs");
	}
	
}
