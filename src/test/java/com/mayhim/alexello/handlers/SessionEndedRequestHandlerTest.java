/**
 * 
 */
package com.mayhim.alexello.handlers;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.model.SessionEndedRequest;

/**
 * @author mouse
 *
 */
class SessionEndedRequestHandlerTest extends AbstractHandlerTest {

	private SessionEndedRequestHandler handler = new SessionEndedRequestHandler();
	
	private HandlerInput input;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void initiateHandlerInput() throws Exception {
		input = buildIntentByIntentType(SessionEndedRequest.builder().build());
	}

	/**
	 * Test method for {@link com.mayhim.alexello.handlers.SessionEndedRequestHandler#canHandle(com.amazon.ask.dispatcher.request.handler.HandlerInput)}.
	 */
	@Test
	void testCanHandle() {
		assertTrue(handler.canHandle(input));
	}

	/**
	 * Test method for {@link com.mayhim.alexello.handlers.SessionEndedRequestHandler#handle(com.amazon.ask.dispatcher.request.handler.HandlerInput)}.
	 */
	@Test
	void testHandle() {
		assertThatHandlerHandles(handler, input);
	}

}
