package com.myApp.microservices.limitservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitConfigurationController {
	
	@Autowired
	private ConfigurationService configurationService;
	//http://localhost:8081/getLimits
	@GetMapping("/getLimits")
	public LimitConfiguration retrieveLimitFromConfiguration() {
		return new LimitConfiguration(configurationService.getMinimum(),configurationService.getMaximum());
	}
	

}
