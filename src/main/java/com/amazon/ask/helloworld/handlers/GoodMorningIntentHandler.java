package com.amazon.ask.helloworld.handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.request.Predicates;

import java.util.Optional;

public class GoodMorningIntentHandler implements RequestHandler {
    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(Predicates.intentName("GoodMorningIntent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        String speechText = "Good morning team Solar";
        return input.getResponseBuilder()
                    .withSpeech(speechText)
                    .withSimpleCard("GoodMorning", speechText)
                    .build();
    }
}
