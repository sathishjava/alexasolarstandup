package com.amazon.ask.helloworld.handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.request.Predicates;

import com.amazon.ask.helloworld.data.InputData;

import java.util.Optional;

public class NextIntentHandler implements RequestHandler {
    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(Predicates.intentName("NextIntent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        String speechText;
        if (InputData.index >= InputData.names.size())
            speechText = "We are done with the status update. Any fallbacks?";
        else {
            speechText = "Next " + InputData.names.get(InputData.index);
            InputData.index++;
        }
        return input.getResponseBuilder()
                    .withSpeech(speechText)
                    .withSimpleCard("Next", speechText)
                    .build();
    }

}
