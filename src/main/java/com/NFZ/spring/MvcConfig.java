
package com.NFZ.spring;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("/NFZstrona");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/wizyty").setViewName("Wizyty");
        registry.addViewController("/Zalogowany").setViewName("Zalogowany");
        registry.addViewController("/DodanieLekarzy").setViewName("DodanieLekarzy");

    }

}