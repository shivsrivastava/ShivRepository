package com.in28minutes.springboot.microservice.example.forex.springbootmicroserviceforexservice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.shivassignment.springboot.controller.AdditionController;
import com.shivassignment.springboot.service.AdditionServiceImpl;

@RunWith(SpringRunner.class)
@WebMvcTest(value = AdditionController.class, secure = false)
@SpringBootTest
public class SpringBootRestAdditionApplicationTests {

	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private AdditionServiceImpl additionServiceImpl;
	
	@Test
	public void contextLoads() {
	}
	@Test
	public void getSum() throws Exception {

		Integer mockSum=5;
		Mockito.when(
				additionServiceImpl.getSum((Mockito.anyInt()),
						Mockito.anyInt())).thenReturn(mockSum);

		RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
				"/sum/2/and/56").accept(
				MediaType.APPLICATION_JSON);

		MvcResult result = mockMvc.perform(requestBuilder).andReturn();

		System.out.println(result.getResponse());
		String expected = "58" ;
		JSONAssert.assertEquals(expected, result.getResponse()
				.getContentAsString(), false);
	}

}
