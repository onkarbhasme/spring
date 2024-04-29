package com.springcore.autowiring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowiring/annotation/autoconfig.xml");
		Emp e1 = (Emp) context.getBean("e1");
		System.out.println(e1);
	}

}
