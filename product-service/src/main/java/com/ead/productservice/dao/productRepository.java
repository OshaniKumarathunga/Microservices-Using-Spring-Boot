package com.ead.productservice.dao;

import com.ead.productservice.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface productRepository extends MongoRepository<Product, String> {
}
