
package com.example.proyecto.controladores;

import com.example.proyecto.modelos.catalogo;
import com.example.proyecto.servicios.catalogoServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CatalogoUIControlador {
     @Autowired
private catalogoServicios servicio;

@RequestMapping("/")
public String catalogo(Model model){
setParametro(model,"lista", servicio.getTodos());
return "index";
}
@GetMapping("/crear")
public String irCrear(Model model){
setParametro(model, "catalogo", new catalogo());
return "next";
}

@GetMapping("/actualizar/{id}")
public String irActualizar(@PathVariable("id") Long id, Model model){
setParametro(model, "catalogo", servicio.getValor(id));
return "next";
}
@PostMapping("/guardar")
public String guardar(catalogo catalogos, Model model){
servicio.guardar(catalogos);
return "redirect:/";
}

@GetMapping("/eliminar/{id}")
public String eliminar(@PathVariable("id") Long id, Model model){
servicio.eliminar(id);
return "redirect:/";
}

public void  setParametro(Model model, String atributo, Object valor){
model.addAttribute(atributo, valor);
}  
}
