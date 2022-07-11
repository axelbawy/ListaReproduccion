/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.model.Musica;
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
@RequestMapping("/api/musica")
public class MusicaController {

    @Autowired
    MusicaService musicaservice;

    @GetMapping("/lista")
    public ResponseEntity<List<Musica>> listar() {

        return new ResponseEntity<>(musicaservice.findByAll(), HttpStatus.OK);

    }

    @PostMapping("/crear")
    public ResponseEntity<Musica> crear(@RequestBody Musica m) {
        return new ResponseEntity<>(musicaservice.crear(m), HttpStatus.CREATED);

    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Musica> elimnar(@PathVariable Integer id) {
        musicaservice.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);

    }
}
