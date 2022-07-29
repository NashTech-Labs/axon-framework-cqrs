package com.anshuman.axonframework.command.api.repo;

import com.anshuman.axonframework.command.api.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,String> {
}
