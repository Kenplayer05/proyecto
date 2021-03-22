/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.proyecto.repositorio;

import com.example.proyecto.modelos.catalogo;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author 50496
 */
public interface CatalogoRepositorio extends CrudRepository<catalogo, Long>{
    
}
