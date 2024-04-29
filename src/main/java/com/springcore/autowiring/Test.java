package com.springcore.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowiring/autoconfig.xml");
		Emp e1 = (Emp) context.getBean("e1");
		Emp e2 = (Emp) context.getBean("e2");
		Emp e3 = (Emp) context.getBean("e3");
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
	}

}
