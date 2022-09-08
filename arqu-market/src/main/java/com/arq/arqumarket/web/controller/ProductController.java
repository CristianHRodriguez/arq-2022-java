package com.arq.arqumarket.web.controller;

import com.arq.arqumarket.domain.Product;
import com.arq.arqumarket.domain.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {
    //restcontroller que le dice a spring que esta clase es un controlador de api
    //anotacion requestmappin lleva como parametro que path va a aceptar las peticiones que hagamos

    @Autowired
    private ProductService productService;

    @GetMapping("/all")
    public List<Product> getAll(){
        return productService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Product> getProduct(@PathVariable("id") int productId){
        return productService.getProduct(productId);
    }

    @GetMapping("/modelo/{modelId}")
    public Optional<List<Product>> getByModel(@PathVariable("modelId") int modelId) {
        return productService.getByModel(modelId);
    }

    @PostMapping("/save")
    public Product save(@RequestBody Product product) {
        return productService.save(product);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int productId){
        return productService.delete(productId);
    }
}
