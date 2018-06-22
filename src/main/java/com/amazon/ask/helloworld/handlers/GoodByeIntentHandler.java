package com.amazon.ask.helloworld.handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.helloworld.data.InputData;
import com.amazon.ask.model.Response;
import com.amazon.ask.request.Predicates;
import com.amazonaws.Request;

import java.util.Optional;

public class GoodByeIntentHandler implements RequestHandler {
    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(Predicates.intentName("GoodByeIntent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        String speechText = "Good Bye. Have a great day";
        return input.getResponseBuilder()
                    .withSpeech(speechText)
                    .withSimpleCard("GoodBye", speechText)
                    .build();
    }

}
