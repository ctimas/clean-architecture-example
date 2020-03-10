package ru.ctimas.clean.architecture.infrastructure.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan("ru.ctimas.clean.architecture.adapter.rest")
public class RestConfiguration {

}
