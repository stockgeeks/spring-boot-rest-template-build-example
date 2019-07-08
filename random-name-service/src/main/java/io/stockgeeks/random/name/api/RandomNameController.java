package io.stockgeeks.random.name.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@Slf4j
public class RandomNameController {

    private String[] firstNames = {"Josh", "James", "Mark", "Olivier", "Jurgen", "Jon"};
    private String[] lastNames = {"Long", "Watters", "Fisher", "Gierke", "Hoeller", "Schneider"};

    private Random random = new Random();

    @GetMapping("/api/random-name")
    public RandomName randomName() {
        log.info("Received call on /api/random-name");

        String randomName = firstNames[random.nextInt(firstNames.length)] + " " + lastNames[random.nextInt(lastNames.length)];
        return new RandomName(randomName);
    }
}
