/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.Musica;
import java.util.List;

/**
 *
 * @author ASUS
 */
public interface MusicaService {

    public Musica crear(Musica m);

    public Musica findByID(Integer id);

    public List<Musica> findByAll();

    public void delete(Integer id);
}
