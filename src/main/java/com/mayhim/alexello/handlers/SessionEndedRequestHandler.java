/**
 * 
 */
package com.mayhim.alexello.handlers;

import static com.amazon.ask.request.Predicates.requestType;

import java.util.Optional;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.model.SessionEndedRequest;

/**
 * @author hkansal
 *
 */
public class SessionEndedRequestHandler implements RequestHandler {

	/* (non-Javadoc)
	 * @see com.amazon.ask.dispatcher.request.handler.RequestHandler#canHandle(com.amazon.ask.dispatcher.request.handler.HandlerInput)
	 */
	@Override
	public boolean canHandle(HandlerInput input) {
		return input.matches(requestType(SessionEndedRequest.class));
	}

	/* (non-Javadoc)
	 * @see com.amazon.ask.dispatcher.request.handler.RequestHandler#handle(com.amazon.ask.dispatcher.request.handler.HandlerInput)
	 */
	@Override
	public Optional<Response> handle(HandlerInput input) {
		// TODO Clean up logic
		return input.getResponseBuilder().build();
	}

}
