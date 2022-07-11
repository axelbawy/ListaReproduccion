/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.Lista;
import java.util.List;

/**
 *
 * @author ASUS
 */
public interface ListaService {

    public Lista crear(Lista l);

    public Lista findByID(Integer id);

    public List<Lista> findByAll();

    public void delete(Integer id);

}
