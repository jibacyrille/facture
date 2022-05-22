package com.mycompany.invoise.repository.database;

import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.repository.InvoiceRepositoryInterface;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InvoiceRepositoryDatabase implements InvoiceRepositoryInterface {

    private static List<Invoice> invoices= new ArrayList<>();

    public void create(Invoice invoice){
        invoices.add(invoice);
        System.out.println("DataBase: Invoice added with number "+invoice.getNumber()+" for "+invoice.getCustomerName());

    }

    @Override
    public List<Invoice> list() {
        Invoice invoice1=new Invoice();
        invoice1.setNumber("Num_1");
        invoice1.setCustomerName("EDF");
        Invoice invoice2=new Invoice();
        invoice2.setNumber("Num_2");
        invoice2.setCustomerName("La poste");
        return List.of(invoice1,invoice2);
    }
}
