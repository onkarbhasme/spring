package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

	public Samosa createSamosa() {
		return new Samosa();
	}

	@Bean(name = "stud")
	public Student createStudent() {
		return new Student(createSamosa());
	}

}
