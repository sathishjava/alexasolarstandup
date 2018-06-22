package com.amazon.ask.helloworld.handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.helloworld.data.InputData;
import com.amazon.ask.model.Response;
import com.amazon.ask.request.Predicates;

import java.util.Optional;
import java.util.Random;

public class StartStandupIntentHandler implements RequestHandler {
    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(Predicates.intentName("StartStandupIntent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        InputData.index = 0;
        InputData.init();
        shuffleNames();
        String speechText = "Standup started. Let us start with " + InputData.names.get(InputData.index);
        InputData.index++;
        return input.getResponseBuilder()
                    .withSpeech(speechText)
                    .withSimpleCard("StartStandup", speechText)
                    .build();
    }

    public static void shuffleNames() {
        for (int i = InputData.names.size()-1; i>=0; i--) {
            Random random = new Random();
            int randomValue = random.nextInt(i);
            String tempName = InputData.names.get(i);
            InputData.names.set(i, InputData.names.get(randomValue));
            InputData.names.set(randomValue, tempName);
        }
    }
}
