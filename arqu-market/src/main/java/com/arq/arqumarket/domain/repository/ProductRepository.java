package com.arq.arqumarket.domain.repository;

import com.arq.arqumarket.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {

    //definir las reglas que va a tener el dominio al momento que cualquier repositorio quiera utiliza o acceder al producto a la bbdd
    List<Product> getAll();
    //los mismos repositorios pero en terminos del dominio
    Optional<List<Product>> getByModel(int modelId);
    Optional<Product> getProducto(int productId);
    Product save(Product product);
    void delete(int productId);



}
