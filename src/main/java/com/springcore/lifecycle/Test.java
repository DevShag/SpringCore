package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycleconfig.xml");
		Samosa s1=(Samosa) context.getBean("samosa");
		System.out.println(s1);
		
//		resgistering shut down hook
		context.registerShutdownHook();
		

	}

}
