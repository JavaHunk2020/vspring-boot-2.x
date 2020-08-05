package com.rab3tech.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CheckConfig {
	
	@Bean("nagen")
	public Jammer createJammer(){
		return new Jammer();
	}

}
