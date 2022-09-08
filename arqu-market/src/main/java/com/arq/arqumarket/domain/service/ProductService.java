package com.arq.arqumarket.domain.service;

import com.arq.arqumarket.domain.Product;
import com.arq.arqumarket.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    //intermediario entre el controlador y la capa del repositorio
    public List<Product> getAll() {
        return productRepository.getAll();
    }

    public Optional<Product> getProduct(int productId) {
        return productRepository.getProducto(productId);
    }

    public Optional<List<Product>> getByModel(int modelId) {
        return productRepository.getByModel(modelId);
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

    //si lo puedo eliminar es True, de lo contrario False
    //busco un producto, uso map del optional donde donde elimino el producto y que retorne true
    public boolean delete(int productId) {
        return getProduct(productId).map(product -> {
            productRepository.delete(productId);
            return true;
        }).orElse(false);
    }

}
