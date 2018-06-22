package com.amazon.ask.helloworld;

import com.amazon.ask.Skill;
import com.amazon.ask.Skills;
import com.amazon.ask.SkillStreamHandler;

import com.amazon.ask.helloworld.handlers.CancelandStopIntentHandler;
import com.amazon.ask.helloworld.handlers.GoodByeIntentHandler;
import com.amazon.ask.helloworld.handlers.GoodMorningIntentHandler;
import com.amazon.ask.helloworld.handlers.HelloWorldIntentHandler;
import com.amazon.ask.helloworld.handlers.HelpIntentHandler;
import com.amazon.ask.helloworld.handlers.SessionEndedRequestHandler;
import com.amazon.ask.helloworld.handlers.LaunchRequestHandler;
import com.amazon.ask.helloworld.handlers.NameIntentHandler;
import com.amazon.ask.helloworld.handlers.NextIntentHandler;
import com.amazon.ask.helloworld.handlers.StartStandupIntentHandler;

public class HelloWorldStreamHandler extends SkillStreamHandler {

    private static Skill getSkill() {
        return Skills.standard()
                     .addRequestHandlers(new CancelandStopIntentHandler(),
                                         new GoodByeIntentHandler(),
                                         new GoodMorningIntentHandler(),
                                         new HelloWorldIntentHandler(),
                                         new HelpIntentHandler(),
                                         new LaunchRequestHandler(),
                                         new NameIntentHandler(),
                                         new NextIntentHandler(),
                                         new SessionEndedRequestHandler(),
                                         new StartStandupIntentHandler())
                     .build();
    }

    public HelloWorldStreamHandler() {
        super(getSkill());
    }

}
