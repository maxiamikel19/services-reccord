package com.amikelmaxi.backreccord.servicereccord.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.amikelmaxi.backreccord.servicereccord.models.Client;
import com.amikelmaxi.backreccord.servicereccord.models.LocalService;
import com.amikelmaxi.backreccord.servicereccord.models.dtos.LocalServiceDTO;
import com.amikelmaxi.backreccord.servicereccord.repositories.LocalServiceRepository;
import com.amikelmaxi.backreccord.servicereccord.services.LocalServiceService;
import com.amikelmaxi.backreccord.servicereccord.services.exceptions.ObjectSearchIdNotFoundException;

@Service
public class LocalServiceServiceImpl implements LocalServiceService{

    private final LocalServiceRepository localServiceRepository;
    private final ClientServiceImpl clientService;

    

    public LocalServiceServiceImpl(LocalServiceRepository localServiceRepository, ClientServiceImpl clientService) {
        this.localServiceRepository = localServiceRepository;
        this.clientService = clientService;
    }

    @Override
    public LocalService save(LocalServiceDTO localService) {
        Client client = clientService.findByCpf(localService.getClient().getCpf());
        localService.setClient(client);
        LocalService newService = this.localServiceRepository.save(new LocalService(localService));
        return newService;
    }

    @Override
    public List<LocalServiceDTO> findAll() {
        List<LocalService> services = this.localServiceRepository.findAll();
        List<LocalServiceDTO> listDTO = services.stream().map(s -> new LocalServiceDTO(s)).collect(Collectors.toList());
        return listDTO;
    }

    @Override
    public List<LocalServiceDTO> findByClient(Integer clientId) {
        Client client = this.clientService.findById(clientId);
        List<LocalService> list = this.localServiceRepository.findByClient(client);
        List<LocalServiceDTO> listDto = list.stream().map(s -> new LocalServiceDTO(s)).collect(Collectors.toList());
        return listDto;
    }

    @Override
    public LocalService findById(Integer id) {
        Optional<LocalService> localService = this.localServiceRepository.findById(id);
        return localService.orElseThrow( () -> new ObjectSearchIdNotFoundException("Id do serviço não foi encontrado"));
    }
    
}
