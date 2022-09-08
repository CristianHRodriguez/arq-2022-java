package com.arq.arqumarket.persistence.mapper;

import com.arq.arqumarket.domain.Product;
import com.arq.arqumarket.persistence.entity.Producto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-08T16:47:03-0500",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.16 (Ubuntu)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Autowired
    private MaterialMapper materialMapper;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public Product toProduct(Producto producto) {
        if ( producto == null ) {
            return null;
        }

        Product product = new Product();

        if ( producto.getRef() != null ) {
            product.setProductId( producto.getRef() );
        }
        if ( producto.getTalla() != null ) {
            product.setSize( producto.getTalla() );
        }
        product.setMaterialD( materialMapper.toMaterialDom( producto.getMaterial() ) );
        if ( producto.getIdModelo() != null ) {
            product.setModelId( producto.getIdModelo() );
        }
        if ( producto.getPrecio() != null ) {
            product.setPrice( producto.getPrecio() );
        }
        product.setName( producto.getNombre() );
        if ( producto.getEstado() != null ) {
            product.setActive( producto.getEstado() );
        }
        product.setModel( modelMapper.toModel( producto.getModelo() ) );
        if ( producto.getIdMaterial() != null ) {
            product.setMaterialId( producto.getIdMaterial() );
        }
        if ( producto.getStock() != null ) {
            product.setStock( producto.getStock() );
        }
        product.setPicture( producto.getImagen() );

        return product;
    }

    @Override
    public List<Product> toProducts(List<Producto> productos) {
        if ( productos == null ) {
            return null;
        }

        List<Product> list = new ArrayList<Product>( productos.size() );
        for ( Producto producto : productos ) {
            list.add( toProduct( producto ) );
        }

        return list;
    }

    @Override
    public Producto toProducto(Product product) {
        if ( product == null ) {
            return null;
        }

        Producto producto = new Producto();

        producto.setRef( product.getProductId() );
        producto.setPrecio( product.getPrice() );
        producto.setEstado( product.isActive() );
        producto.setTalla( product.getSize() );
        producto.setMaterial( materialMapper.toMaterialPer( product.getMaterialD() ) );
        producto.setImagen( product.getPicture() );
        producto.setIdMaterial( product.getMaterialId() );
        producto.setIdModelo( product.getModelId() );
        producto.setStock( product.getStock() );
        producto.setNombre( product.getName() );
        producto.setModelo( modelMapper.toModelo( product.getModel() ) );

        return producto;
    }

    @Override
    public List<Producto> toProductos(List<Product> products) {
        if ( products == null ) {
            return null;
        }

        List<Producto> list = new ArrayList<Producto>( products.size() );
        for ( Product product : products ) {
            list.add( toProducto( product ) );
        }

        return list;
    }
}
