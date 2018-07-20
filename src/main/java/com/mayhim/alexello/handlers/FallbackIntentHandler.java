/**
 * 
 */
package com.mayhim.alexello.handlers;

import static com.amazon.ask.request.Predicates.intentName;
import static com.mayhim.alexello.handlers.setup.IntentNames.FALLBACK_INTENT_NAME;

import java.util.Optional;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

/**
 * @author mouse
 *
 */
public class FallbackIntentHandler implements RequestHandler {

	public static final String SPEECH_TEXT = "Sorry! I haven't been told that.";
	
	/* (non-Javadoc)
	 * @see com.amazon.ask.dispatcher.request.handler.RequestHandler#canHandle(com.amazon.ask.dispatcher.request.handler.HandlerInput)
	 */
	@Override
	public boolean canHandle(HandlerInput input) {
		return input.matches(intentName(FALLBACK_INTENT_NAME));
	}

	/* (non-Javadoc)
	 * @see com.amazon.ask.dispatcher.request.handler.RequestHandler#handle(com.amazon.ask.dispatcher.request.handler.HandlerInput)
	 */
	@Override
	public Optional<Response> handle(HandlerInput input) {
		return input.getResponseBuilder()
				.withSpeech(SPEECH_TEXT)
				.withSimpleCard("HelloWorld", SPEECH_TEXT)
				.withReprompt(SPEECH_TEXT)
				.build();
	}

}
