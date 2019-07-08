package io.stockgeeks.hello.world.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class HelloWorldController {

    private RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/api/hello")
    public Greeting sayHello() {
        log.info("Received call on /api/hello. And will call /api/random-name on the random-name-service!");

        RandomName randomName = restTemplate.getForObject("http://localhost:8081/api/random-name", RandomName.class);

        log.info("Received response from  random-name-service: {}", randomName);
        return new Greeting("Hello World: " + randomName.getName());
    }
}
