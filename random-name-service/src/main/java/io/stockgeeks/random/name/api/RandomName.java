package io.stockgeeks.random.name.api;

import lombok.Data;

@Data
public class RandomName {

    private String name;

    public RandomName(String name) {
        this.name = name;
    }
}
