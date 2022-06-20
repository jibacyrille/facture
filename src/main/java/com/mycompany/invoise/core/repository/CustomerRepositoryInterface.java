package com.mycompany.invoise.core.repository;

import com.mycompany.invoise.core.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepositoryInterface extends CrudRepository<Customer, Long> {
    //@EntityGraph(value="invoice.customer", type=EntityGraph.EntityGraphType.FETCH)
    //Iterable <Invoice> findAll();
    //Optional<Invoice> findById(String number);
    /*Invoice create(Invoice invoice);
    List<Invoice> list();
    Invoice getById(String number);*/
}
