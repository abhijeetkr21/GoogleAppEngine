package com.google.googleEngineApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoogleEngineAppController {

	@RequestMapping(method = RequestMethod.GET, path = "/", produces= "text/plain")
	public String googleAppStarter()
	{
		return "Hello Google Engine App";
	}

}
