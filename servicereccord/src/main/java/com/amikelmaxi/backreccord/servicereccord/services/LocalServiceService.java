package com.amikelmaxi.backreccord.servicereccord.services;

import java.util.List;

import com.amikelmaxi.backreccord.servicereccord.models.LocalService;
import com.amikelmaxi.backreccord.servicereccord.models.dtos.LocalServiceDTO;

public interface LocalServiceService {
    
    LocalService save(LocalServiceDTO localService);
    List<LocalServiceDTO> findAll();
    List<LocalServiceDTO> findByClient(Integer clientId);
    LocalService findById(Integer id);
}
