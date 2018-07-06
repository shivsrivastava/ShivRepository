package com.shivassignment.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.shivassignment.springboot.service.AdditionServiceImpl;

@RestController
public class AdditionController {
  
	@Autowired
	private AdditionServiceImpl additionServiceImpl;
	
  @GetMapping("/sum/{first}/and/{second}")
  public int  sum(@PathVariable int first, @PathVariable int second){  
	 //return first+second; 
    return additionServiceImpl.getSum(first, second);
  }
}
