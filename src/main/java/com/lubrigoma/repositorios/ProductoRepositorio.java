/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.lubrigoma.repositorios;

import com.lubrigoma.entidades.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author German
 */
@Repository
public interface ProductoRepositorio extends JpaRepository<Producto, String>{
    
    @Query("SELECT p FROM Producto p WHERE p.stock <= 2")
    public List<Producto> listarFaltantes();    
    
    @Query("SELECT p FROM Producto p WHERE p.codigo LIKE %:buscar% or p.nombre LIKE %:buscar%")
    public List<Producto> buscarProducto(@Param("buscar") String buscar);
    
}
