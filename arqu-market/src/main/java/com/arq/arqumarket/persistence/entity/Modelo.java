package com.arq.arqumarket.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "modelo")
public class Modelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_modelo")
    private Integer idModelo;

    private String nombre;

    //relacion entidad
    @OneToMany(mappedBy = "modelo")
    private List<Producto> productosMo;

    public Integer getIdModelo() {
        return idModelo;
    }

    public void setIdModelo(Integer idModelo) {
        this.idModelo = idModelo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Producto> getProductosMo() {
        return productosMo;
    }

    public void setProductosMo(List<Producto> productosMo) {
        this.productosMo = productosMo;
    }
}
