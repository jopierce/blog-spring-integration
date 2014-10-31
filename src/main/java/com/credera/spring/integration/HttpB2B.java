package com.credera.spring.integration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.credera.domain.Gender;
import com.credera.domain.Person;

public class HttpB2B {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/META-INF/spring/integration/spring-integration-context.xml");
		RequestGateway rg = context.getBean("inboundGateway",RequestGateway.class);
		Person p = new Person("Bob Smith","bsmith@bobsmith.com",77,Gender.MALE);
		String personReply = rg.post(p);
		
		String json = "{ name: \"Troy McLure\", age: \"-1\", email: \"tmclure@springfield.com\", gender: \"MALE\"}";
		String jsonReply = rg.post(json);		
	}
}
