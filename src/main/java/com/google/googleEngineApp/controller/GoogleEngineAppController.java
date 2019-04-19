package com.google.googleEngineApp.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/google/app")
public class GoogleEngineAppController {

	@RequestMapping(method = RequestMethod.GET, path = "/start/{appName}", produces= "text/plain")
	public String googleAppStarter(@PathVariable String appName)
	{
		return "Hello " + appName;
	}

}
