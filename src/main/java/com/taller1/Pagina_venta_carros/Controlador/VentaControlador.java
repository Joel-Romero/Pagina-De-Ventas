package com.taller1.Pagina_venta_carros.Controlador;
import com.taller1.Pagina_venta_carros.Entidad.Venta;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class VentaControlador {

    @GetMapping("/formulario")
    public String mostrarFormulario(Model model){
        Venta venta=new Venta();
        model.addAttribute("venta", venta);
        List<String> listaProfesioines = Arrays.asList("Medicina General", "Pediatría", "Cardiología", "Dermatología", "Oftalmología", "Ortopedia");
        model.addAttribute("profesion", listaProfesioines);
        return "formulario/formulario";
    }
    @PostMapping("/enviar")
    public String enviarFormulario(@Valid @ModelAttribute Venta venta, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()) {
            model.addAttribute("errores", bindingResult.getAllErrors());
            return "formulario/formulario";
        }else{
            return "formulario/registroExitoso";
        }
    }
}
