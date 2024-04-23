package com.amikelmaxi.backreccord.servicereccord.models.dtos;

import com.amikelmaxi.backreccord.servicereccord.models.Client;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClientDTO {
    private Integer id;
    private String name;
    private String cpf;
    private String email;
    private String fone;

    public ClientDTO(Client obj){
        this.id = obj.getId();
        this.name = obj.getName();
        this.cpf = obj.getCpf();
        this.email = obj.getEmail();
        this.fone = obj.getFone();
    }
}
