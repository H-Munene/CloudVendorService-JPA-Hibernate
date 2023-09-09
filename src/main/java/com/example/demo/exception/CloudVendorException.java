package com.example.demo.exception;

import java.time.ZonedDateTime;

import org.springframework.http.HttpStatus;

public class CloudVendorException {
	
	private final String messsageString;
	private final Throwable throwable;
	private final HttpStatus httpStatus;
	private final ZonedDateTime timespamp;
	
	//constructor
	public CloudVendorException(String messsageString, Throwable throwable, HttpStatus httpStatus,
			ZonedDateTime timespamp) {
		super();
		this.messsageString = messsageString;
		this.throwable = throwable;
		this.httpStatus = httpStatus;
		this.timespamp = timespamp;
	}
	//getter - setters

	
	public String getMesssageString() {
		return messsageString;
	}

	public ZonedDateTime getTimespamp() {
		return timespamp;
	}


	public Throwable getThrowable() {
		return throwable;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
	
	
	
	
}
