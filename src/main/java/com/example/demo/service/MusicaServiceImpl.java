/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.Musica;
import com.example.demo.repository.MusicaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ASUS
 */
@Service
public class MusicaServiceImpl implements MusicaService{

    
    @Autowired//Cree como un objeto referencial
    private MusicaRepository musicarepository;
    
    @Override
    public Musica crear(Musica m) {
        return musicarepository.save(m);
    }

    @Override
    public Musica findByID(Integer id) {
        return musicarepository.findById(id).orElse(null);
    }

    @Override
    public List<Musica> findByAll() {
        return musicarepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        musicarepository.deleteById(id);
    }
    
}
