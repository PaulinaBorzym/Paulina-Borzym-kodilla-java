package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave(){
        //Given
        Product product1 = new Product("Product name");
        Item item1 = new Item(product1, new BigDecimal("10.00"), 2);
        Item item2 = new Item(product1, new BigDecimal("5.00"), 10);
        Item item3 = new Item(product1, new BigDecimal("12.00"),15);
        Invoice invoice1 = new Invoice("1/02");
        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);
        invoice1.setItems(items);
        item1.setInvoice(invoice1);
        item2.setInvoice(invoice1);
        item3.setInvoice(invoice1);
        //When
        invoiceDao.save(invoice1);
        int id = invoice1.getId();
        //Then
        Optional<Invoice> result = invoiceDao.findById(id);
        assertEquals("1/02",result.get().getNumber());
        //CleanUp
        invoiceDao.deleteById(id);

    }
}
