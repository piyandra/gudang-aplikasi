package com.tokoonline.tokoonlineyann;

import com.tokoonline.tokoonlineyann.DTO.WebResponse;
import com.tokoonline.tokoonlineyann.entity.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DTOTest {

    @Test
    void DTOWebResponse() {

        Product product = new Product();
        product.setProductName("Baju");
        product.setPrice(10000);
        product.setStock(10);

        WebResponse<Product> response = new WebResponse<>();
        response.setData(product);
        response.setErrorMessage("");
        System.out.println(response.toString());
        Assertions.assertNotNull(response);
    }
}
