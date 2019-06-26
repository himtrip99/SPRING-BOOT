package com.springframework.services;

import com.springframework.commands.ProductForm;
import com.springframework.domain.Product;

import java.util.List;
import java.util.UUID;

public interface ProductService {

    List<Product> listAll();

    Product getById(UUID id);

    Product saveOrUpdate(Product product);

    void delete(UUID id);

    Product saveOrUpdateProductForm(ProductForm productForm);
}
