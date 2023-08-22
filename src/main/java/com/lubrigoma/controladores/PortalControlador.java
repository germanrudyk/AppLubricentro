/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lubrigoma.controladores;

import com.lubrigoma.entidades.Producto;
import com.lubrigoma.servicios.ProductoServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author German
 */

@Controller
@RequestMapping("/")
public class PortalControlador {
    
    @Autowired
    public ProductoServicio productoServicio;
    
    @GetMapping("/")
    public String index(ModelMap modelo){
        
        List<Producto> productosFaltantes = productoServicio.listarFaltantes();
        
        productoServicio.establecerFecha(productosFaltantes);
        
        List<Producto> productosANotificar = productoServicio.notificar(productosFaltantes);
        
        modelo.put("productosANotificar", productosANotificar);               
        
        return "index";
        
    }
    
    @GetMapping("/busqueda")
    public String buscar(@RequestParam String buscar, ModelMap modelo){
        
        List<Producto> productos = productoServicio.buscarProducto(buscar);                     
        
        modelo.addAttribute("productos", productos);
        
        return "buscar";
        
    }
    
    @PostMapping("/agregar")
    public String agregar(@RequestParam String codigo, @RequestParam String nombre, @RequestParam Integer stock){
        
        productoServicio.crearProducto(codigo, nombre, stock);
        
        return "redirect:/";
        
    }
    
    @PostMapping("/modificar/{id}")
    public String modificar(@PathVariable String id, @RequestParam String codigo, @RequestParam String nombre,
            @RequestParam Integer stock){
        
        productoServicio.modificarProducto(id, codigo, nombre, stock);
        
        return "redirect:/";
        
    }
    
    @PostMapping("/vender/{id}")
    public String vender(@PathVariable String id, @RequestParam Integer cantidad){
        
        productoServicio.venderProducto(id, cantidad);
        
        return "redirect:/";
        
    }
    
    @GetMapping("/faltantes")
    public String faltantes(ModelMap modelo){
        
        List<Producto> productos = productoServicio.listarFaltantes();
        
        modelo.put("productos", productos);
        
        return "faltantes";
        
    }
    
}
