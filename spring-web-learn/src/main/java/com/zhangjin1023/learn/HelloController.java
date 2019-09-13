package com.zhangjin1023.learn;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @description:测试Controller
 * @Date : 2019/9/12 13:43
 * @Author : zhang_jin
 */
@RestController
public class HelloController {

	@GetMapping("/hello")
	public String hello() {
		return "hello World";
	}

	@GetMapping("/filterTest")
	public String filterTest(ServletRequest request, ServletResponse response) {
		String attr_MyFilter = "attr_MyFilter";
		System.out.println(request.getAttribute(attr_MyFilter));
		return "filterTest";
	}
}
