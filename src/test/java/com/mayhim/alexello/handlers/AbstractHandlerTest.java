/**
 * 
 */
package com.mayhim.alexello.handlers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Intent;
import com.amazon.ask.model.IntentRequest;
import com.amazon.ask.model.Request;
import com.amazon.ask.model.RequestEnvelope;
import com.amazon.ask.model.ui.SimpleCard;

/**
 * @author hkansal
 *
 */
public abstract class AbstractHandlerTest {

	HandlerInput buildInputByIntentName(final String intentName) {
		
		return HandlerInput.builder()
				.withRequestEnvelope(RequestEnvelope.builder()
						.withRequest(IntentRequest.builder()
								.withIntent(Intent.builder()
										.withName(intentName).build())
								.build())
						.build())
				.build();
	}
	
	HandlerInput buildIntentByIntentType(final Request intentType) {
		return HandlerInput.builder()
				.withRequestEnvelope(
						RequestEnvelope.builder().withRequest(
								intentType)
						.build())
				.build();
	}
	
	void assertThatHandlerHandles(final RequestHandler handler, final HandlerInput input, final String speechText) {
		assertThat(
				((SimpleCard) handler.handle(input).get().getCard())
					.getContent(), 
				is(equalTo(speechText)));
	}
	
	void assertThatHandlerHandles(final RequestHandler handler, final HandlerInput input) {
		assertTrue(handler.handle(input).isPresent());
	}
	
}
