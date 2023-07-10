package org.jsp.bootcrud.ExcepionHandling;

import org.springframework.http.HttpStatus;

public class CloudVenderException {
private final String message;
private final Throwable throwable;
private final HttpStatus status;
public CloudVenderException(String message, Throwable throwable, HttpStatus status) {
	super();
	this.message = message;
	this.throwable = throwable;
	this.status = status;
}
public final String getMessage() {
	return message;
}
public final Throwable getThrowable() {
	return throwable;
}
public final HttpStatus getStatus() {
	return status;
}

}
