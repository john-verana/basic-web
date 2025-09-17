package com.example.basicweb;

import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public Map<String, String> hello(@RequestParam(defaultValue = "World") String name) {
        return Map.of(
                "message", "Hello, " + name + "!",
                "time", LocalDateTime.now().toString()
        );
    }
}