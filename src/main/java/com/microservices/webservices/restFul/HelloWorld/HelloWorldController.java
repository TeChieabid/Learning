package com.microservices.webservices.restFul.HelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	//@RequestMapping(method = RequestMethod.GET,path = "/hello-world")
@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "hello world";
	}
@GetMapping(path = "/hello-world-bean")
public  HelloWorldBean HelloWorldBean() {
	return new HelloWorldBean("Hello world");
}
@GetMapping(path = "/hello-world-bean/path-variable/{name}")
public  HelloWorldBean HelloWorldBean(@PathVariable String name) {
	return new HelloWorldBean(name);
}
}
