package com.example.demo

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DemoController {
    val logger: Logger = LoggerFactory.getLogger(this::class.java)

    @GetMapping("/hello")
    fun greeting(): String {
        logger.info("logger info message line")
        logger.debug("logger debug message line")
        logger.error("logger error message line")
        return "Hey there from Demo Controller"
    }


}