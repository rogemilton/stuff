package com.roge;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.operations.MainOperations;

@RestController
@RequestMapping("/arithmetic")
public class ServiceController {

	//sample function
	@RequestMapping(value = "/factorial/{number}", method = RequestMethod.GET)
	public ResponseEntity<Integer> getFactorial(@PathVariable("number") int number) {

		Integer ans = MainOperations.factorial(number, 1);
		
		//case for negative numbers
		if(ans == -1) {
			return new ResponseEntity<Integer>(HttpStatus.NOT_ACCEPTABLE);
		}
		
		return new ResponseEntity<Integer>(ans, HttpStatus.OK);
		
	}
	
	
}
