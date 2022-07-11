/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.model.Lista;
import com.example.demo.model.Musica;
import com.example.demo.service.ListaService;
import com.example.demo.service.MusicaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ASUS
 */
@RestController
@RequestMapping("/api/lista")
public class ListaController {

    @Autowired
    ListaService listaservice;

    @GetMapping("/lista")
    public ResponseEntity<List<Lista>> listar() {

        return new ResponseEntity<>(listaservice.findByAll(), HttpStatus.OK);

    }

    @PostMapping("/crear")
    public ResponseEntity<Lista> crear(@RequestBody Lista l) {
        return new ResponseEntity<>(listaservice.crear(l), HttpStatus.CREATED);

    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Lista> elimnar(@PathVariable Integer id) {
        listaservice.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);

    }
}
