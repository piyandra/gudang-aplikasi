package com.tokoonline.tokoonlineyann;

import com.tokoonline.tokoonlineyann.entity.Product;
import com.tokoonline.tokoonlineyann.entity.Transaction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class EntityTest {

    @Test
    void testEntity() {

        Product product = new Product();
        product.setProductName("Baju");
        product.setPrice(10000);
        product.setStock(10);
        Product product1 = new Product();
        product1.setProductName("Baju");
        product1.setPrice(10000);
        product1.setStock(10);

        System.out.println(product.getProductId());
        Assertions.assertEquals(product.getProductName(), product1.getProductName());
    }

    @Test
    void transactionTest() {
        Transaction transaction = new Transaction();
        transaction.setQuantity(10);
        transaction.setTotalPrice(100000);
        transaction.setDate(LocalDateTime.now());
        System.out.println(transaction.getDate());
        Assertions.assertEquals(transaction.getTotalPrice(), 100000);
    }
}
