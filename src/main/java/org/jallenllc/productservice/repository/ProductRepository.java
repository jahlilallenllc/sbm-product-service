package org.jallenllc.productservice.repository;

import org.jallenllc.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "product-service", path ="products")
public interface ProductRepository extends MongoRepository<Product, String>{

}
