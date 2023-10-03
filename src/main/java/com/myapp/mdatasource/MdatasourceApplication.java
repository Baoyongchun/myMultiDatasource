package com.myapp.mdatasource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class MdatasourceApplication extends SpringBootServletInitializer {

	/**
	 * 该方法用于打war包,不打war包注释掉包括继承的父类
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {

		return super.configure(builder);
	}

	public static void main(String[] args) {
		SpringApplication.run(MdatasourceApplication.class, args);
	}

}
