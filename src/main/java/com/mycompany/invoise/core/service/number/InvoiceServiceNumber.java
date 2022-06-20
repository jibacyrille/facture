package com.mycompany.invoise.core.service.number;

import com.mycompany.invoise.core.entity.Invoice;
import com.mycompany.invoise.core.repository.CustomerRepositoryInterface;
import com.mycompany.invoise.core.repository.InvoiceRepositoryInterface;
import com.mycompany.invoise.core.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class InvoiceServiceNumber implements InvoiceServiceInterface {

    //private static long lastNumber=0L;

    @Autowired
    private InvoiceRepositoryInterface invoiceRepository;

    @Autowired
    private CustomerRepositoryInterface customerRepository;

    public InvoiceRepositoryInterface getInvoiceRepository() {
        return invoiceRepository;
    }

    public void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    @Transactional
    public Invoice createInvoice(Invoice invoice){
        //invoice.setNumber(String.valueOf(++lastNumber));
        //invoiceRepository.create(invoice);
       // return (invoiceRepository.create(invoice));
        customerRepository.save(invoice.getCustomer());
        return (invoiceRepository.save(invoice));

    }

    @Override
    public Invoice getInvoiceByNumber(String number) {
       // return invoiceRepository.getById(number);
        return invoiceRepository.findById(number).orElseThrow();
    }

    @Override
    public Iterable<Invoice> getInvoiceList() {

        //Iterable<Invoice> invoices= invoiceRepository.findAll();
        //Ceci permet d'initialiser le client de chaque facture
       // invoices.forEach(invoice -> invoice.getCustomer().getName());
       // return invoices;
        return invoiceRepository.findAll();
    }
}
