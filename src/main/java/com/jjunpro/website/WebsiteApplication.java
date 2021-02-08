package com.jjunpro.website;

import com.jjunpro.website.common.CustomBanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebsiteApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(WebsiteApplication.class);
        application.setBanner(new CustomBanner());
        application.run(args);
    }
}