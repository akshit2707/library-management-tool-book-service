package com.library.books.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class BookController {
    @GetMapping ("/health")
    public String health() {
        log.info("Working fine");
        return ":::::Status check:::::\n" + "::::::::::*:::::::::::\n" + ":::::::::*:*::::::::::\n"
                + "::::::::*:*:*:::::::::\n" + ":::::::::*:*::::::::::\n" + "::::::::::*:::::::::::\n"
                + "::::::Scan Done:::::::";
    }

    @GetMapping("/name/{name}")
    public String sampleName(@PathVariable String name) {
        return name;
    }


}
