/**
 * 
 */
package com.mayhim.alexello.handlers;

import static com.mayhim.alexello.handlers.HelloWorldIntentHandler.SPEECH_TEXT;
import static com.mayhim.alexello.handlers.setup.IntentNames.HELLO_WORLD_INTENT_NAME;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;

/**
 * @author mouse
 *
 */
class HelloWorldIntentHandlerTest extends AbstractHandlerTest {

	private HelloWorldIntentHandler handler = new HelloWorldIntentHandler();
	
	private HandlerInput input;
	
	@BeforeEach
	private void initiateHandlerInput() {
		input = buildInputByIntentName(HELLO_WORLD_INTENT_NAME);
	}

	/**
	 * Test method for {@link com.mayhim.alexello.handlers.HelloWorldIntentHandler#canHandle(com.amazon.ask.dispatcher.request.handler.HandlerInput)}.
	 */
	@Test
	void testCanHandle() {
		assertTrue(handler.canHandle(input));
	}

	/**
	 * Test method for {@link com.mayhim.alexello.handlers.HelloWorldIntentHandler#handle(com.amazon.ask.dispatcher.request.handler.HandlerInput)}.
	 */
	@Test
	void testHandle() {
		assertThatHandlerHandles(handler, input, SPEECH_TEXT);
	}

}
