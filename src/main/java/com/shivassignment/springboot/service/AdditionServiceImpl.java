package com.shivassignment.springboot.service;

import org.springframework.stereotype.Component;

@Component
public class AdditionServiceImpl implements AdditionService
{
	public int getSum(int first, int second){
		return first+second;
	}
}
