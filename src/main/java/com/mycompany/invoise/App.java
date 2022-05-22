package com.mycompany.invoise;

import com.mycompany.invoise.controller.InvoiceControllerInterface;
import com.mycompany.invoise.service.InvoiceServiceInterface;
import com.mycompany.invoise.service.prefix.InvoiceServicePrefix;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
@SpringBootApplication //remplace les trois annotations ci-dessous
//@Configuration
//@ComponentScan(basePackages = {"com.mycompany.invoise.controller.web", /*"com.mycompany.invoise.service.prefix",*/ "com.mycompany.invoise.repository.database"})
//@ComponentScan(basePackages = "com.mycompany.invoise")
//@EnableAutoConfiguration

//@PropertySource("classpath:application.properties")
public class App 
{
    public static void main( String[] args ) {

        int boucle;
        do {
            Scanner sc = new Scanner(System.in);
            //ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
            //ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class, AppConfigPropertySource.class);
            //ApplicationContext context=new AnnotationConfigApplicationContext(App.class);
            ApplicationContext context= SpringApplication.run(App.class, args);
            InvoiceControllerInterface invoiceController=context.getBean(InvoiceControllerInterface.class);
            invoiceController.createInvoice();

            System.out.println("voulez-vous continuer?");
            boucle=sc.nextInt();
        } while(boucle==0);


    }

    /*
    @Bean
    public InvoiceServiceInterface configuInvoieService(){
        return new InvoiceServicePrefix();
    }
    */
}
