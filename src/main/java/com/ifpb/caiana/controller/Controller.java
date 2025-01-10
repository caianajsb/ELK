package com.ifpb.caiana.controller;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    private static final Logger LOG = LogManager.getLogger(Controller.class);

    @GetMapping("/generate-log")
    public String generateLog() {
        LOG.info("This is an info log message.");
        LOG.error("This is an error log message.");
        return "Log messages generated.";
    }
}
