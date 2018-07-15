/**
 * 
 */
package com.mayhim.alexello.handlers;

import static org.junit.jupiter.api.Assertions.*;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static com.mayhim.alexello.handlers.LaunchRequestHandler.speechText;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.model.LaunchRequest;
import com.amazon.ask.model.RequestEnvelope;
import com.amazon.ask.model.ui.SimpleCard;

/**
 * @author hkansal
 *
 */
class LaunchRequestHandlerTest {

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
		assertThat(
				((SimpleCard) handler.handle(input).get().getCard())
					.getContent(), 
				is(equalTo(speechText)));
	}

}
