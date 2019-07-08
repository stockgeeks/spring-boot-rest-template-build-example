package io.stockgeeks.hello.world.api;

import lombok.Data;

@Data
public class Greeting {

    private String message;

    public Greeting(String message) {
        this.message = message;
    }
}
