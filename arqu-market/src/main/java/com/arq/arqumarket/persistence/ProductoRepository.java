package com.arq.arqumarket.persistence;

import com.arq.arqumarket.domain.Product;
import com.arq.arqumarket.domain.repository.ProductRepository;
import com.arq.arqumarket.persistence.crud.ProductoCrudRepository;
import com.arq.arqumarket.persistence.entity.Producto;
import com.arq.arqumarket.persistence.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductoRepository implements ProductRepository {

    //creo una variable del CrudRepository
    //el objeto con la anotacion Autowired le esta cediendo el control a spring para que controle y cree las instancias, y no queden null
    //cumpliendo la inyeccion de dependencias
    @Autowired
    private ProductoCrudRepository productoCrudRepository;
    //llamamos el domain product para usarlo
    @Autowired
    private ProductMapper mapper;

    //traer todos los productos de la base de datos
    @Override
    public List<Product> getAll() {
        List<Producto> productos = (List<Producto>) productoCrudRepository.findAll();
        return mapper.toProducts(productos);
    }

    //trae el metodo para filtrar por modelo
    //los metodos vienen de la interfas ProductoCrudRepository
    //filtrar por un modelo especifico y ordenarlo por nombre ascendente
    @Override
    public Optional<List<Product>> getByModel(int modelId) {
        List<Producto> productos = productoCrudRepository.findByIdModeloOrderByNombreAsc(modelId);
        return Optional.of(mapper.toProducts(productos));
    }

    //permite leer indices QUERY en java
    //consultar un producto en particular
    //y al final se mapea para que se asocie con el dominio -- se llama funcion lamda
    @Override
    public Optional<Product> getProducto(int idProduto){
        return productoCrudRepository.findById(idProduto).map(producto -> mapper.toProduct(producto));
    }

    //insertar un producto
    @Override
    public Product save(Product product) {
        Producto producto = mapper.toProducto((product));
        return mapper.toProduct(productoCrudRepository.save(producto));
    }

    //eliminar producto
    @Override
    public void delete(int productId){
        productoCrudRepository.deleteById(productId);
    }
}
