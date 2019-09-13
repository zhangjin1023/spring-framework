package com.zhangjin1023.learn;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @description:根容器配置类
 * @Date : 2019/9/13 13:01
 * @Author : zhang_jin
 */
@Configuration
@ComponentScan(basePackages = {"com.zhangjin1023.learn"},
		excludeFilters = {
				@ComponentScan.Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)
		})
public class RootConfig {
}
