/**
 * 
 */
package com.mayhim.alexello.skill;

import com.amazon.ask.Skill;
import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;
import com.mayhim.alexello.handlers.CancelAndStopIntentHandler;
import com.mayhim.alexello.handlers.HelloWorldIntentHandler;
import com.mayhim.alexello.handlers.HelpIntentHandler;
import com.mayhim.alexello.handlers.LaunchRequestHandler;
import com.mayhim.alexello.handlers.SessionEndedRequestHandler;

/**
 * @author hkansal
 *
 */
public class HelloWorldStreamHandler extends SkillStreamHandler {

	private static Skill getSkill() {
        return Skills.standard()
				.addRequestHandlers(new CancelAndStopIntentHandler(), 
						new HelloWorldIntentHandler(),
						new HelpIntentHandler(), 
						new LaunchRequestHandler(), 
						new SessionEndedRequestHandler())
                .build();
    }
	
	public HelloWorldStreamHandler() {
		super(getSkill());
	}

}
