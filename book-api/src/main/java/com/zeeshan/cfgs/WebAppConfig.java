package com.zeeshan.cfgs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@ComponentScan(basePackages = "com.zeeshan.controller")
@EnableWebMvc
public class WebAppConfig extends WebMvcConfigurerAdapter {

}
