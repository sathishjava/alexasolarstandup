package com.amazon.ask.helloworld.handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.request.Predicates;

import java.util.Optional;

public class NameIntentHandler implements RequestHandler {
    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(Predicates.intentName("NameIntent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        String speechText = "My name is alexa";
        return input.getResponseBuilder()
                    .withSpeech(speechText)
                    .withSimpleCard("Name", speechText)
                    .build();
    }
}
