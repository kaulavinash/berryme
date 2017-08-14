package com.dev.lambda.demo;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.dev.lambda.demo.model.Input;

public class LambdaFunctionHandler implements RequestHandler<Input , String> {

    @Override
    public String handleRequest(Input input, Context context) {
        context.getLogger().log("Input: " + input);

        // TODO: implement your handler
        return  "Hello Avinash : Staus "+input.isStatus()+ " name : "+input.getName();
    }

}
