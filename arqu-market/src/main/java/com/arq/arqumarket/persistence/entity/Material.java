package com.arq.arqumarket.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "material")
public class Material {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_material")
    private Integer idMaterial;

    private String nombre;

    //relacion entidad
    @OneToMany(mappedBy = "material")
    private List<Producto> productosMa;

    public Integer getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(Integer idMaterial) {
        this.idMaterial = idMaterial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Producto> getProductosMa() {
        return productosMa;
    }

    public void setProductosMa(List<Producto> productosMa) {
        this.productosMa = productosMa;
    }
}
