package com.mycompany.invoise;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan(basePackages = {"com.mycompany.invoise.controller.web", "com.mycompany.invoise.service.prefix", "com.mycompany.invoise.repository.database"})
@PropertySource("classpath:application.properties")
//@ImportResource("classpath:ApplicationContext.xml") j'ai commenté la ligne precedende pour verifier que ImportResource fonctionne
public class AppConfigPropertySource {
}