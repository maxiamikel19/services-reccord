package com.amikelmaxi.backreccord.servicereccord.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amikelmaxi.backreccord.servicereccord.models.Client;
import com.amikelmaxi.backreccord.servicereccord.models.LocalService;

public interface LocalServiceRepository extends JpaRepository<LocalService, Integer>{
    
    List<LocalService> findByClient(Client client);
}
