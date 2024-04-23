package com.amikelmaxi.backreccord.servicereccord.services;

import com.amikelmaxi.backreccord.servicereccord.models.Client;

public interface ClientService {
    
    Client save(Client client);
    Client findById(Integer id);
    Client findByCpf(String cpf);
    void update(Integer id);
}
