package com.nt.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class RootConfig {
	static{
		System.out.println("RootConfig:static block");
	}

}
