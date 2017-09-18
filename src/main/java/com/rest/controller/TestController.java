/**
 * 
 */
package com.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.repository.TestService;

/**
 * @author AnudeepKumar
 *
 */
@RestController
public class TestController {

	@Autowired
	@Qualifier("testService")
	private TestService testService;

	@RequestMapping(value="/testMethod",method=RequestMethod.GET,produces=MediaType.TEXT_PLAIN_VALUE)
	public String testMethod() {
		System.out.println("Method in Controller");
		testService.testMethod();
		return "Hello Spring Rest";
	}
	@RequestMapping(value="/testMethod1",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<String> testMethod1() {
		System.out.println("Method in Controller");
		testService.testMethod();
		List<String> list= new ArrayList<String>();
		list.add("Hello");
		list.add("Spring");
		list.add("Rest");
		return list;
	}

}
