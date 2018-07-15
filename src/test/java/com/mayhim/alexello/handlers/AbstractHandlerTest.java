/**
 * 
 */
package com.mayhim.alexello.handlers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Intent;
import com.amazon.ask.model.IntentRequest;
import com.amazon.ask.model.RequestEnvelope;
import com.amazon.ask.model.ui.SimpleCard;

/**
 * @author mouse
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
	
	void assertThatHandlerHandles(final RequestHandler handler, final HandlerInput input, final String speechText) {
		assertThat(
				((SimpleCard) handler.handle(input).get().getCard())
					.getContent(), 
				is(equalTo(speechText)));
	}
	
}
