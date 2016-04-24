package com.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.exception.ExampleBadRequestException;
import com.spring.exception.ExampleForbiddenException;
import com.spring.exception.ExampleNotFoundException;

@RestController
public class ExampleController {
	
	
	@RequestMapping ("/success")
	public String success ()
	{
		return "Success";
	}
	
	@RequestMapping ("/forbidden")
	public String forbidden () throws Exception
	{
		throw new ExampleForbiddenException("Example forbidden response");
	}
	
	@RequestMapping ("/notFound")
	public String notFound () throws Exception
	{
		throw new ExampleNotFoundException("Example forbidden response");
	}
	
	@RequestMapping ("/badRequest")
	public String badRequest () throws Exception
	{
		throw new ExampleBadRequestException("Example forbidden response");
	}
	
	@RequestMapping ("/other")
	public String other () throws Exception
	{
		int i = 1 / 0;
		return "";
	}
	
	
	

}
