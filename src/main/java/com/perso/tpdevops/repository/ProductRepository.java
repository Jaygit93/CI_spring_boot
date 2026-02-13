package com.perso.tpdevops.repository;


import com.perso.tpdevops.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    @NativeQuery(value = "SELECT * FROM products")
    List<Product> findAllProducts();

    @NativeQuery(value = "SELECT * FROM products WHERE id = ?1")
    Optional<Product> findProductById(Long id);
}
