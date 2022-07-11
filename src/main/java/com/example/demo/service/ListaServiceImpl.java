/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.Lista;
import com.example.demo.repository.ListaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ASUS
 */
@Service
public class ListaServiceImpl implements ListaService{

    @Autowired//Cree como un objeto referencial
    private ListaRepository listarepository;
    
    @Override
    public Lista crear(Lista l) {
        return listarepository.save(l);
    }

    @Override
    public Lista findByID(Integer id) {
        return listarepository.findById(id).orElse(null);
    }

    @Override
    public List<Lista> findByAll() {
        return listarepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        listarepository.deleteById(id);
    }
    
}
