package com.credera.spring.integration;

import com.credera.domain.Person;

public interface RequestGateway {
	public String post(String request);
	public String post(Person request);
}
