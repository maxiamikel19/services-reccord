package com.amikelmaxi.backreccord.servicereccord.services;

import com.amikelmaxi.backreccord.servicereccord.models.Client;
import com.amikelmaxi.backreccord.servicereccord.models.dtos.ClientDTO;

public interface ClientService {
    
    Client save(ClientDTO client);
    Client findById(Integer id);
    Client findByCpf(String cpf);
    void update(ClientDTO clientDTO);
}
