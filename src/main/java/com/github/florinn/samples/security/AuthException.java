package com.github.florinn.samples.security;

@SuppressWarnings("serial")
public class AuthException extends RuntimeException {

	public AuthException() {
		super();
	}

	public AuthException(String message, Throwable cause) {
		super(message, cause);
	}

	public AuthException(String message) {
		super(message);
	}

	public AuthException(Throwable cause) {
		super(cause);
	}

}
