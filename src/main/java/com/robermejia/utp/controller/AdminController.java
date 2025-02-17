package com.robermejia.utp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
}