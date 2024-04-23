package com.amikelmaxi.backreccord.servicereccord.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amikelmaxi.backreccord.servicereccord.models.LocalService;

public interface LocalServiceRepository extends JpaRepository<LocalService, Integer>{
    
}
