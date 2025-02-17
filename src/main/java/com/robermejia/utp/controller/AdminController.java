package com.robermejia.utp.controller;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.robermejia.utp.entities.Producto;
import com.robermejia.utp.repositories.ProductoRepository;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class AdminController {

    private final ProductoRepository productoRepository;

    @GetMapping("/administracion")
    public String admin(Model model) {
        model.addAttribute("productos", productoRepository.findAll());
        return "administracion";
    }

    @GetMapping("/administracion/nuevo-producto")
    public String nuevoProducto(Model model) {
        Producto producto = new Producto();
        model.addAttribute("producto", producto);
        return "formulario-productos";
    }

    @GetMapping("/administracion/editar-producto/{id}")
    public String editarProducto(@PathVariable() String id, Model model) {
        Optional<Producto> producto = productoRepository.findById(Integer.parseInt(id));
        if(producto.isPresent()) {
            model.addAttribute("producto", producto);
            return "formulario-editar-productos";
        }
        return "redirect:/administracion";
    }
}