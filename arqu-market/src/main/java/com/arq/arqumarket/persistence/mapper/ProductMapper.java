package com.arq.arqumarket.persistence.mapper;

import com.arq.arqumarket.domain.Product;
import com.arq.arqumarket.persistence.entity.Producto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {MaterialMapper.class, ModelMapper.class})
public interface ProductMapper {

    @Mappings({
            @Mapping(source = "ref", target = "productId"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "idModelo", target = "modelId"),
            @Mapping(source = "idMaterial", target = "materialId"),
            @Mapping(source = "imagen", target = "picture"),
            @Mapping(source = "talla", target = "size"),
            @Mapping(source = "precio", target = "price"),
            @Mapping(source = "stock", target = "stock"),
            @Mapping(source = "estado", target = "active"),
            @Mapping(source = "modelo", target = "model"),
            @Mapping(source = "material", target = "materialD"),
    })
    Product toProduct(Producto producto);
    List<Product> toProducts(List<Producto> productos);

    @InheritInverseConfiguration
    Producto toProducto(Product product);
    List<Producto> toProductos(List<Product> products);

}
