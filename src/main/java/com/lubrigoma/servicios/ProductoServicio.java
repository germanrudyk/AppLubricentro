/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lubrigoma.servicios;

import com.lubrigoma.entidades.Producto;
import com.lubrigoma.repositorios.ProductoRepositorio;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author German
 */
@Service
public class ProductoServicio {

    @Autowired
    public ProductoRepositorio productoRepositorio;

    public void crearProducto(String codigo, String nombre, Integer stock) {

        Producto producto = new Producto();

        producto.setCodigo(codigo);
        producto.setNombre(nombre);
        producto.setStock(stock);
        producto.setNotificada(Boolean.FALSE);

        productoRepositorio.save(producto);

    }

    public List<Producto> listarTodosLosProductos() {

        return productoRepositorio.findAll();

    }
    
    public List<Producto> buscarProducto(String buscar){
        
        return productoRepositorio.buscarProducto(buscar);
        
    }

    public void venderProducto(String id, Integer cantidad) {

        Producto producto = getOne(id);

        if (producto != null && producto.getStock() - cantidad >= 0) {

            producto.setStock(producto.getStock() - cantidad);

            productoRepositorio.save(producto);

        }

    }

    public void modificarProducto(String id, String codigo, String nombre, Integer stock) {

        Producto producto = getOne(id);

        if (producto != null) {

            producto.setCodigo(codigo);
            producto.setNombre(nombre);
            producto.setStock(stock);

            if(producto.getStock() > 2){
                producto.setFechaNotificada(null);
                producto.setNotificada(Boolean.FALSE);
            }
            
            productoRepositorio.save(producto);

        }

    }

    public Producto getOne(String id) {

        Optional<Producto> respuesta = productoRepositorio.findById(id);

        if (respuesta.isPresent()) {

            return respuesta.get();

        } else {
            return null;
        }

    }

    public List<Producto> listarFaltantes() {

        return productoRepositorio.listarFaltantes();

    }

    public void establecerFecha(List<Producto> productos) {

        for (Producto producto : productos) {
            if (producto.getFechaNotificada() == null) {
                producto.setFechaNotificada(LocalDate.now());
                System.out.println(producto.getFechaNotificada());
                productoRepositorio.save(producto);
            }
        }

    }

    public List<Producto> notificar(List<Producto> productos) {

        List<Producto> productosANotificar = new ArrayList();

        for (Producto producto : productos) {

            int comparacion = LocalDate.now().compareTo(producto.getFechaNotificada());

            if (comparacion > 0 && !(producto.getNotificada())) {
                producto.setNotificada(Boolean.TRUE);
                productoRepositorio.save(producto);
                productosANotificar.add(producto);
                System.out.println(producto.getNombre());
            }
        }

        return productosANotificar;

    }

}
