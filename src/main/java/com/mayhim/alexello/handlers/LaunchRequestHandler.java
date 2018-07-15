/**
 * 
 */
package com.mayhim.alexello.handlers;

import java.util.Optional;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.LaunchRequest;
import com.amazon.ask.model.Response;
import com.amazon.ask.request.Predicates;

/**
 * @author hkansal
 *
 */
public class LaunchRequestHandler implements RequestHandler {

	public static final String speechText = "My first skill, barely does something. Welcome!"; 
	
	/* (non-Javadoc)
	 * @see com.amazon.ask.dispatcher.request.handler.RequestHandler#canHandle(com.amazon.ask.dispatcher.request.handler.HandlerInput)
	 */
	public boolean canHandle(HandlerInput input) {
		return input.matches(Predicates.requestType(LaunchRequest.class));
	}

	/* (non-Javadoc)
	 * @see com.amazon.ask.dispatcher.request.handler.RequestHandler#handle(com.amazon.ask.dispatcher.request.handler.HandlerInput)
	 */
	public Optional<Response> handle(HandlerInput input) {
		
		return input.getResponseBuilder()
				.withSpeech(speechText)
				.withSimpleCard("HelloWorld", speechText)
				.withReprompt(speechText)
				.build();
	}

}
