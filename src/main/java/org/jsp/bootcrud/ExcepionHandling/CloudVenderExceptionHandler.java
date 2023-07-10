package org.jsp.bootcrud.ExcepionHandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class CloudVenderExceptionHandler {
	
@ExceptionHandler(value = CloudVenderNotFoundException.class)
	public ResponseEntity<Object>handlerCloudVenderException
	                             (CloudVenderNotFoundException e){
		
		CloudVenderException exception=new CloudVenderException
				                           (e.getMessage(),
				                             e.getCause(), 
				                            HttpStatus.NOT_FOUND);
		
		
		
		
									return new ResponseEntity<>(exception,HttpStatus.NOT_FOUND);
		
	}
}
