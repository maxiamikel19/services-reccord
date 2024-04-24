package com.amikelmaxi.backreccord.servicereccord.services.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.amikelmaxi.backreccord.servicereccord.models.Client;
import com.amikelmaxi.backreccord.servicereccord.models.dtos.ClientDTO;
import com.amikelmaxi.backreccord.servicereccord.repositories.ClientRepository;
import com.amikelmaxi.backreccord.servicereccord.services.ClientService;
import com.amikelmaxi.backreccord.servicereccord.services.exceptions.ObjectDuplicateCreateException;

@Service
public class ClientServiceImpl implements ClientService{
    
    private final ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public Client save(ClientDTO client) {
        
        Optional<Client> optionalClient = this.clientRepository.findByCpf(client.getCpf());
        if(optionalClient.isPresent()){
            throw new ObjectDuplicateCreateException("O CPF já existe no sistema");
        }

        optionalClient = this.clientRepository.findByEmail(client.getEmail());
        if(optionalClient.isPresent()){
            throw new ObjectDuplicateCreateException("O EMAIL já existe no sistema");
        }

        Client savedClient = this.clientRepository.save(new Client(client));
        return savedClient;
    }

    @Override
    public Client findById(Integer id) {
        Optional<Client> optionalClient = this.clientRepository.findById(id);
        return optionalClient.orElseThrow( () -> new ObjectDuplicateCreateException("O código informado não está presente"));
    }

    @Override
    public Client findByCpf(String cpf) {
        Optional<Client> optionalClient = this.clientRepository.findByCpf(cpf);
        if(optionalClient.isPresent()){
            throw new ObjectDuplicateCreateException("O CPF já existe no sistema");
        }
        return optionalClient.get();
    }

    @Override
    public void update(Integer id) {
        Client optionalClient = this.findById(id);
        this.clientRepository.save(optionalClient);
    }

    
}
