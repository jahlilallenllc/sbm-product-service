package org.jallenllc.productservice.service;

import org.jallenllc.productservice.dto.ProductRequest;
import org.jallenllc.productservice.model.Product;
import org.jallenllc.productservice.repository.ProductRepository;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {
    private final ProductRepository productRepository;

    @SuppressWarnings("null")
    public void createProduct(ProductRequest productRequest){
        Product product = Product.builder()
            .name(productRequest.getName())
            .description(productRequest.getDescription())
            .price(productRequest.getPrice())
            .build();

        productRepository.save(product);
        log.info("Product {} is saved", product.getId());
    }

}
