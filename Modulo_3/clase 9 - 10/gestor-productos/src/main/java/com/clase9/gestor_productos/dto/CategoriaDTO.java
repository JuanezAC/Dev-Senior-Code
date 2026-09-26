package com.clase9.gestor_productos.dto;

import com.clase9.gestor_productos.model.Categoria;
import com.clase9.gestor_productos.model.Producto;

import java.util.ArrayList;
import java.util.List;

public class CategoriaDTO {
    private Long id;
    private String nombre;
    private List<String> productos;

    public CategoriaDTO (Categoria categoria) {
        List<String> nombres = new ArrayList<>();

        for (Producto producto : categoria.getProductos()) {
            nombres.add(producto.getNombre());
        }
        this.id = categoria.getId();
        this.nombre = categoria.getNombre();
        this.productos = categoria.getProductos() != null
                ? nombres : null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getProductos() {
        return productos;
    }

    public void setProductos(List<String> productos) {
        this.productos = productos;
    }
}
