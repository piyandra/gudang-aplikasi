package com.tokoonline.tokoonlineyann.repository;

import com.tokoonline.tokoonlineyann.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
