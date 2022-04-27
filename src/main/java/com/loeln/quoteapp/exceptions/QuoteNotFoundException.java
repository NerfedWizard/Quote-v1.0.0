package com.loeln.quoteapp.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(HttpStatus.BAD_REQUEST)
public class QuoteNotFoundException extends RuntimeException {


	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public QuoteNotFoundException(String message) {
		super(message);
	}

}
