package com.mayhim.alexello.handlers;

import static com.mayhim.alexello.handlers.CancelAndStopIntentHandler.SPEECH_TEXT;
import static com.mayhim.alexello.handlers.setup.IntentNames.CANCEL_INTENT_NAME;
import static com.mayhim.alexello.handlers.setup.IntentNames.STOP_INTENT_NAME;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;

class CancelAndStopIntentHandlerTest extends AbstractHandlerTest {

	private CancelAndStopIntentHandler handler = new CancelAndStopIntentHandler();
	
	@Test
	void testCanHandleStopIntent() {
		HandlerInput input = buildInputByIntentName(STOP_INTENT_NAME);
		assertTrue(handler.canHandle(input));
	}
	
	@Test
	void testCanHandleCancelIntent() {
		HandlerInput input = buildInputByIntentName(CANCEL_INTENT_NAME);
		assertTrue(handler.canHandle(input));
	}

	@Test
	void testHandle() {
		assertThatHandlerHandles(handler, buildInputByIntentName(STOP_INTENT_NAME), SPEECH_TEXT);
	}

}
