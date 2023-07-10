package org.jsp.bootcrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@SpringBootApplication
@OpenAPIDefinition(info=@Info(title = "BooCrud",description = "This is simple project" 
,version = "SNAPSHOT v0.01" ,contact = @Contact(url = "www.google.com",name = "RASHWAH J",
 email = "rashwathjk@gmail.com"),
license = @License(name = "All Rights Reserved",url = "www.google.com")))
public class BootCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootCrudApplication.class, args);
		System.out.println("wellcome to Bootcrud operation Rashwath ");
		System.out.println("wellcome to Bootcrud operation Rashwath ");
	}

}
