package com.emp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.entity.Emp;

public class Run {

	@SuppressWarnings("resource")
	public static void main(String[] args) {		
		ApplicationContext ac = new ClassPathXmlApplicationContext("required-annotation.xml");

		Emp emp = ac.getBean("myemployee", Emp.class);
		System.out.println(emp.toString());
	}
}