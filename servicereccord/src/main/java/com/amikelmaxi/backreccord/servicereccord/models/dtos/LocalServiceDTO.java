package com.amikelmaxi.backreccord.servicereccord.models.dtos;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.amikelmaxi.backreccord.servicereccord.models.LocalService;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LocalServiceDTO {
    private Integer id;
    private String name;
    private String description;
    private LocalDate serviceDate;
    private BigDecimal cost;
    private String client;

    public LocalServiceDTO(LocalService obj){
        this.client = obj.getClient().getName();
        this.cost = obj.getCost();
        this.description = obj.getDescription();
        this.id = obj.getId();
        this.name = obj.getName();
        this.serviceDate = obj.getServiceDate();
    }
}
