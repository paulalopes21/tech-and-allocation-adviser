package com.pls.techandallocationadviser.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pls.techandallocationadviser.model.request.TechRequest;
import com.pls.techandallocationadviser.model.response.TechResponse;

@RestController
@RequestMapping(ResourceConstants.ADVISER_TECH_V1)
public class TechResource {
	
	@RequestMapping(path = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<TechResponse> getTechResponse() {
		return new ResponseEntity<>(new TechResponse(), HttpStatus.OK);
	}
	
	@RequestMapping(path = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE,
			consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<TechResponse> createReservation(
			TechRequest techRequest){
		return new ResponseEntity<>(new TechResponse(), HttpStatus.CREATED);
	}
	
	@RequestMapping(path = "", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE,
			consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<TechResponse> updateReservation(
			TechRequest reservationRequest){
		return new ResponseEntity<>(new TechResponse(), HttpStatus.OK);
	}
	
	@RequestMapping(path = "/{adviserId}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteReservation(
			@PathVariable
			long adviserId){
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
}
