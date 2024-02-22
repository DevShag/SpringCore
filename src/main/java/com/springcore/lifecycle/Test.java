package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycleconfig.xml");
//		resgistering shut down hook
		context.registerShutdownHook();
		
//		Samosa s1=(Samosa) context.getBean("samosa");
//		System.out.println(s1);
//		
//		
//		ColdDrink pepsi=(ColdDrink)context.getBean("pepsi");
//		System.out.println(pepsi);
		
		AnnotationExample example=(AnnotationExample)context.getBean("example");
		System.out.println(example);
	}

}
