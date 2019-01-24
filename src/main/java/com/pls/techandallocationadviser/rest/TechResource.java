package com.pls.techandallocationadviser.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pls.techandallocationadviser.model.response.TechResponse;

@RestController
@RequestMapping(ResourceConstants.ADVISER_TECH_V1)
public class TechResource {
	
	@RequestMapping(path = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<TechResponse> getTechResponse() {
		return new ResponseEntity<>(new TechResponse(), HttpStatus.OK);
	}

}
