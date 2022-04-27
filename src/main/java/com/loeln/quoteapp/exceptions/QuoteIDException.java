package com.loeln.quoteapp.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(HttpStatus.BAD_REQUEST)
public class QuoteIDException extends RuntimeException {


	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public QuoteIDException(String message) {
		super(message);
	}
}
