package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
		Student student=context.getBean("student1", Student.class);
			
		System.out.println(student);
		System.out.println(student.getAddress());
			
		Teacher teacher1=context.getBean("teacher", Teacher.class);
		Teacher teacher2=context.getBean("teacher", Teacher.class);
		System.out.println("t1 "+teacher1.hashCode());
		System.out.println("t2 "+teacher2.hashCode());
	}

}
