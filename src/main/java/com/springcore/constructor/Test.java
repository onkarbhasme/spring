package com.springcore.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/constructor/constconfig.xml");
		Person p1 = (Person) context.getBean("person1");
		Person p2 = (Person) context.getBean("person2");
		Addition a = (Addition)context.getBean("add");
		System.out.println(p1);
		System.out.println(p2);
		a.doSum();
	}

}
