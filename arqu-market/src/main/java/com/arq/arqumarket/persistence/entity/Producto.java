package com.arq.arqumarket.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ref;

    private String nombre;

    @Column(name = "id_modelo")
    private Integer idModelo;

    @Column(name ="id_material")
    private Integer idMaterial;

    private String imagen;

    private Integer talla;

    private Double precio;

    private Integer stock;

    private Boolean estado;

    //entidad relacion entre tablas
    //insertable y updatable implica que no se pueden agregar o eliminar materiales desde aca, toca desde su Clase
    @ManyToOne
    @JoinColumn(name = "id_material", insertable = false, updatable = false)
    private Material material;

    @ManyToOne
    @JoinColumn(name = "id_modelo", insertable = false, updatable = false)
    private Modelo modelo;

    public Integer getRef() {
        return ref;
    }

    public void setRef(Integer ref) {
        this.ref = ref;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdModelo() {
        return idModelo;
    }

    public void setIdModelo(Integer idModelo) {
        this.idModelo = idModelo;
    }

    public Integer getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(Integer idMaterial) {
        this.idMaterial = idMaterial;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Integer getTalla() {
        return talla;
    }

    public void setTalla(Integer talla) {
        this.talla = talla;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }
}
