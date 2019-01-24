package com.pls.techandallocationadviser.config;

import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

@Configuration
public class ApiConfig {

	public ObjectMapper objectMapper() {
		ObjectMapper objectMapper = new ObjectMapper();
		
		return new ObjectMapper();
	}
	
	public ObjectWriter objectWriter(ObjectMapper objectMapper) {
		return objectMapper.writerWithDefaultPrettyPrinter();

	}
}
