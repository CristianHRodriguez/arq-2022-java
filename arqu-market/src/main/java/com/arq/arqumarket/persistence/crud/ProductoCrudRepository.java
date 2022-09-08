package com.arq.arqumarket.persistence.crud;

import com.arq.arqumarket.persistence.entity.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
    //trae toda las funciones de crud
    //orden: tabla, tipo de dato de su llave principal

    //lista de productos que pertenecen a un modelo
    //para el metodo de QUERY hay que respetar el camellCaste
    List<Producto> findByIdModelo(int idModelo);

    //si quiero usar QUERY se puede - pilas que importe la libreria
    //@Query(value = "SELECT * FROM productos WHERE id_modelo = ?", nativeQuery = true)
    //List<Producto> cualquiera(int idModelo);
    //aplicandolo asi no importa el nombre del metodo

    //filtrar por un modelo especifico y ordenarlo por nombre ascendente
    List<Producto> findByIdModeloOrderByNombreAsc(int idModelo);



}
