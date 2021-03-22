/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.proyecto.servicios;

import com.example.proyecto.modelos.catalogo;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.proyecto.repositorio.CatalogoRepositorio;

@Service
public class catalogoServicios {
   @Autowired
    private CatalogoRepositorio repositorio;
    
    public catalogo guardar(catalogo entidad){
    return repositorio.save(entidad);
    }
    public void eliminar(Long id){
    repositorio.deleteById(id);
    }
    
    public Optional<catalogo> getValor(Long id){
    return repositorio.findById(id);
}
    
    public List<catalogo> getTodos(){
    return (List<catalogo>)repositorio.findAll();
    }  
}
