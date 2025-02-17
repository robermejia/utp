package com.robermejia.utp.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.robermejia.utp.entities.Pago;
import com.robermejia.utp.services.ProductoService;
import com.robermejia.utp.services.PagoService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("pagos")
@RequiredArgsConstructor
public class PagoController {

    private final PagoService servicePago;
    private final ProductoService serviceProducto;

    @GetMapping
    public String getPagos(Model model) {
        model.addAttribute("pagos", servicePago.getPagos());
        return "pagos/lista";
    }

    @GetMapping("nuevo")
    public String nuevoPagos(Model model) {
        model.addAttribute("pago", new Pago());
        model.addAttribute("productos", serviceProducto.getProductos());
        return "pagos/formulario";
    }

    @PostMapping("procesar")
    public String procesar(@Valid @ModelAttribute Pago pago, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("pago", pago);
            model.addAttribute("productos", serviceProducto.getProductos());
            return "pagos/formulario";
        }
        pago.setFecha(LocalDateTime.now());
        servicePago.savePago(pago);
        return "redirect:/pagos";
    }
}
