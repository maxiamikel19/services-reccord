package com.amikelmaxi.backreccord.servicereccord.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amikelmaxi.backreccord.servicereccord.models.Client;

public interface ClientRepository extends JpaRepository<Client, Integer>{
    Optional<Client> findByCpf(String cpf);
    Optional<Client> findByEmail(String email);
}
