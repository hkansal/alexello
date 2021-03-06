/**
 * 
 */
package com.mayhim.alexello.handlers;

import static com.amazon.ask.request.Predicates.requestType;

import java.util.Optional;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.LaunchRequest;
import com.amazon.ask.model.Response;

/**
 * @author hkansal
 *
 */
public class LaunchRequestHandler implements RequestHandler {

	public static final String SPEECH_TEXT = "My first skill, barely does something. Welcome!"; 
	
	/* (non-Javadoc)
	 * @see com.amazon.ask.dispatcher.request.handler.RequestHandler#canHandle(com.amazon.ask.dispatcher.request.handler.HandlerInput)
	 */
	public boolean canHandle(HandlerInput input) {
		return input.matches(requestType(LaunchRequest.class));
	}

	/* (non-Javadoc)
	 * @see com.amazon.ask.dispatcher.request.handler.RequestHandler#handle(com.amazon.ask.dispatcher.request.handler.HandlerInput)
	 */
	public Optional<Response> handle(HandlerInput input) {
		
		return input.getResponseBuilder()
				.withSpeech(SPEECH_TEXT)
				.withSimpleCard("HelloWorld", SPEECH_TEXT)
				.withReprompt(SPEECH_TEXT)
				.build();
	}

}
