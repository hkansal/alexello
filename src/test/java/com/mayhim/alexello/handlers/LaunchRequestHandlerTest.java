/**
 * 
 */
package com.mayhim.alexello.handlers;

import static com.mayhim.alexello.handlers.LaunchRequestHandler.SPEECH_TEXT;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.model.LaunchRequest;
import com.amazon.ask.model.RequestEnvelope;

/**
 * @author hkansal
 *
 */
class LaunchRequestHandlerTest extends AbstractHandlerTest {

	private LaunchRequestHandler handler = new LaunchRequestHandler();
	
	private HandlerInput input;
	
	@BeforeEach
	private void initiateHandlerInput() {
		input = HandlerInput.builder()
				.withRequestEnvelope(
						RequestEnvelope.builder().withRequest(
								LaunchRequest.builder().build())
						.build())
				.build();
	}
	
	/**
	 * Test method for {@link com.mayhim.alexello.handlers.LaunchRequestHandler#canHandle(com.amazon.ask.dispatcher.request.handler.HandlerInput)}.
	 */
	@Test
	void testCanHandle() {
		assertTrue(handler.canHandle(input));
	}

	/**
	 * Test method for {@link com.mayhim.alexello.handlers.LaunchRequestHandler#handle(com.amazon.ask.dispatcher.request.handler.HandlerInput)}.
	 */
	@Test
	void testHandle() {
		assertThatHandlerHandles(handler, input, SPEECH_TEXT);
	}

}
