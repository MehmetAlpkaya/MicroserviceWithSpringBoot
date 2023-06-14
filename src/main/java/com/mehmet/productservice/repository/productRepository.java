package com.mehmet.productservice.repository;

import com.mehmet.productservice.repository.entity.product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface productRepository extends JpaRepository<product,Long> {
    product getByProductIdAndDeletedFalse(Long productId);
    List<product> getAllByDeletedFalse();
}
