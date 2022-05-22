package com.mycompany.invoise;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.mycompany.invoise.controller.web", "com.mycompany.invoise.service.prefix", "com.mycompany.invoise.repository.database"})
//@PropertySource("classpath:application.properties") je commente pour verifier que ImportResource fonctionne
//@ImportResource("classpath:ApplicationContext.xml")
public class AppConfig {
}