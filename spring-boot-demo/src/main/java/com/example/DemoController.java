package com.example;

import com.model.PersonConfig;
import com.model.PersonModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

	@Autowired
	private PersonModel personModel;

	@Autowired
	private PersonConfig personConfig;
	
	@RequestMapping("/hello")
	@ResponseBody
	public String hello(){
		testGetDruid();
		return "hello world!";
	}

	private void testGetDruid(){
		System.out.println("personModel："+personModel);
	}
	
}
