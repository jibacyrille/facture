package com.mycompany.invoise;

import com.mycompany.invoise.controller.InvoiceControllerInterface;
import com.mycompany.invoise.controller.InvoiceControllerKeyboard;
import com.mycompany.invoise.controller.InvoiceControllerDouchette;
import com.mycompany.invoise.controller.InvoiceControllerWeb;
import com.mycompany.invoise.repository.InvoiceRepositoryInterface;
import com.mycompany.invoise.repository.InvoiceRepositoryMemory;
import com.mycompany.invoise.repository.InvoiceRepositoryDatabase;
import com.mycompany.invoise.service.InvoiceServiceInterface;
import com.mycompany.invoise.service.InvoiceServiceNumber;
import com.mycompany.invoise.service.InvoiceServicePrefix;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        int boucle;
        do {


            Scanner sc = new Scanner(System.in);

            System.out.println("Quel est le type de controller (keyboard, web, douchette)?");
            String controllerType = sc.nextLine();
            System.out.println("Quel est le type de service (number, prefix)?");
            String serviceType = sc.nextLine();
            System.out.println("Quel est le type de repository (memory, database)?");
            String repositoryType = sc.nextLine();

            InvoiceControllerInterface invoiceController=null;
            switch (controllerType){
                case "keyboard":
                    invoiceController=new InvoiceControllerKeyboard();
                    break;
                case "web":
                    invoiceController=new InvoiceControllerWeb();
                    break;
                case "douchette":
                    invoiceController=new InvoiceControllerDouchette();
                    break;
            }

            InvoiceServiceInterface invoiceService=null;
            switch (serviceType){
                case "number":
                    invoiceService=new InvoiceServiceNumber();
                    break;
                case "prefix":
                    invoiceService=new InvoiceServicePrefix();
                    break;
            }

            InvoiceRepositoryInterface invoiceRepository=null;
            switch (repositoryType){
                case "memory":
                    invoiceRepository=new InvoiceRepositoryMemory();
                    break;
                case "database":
                    invoiceRepository=new InvoiceRepositoryDatabase();
                    break;
            }

            invoiceController.setInvoiceService(invoiceService);
            invoiceService.setInvoiceRepository(invoiceRepository);
            invoiceController.createInvoice();

            System.out.println("voulez-vous continuer?");
            boucle=sc.nextInt();
        } while(boucle==0);


    }
}
