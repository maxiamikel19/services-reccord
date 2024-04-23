package com.amikelmaxi.backreccord.servicereccord.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amikelmaxi.backreccord.servicereccord.models.Client;

public interface ClientRepository extends JpaRepository<Client, Integer>{
    
}
