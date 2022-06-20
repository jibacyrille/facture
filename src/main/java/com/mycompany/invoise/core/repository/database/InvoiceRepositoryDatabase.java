package com.mycompany.invoise.core.repository.database;
/*
import com.mycompany.invoise.core.entity.Invoice;
import com.mycompany.invoise.core.repository.InvoiceRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Repository
public class InvoiceRepositoryDatabase implements InvoiceRepositoryInterface {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static List<Invoice> invoices= new ArrayList<>();

    public Invoice create(Invoice invoice){

        KeyHolder kh=new GeneratedKeyHolder();

        jdbcTemplate.update(connection ->{
            PreparedStatement ps= connection.prepareStatement("INSERT INTO INVOICE(CUSTOMER_NAME,ORDER_NUMBER) VALUES(?,?)",
                    Statement.RETURN_GENERATED_KEYS);
            ps.setString(1,invoice.getCustomerName());
            ps.setString(2,invoice.getOrderNumber());
            return ps;
        },kh );
        invoice.setNumber(kh.getKey().toString());
        return invoice;




    }

    @Override
    public List<Invoice> list() {

        return jdbcTemplate.query("SELECT INVOICE_NUMBER,CUSTOMER_NAME FROM INVOICE",
                (rs, rowNum) -> new Invoice(String.valueOf(rs.getLong("INVOICE_NUMBER")),
                        rs.getString("CUSTOMER_NAME")));

        //Invoice invoice1=new Invoice();
        //invoice1.setNumber("Num_1");
       // invoice1.setCustomerName("EDF");
       // Invoice invoice2=new Invoice();
       // invoice2.setNumber("Num_2");
       // invoice2.setCustomerName("La Poste");
       // return List.of(invoice1,invoice2);
    }

    @Override
    public Invoice getById(String number) {
        return jdbcTemplate.queryForObject("SELECT INVOICE_NUMBER,CUSTOMER_NAME,ORDER_NUMBER FROM INVOICE WHERE INVOICE_NUMBER=?",
                new Object[]{number},
                (rs, rowNum) -> new Invoice(String.valueOf(rs.getLong("INVOICE_NUMBER")),
                        rs.getString("CUSTOMER_NAME"),rs.getString("ORDER_NUMBER")));



        //Invoice invoice1=new Invoice();
        //invoice1.setNumber(number);
        //invoice1.setCustomerName("EDF");
        //invoice1.setOrderNumber("ON_002");
        //return invoice1;
    }
}
*/