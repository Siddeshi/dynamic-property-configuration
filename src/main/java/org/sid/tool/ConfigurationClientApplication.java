package org.sid.tool;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ConfigurationClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigurationClientApplication.class, args);
    }
}

@RefreshScope
@RestController
class MessageRestController {

    @Value("${spring.application.name}")
    private String appName;

    @GetMapping(value = "/appname")
    public String getAppName() {
        return this.appName;
    }
}