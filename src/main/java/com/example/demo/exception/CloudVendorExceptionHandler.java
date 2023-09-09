package com.example.demo.exception;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class CloudVendorExceptionHandler {
	
	
	@ExceptionHandler(value = {CloudVendorNotFoundException.class}) //exceptions to be handled by handler method
	/*
	 * This annotation is placed at the method level 
	 * It specifies the type of exception that this method should handle, 
	 * in this case, MyCustomException.class. This annotation acts as a filter,
	 * indicating that the method should only be invoked when an exception of the specified type is thrown.
	 * You can have multiple @ExceptionHandler methods in a class, 
	 * each handling a different type of exception. 
	 * This allows you to have specialized error handling logic for various exception types.
	 */
	public ResponseEntity<Object> handleCloudVendorNotFoundException 
										(CloudVendorNotFoundException cloudVendorNotFoundException){
		
		CloudVendorException cloudVendorException = new CloudVendorException
				(cloudVendorNotFoundException.getMessage(), cloudVendorNotFoundException.getCause(),
						HttpStatus.NOT_FOUND, ZonedDateTime.now(ZoneId.of("Z")));
		
		/*
		 * payload is created detailing the info the that the exception 
		 * will entail
		 */
	
		//return response entity
		return new ResponseEntity<>(cloudVendorException, HttpStatus.NOT_FOUND);
		
	}
}
