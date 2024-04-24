package com.amikelmaxi.backreccord.servicereccord.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.amikelmaxi.backreccord.servicereccord.models.dtos.LocalServiceDTO;
import com.amikelmaxi.backreccord.servicereccord.services.impl.LocalServiceServiceImpl;

@RestController
@RequestMapping(value = "/api/v1/services")
public class LocalServiceController {
    
    private final LocalServiceServiceImpl localServiceServiceImpl;

    public LocalServiceController(LocalServiceServiceImpl localServiceServiceImpl) {
        this.localServiceServiceImpl = localServiceServiceImpl;
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody LocalServiceDTO localService){
        return new ResponseEntity<>(this.localServiceServiceImpl.save(localService), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<LocalServiceDTO>> findAll(){
        return new ResponseEntity<>(this.localServiceServiceImpl.findAll(), HttpStatus.OK);
    } 

    @GetMapping("/client")
    public ResponseEntity<List<LocalServiceDTO>> findByClient(@RequestParam("clientId") Integer clientId){
        return new ResponseEntity<>(this.localServiceServiceImpl.findByClient(clientId), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Integer id){
        return new ResponseEntity<>(this.localServiceServiceImpl.findById(id), HttpStatus.OK);
    }
}
