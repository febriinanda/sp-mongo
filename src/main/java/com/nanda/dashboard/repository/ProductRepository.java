package com.nanda.dashboard.repository;

import com.nanda.dashboard.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
