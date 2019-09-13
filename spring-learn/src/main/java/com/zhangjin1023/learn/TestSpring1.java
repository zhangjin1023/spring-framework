package com.zhangjin1023.learn;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @description:Spring配置类
 * @Date : 2019/9/12 13:25
 * @Author : zhang_jin
 */
@Configuration
@ComponentScan("com.zhangjin1023")
public class TestSpring1 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TestSpring1.class);
		DemoService demoService = context.getBean(DemoService.class);
		demoService.say();
	}
}
