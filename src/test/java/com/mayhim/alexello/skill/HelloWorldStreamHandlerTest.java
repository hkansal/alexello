package com.mayhim.alexello.skill;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class HelloWorldStreamHandlerTest {

	@Test
	void testHelloWorldStreamHandlerIsCreated() {
		assertNotNull(new HelloWorldStreamHandler());
	}

}
