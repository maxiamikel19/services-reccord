package com.amikelmaxi.backreccord.servicereccord.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.amikelmaxi.backreccord.servicereccord.models.dtos.ClientDTO;
import com.amikelmaxi.backreccord.servicereccord.services.impl.ClientServiceImpl;

@RequestMapping(value = "api/v1/clients")
@RestController
@CrossOrigin("*")
public class ClienteController {
    
    private final ClientServiceImpl clientServiceImpl;

    public ClienteController(ClientServiceImpl clientServiceImpl) {
        this.clientServiceImpl = clientServiceImpl;
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> findById(@PathVariable Integer id){
        return ResponseEntity.ok().body(this.clientServiceImpl.findById(id));
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody ClientDTO clientDTO){
        return new ResponseEntity<>(this.clientServiceImpl.save(clientDTO), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<?> findByCpf(@RequestParam("cpf") String cpf){
        return new ResponseEntity<>(this.clientServiceImpl.findByCpf(cpf), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody ClientDTO clientDTO){
        this.clientServiceImpl.update(clientDTO);
        return new ResponseEntity<>("Updated", HttpStatus.OK);
    }

}
