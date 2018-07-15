/**
 * 
 */
package com.mayhim.alexello.handlers;

import static com.mayhim.alexello.handlers.HelpIntentHandler.SPEECH_TEXT;
import static com.mayhim.alexello.handlers.setup.IntentNames.HELP_INTENT_NAME;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;

/**
 * @author mouse
 *
 */
class HelpIntentHandlerTest extends AbstractHandlerTest {

	private HelpIntentHandler handler = new HelpIntentHandler();
	
	private HandlerInput input;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	private void initiateHandlerInput() throws Exception {
		input = buildInputByIntentName(HELP_INTENT_NAME);
	}

	/**
	 * Test method for {@link com.mayhim.alexello.handlers.HelpIntentHandler#canHandle(com.amazon.ask.dispatcher.request.handler.HandlerInput)}.
	 */
	@Test
	void testCanHandle() {
		assertTrue(handler.canHandle(input));
	}

	/**
	 * Test method for {@link com.mayhim.alexello.handlers.HelpIntentHandler#handle(com.amazon.ask.dispatcher.request.handler.HandlerInput)}.
	 */
	@Test
	void testHandle() {
		assertThatHandlerHandles(handler, input, SPEECH_TEXT);
	}

}
