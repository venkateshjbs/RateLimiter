package practise.projects.ratelimiter.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import practise.projects.ratelimiter.services.RateLimitingService;

@RestController
public class RateLimitingController {
	
	@Autowired
	private RateLimitingService rateLimitingService;
	
	@GetMapping(value="/hello")
	public ResponseEntity<String> getHelloResponse(){
		
		String response = rateLimitingService.returnHelloString();
		
		return new ResponseEntity<>(response,HttpStatus.OK);
		
	}

}
