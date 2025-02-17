package com.robermejia.utp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer{

    @Override
    public void addViewControllers(@SuppressWarnings("null") ViewControllerRegistry registry) {
       registry.addViewController("/").setViewName("inicio");
       registry.addViewController("acerca").setViewName("acerca");
       registry.addViewController("productos").setViewName("productos");
       registry.addViewController("administracion").setViewName("administracion");
       registry.addViewController("formulario-productos").setViewName("formulario-productos");
       registry.addViewController("servicios").setViewName("servicios");
       registry.addViewController("contacto").setViewName("contacto");
       registry.addRedirectViewController("inicio", "/");
    }
    
}
