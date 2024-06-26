package com.amikelmaxi.backreccord.servicereccord.models;


import java.math.BigDecimal;
import java.time.LocalDate;

import com.amikelmaxi.backreccord.servicereccord.models.dtos.LocalServiceDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "local_services")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class LocalService {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;
    private LocalDate serviceDate;
    private BigDecimal cost;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    public LocalService(LocalServiceDTO obj){
        this.client = obj.getClient();
        this.cost = obj.getCost();
        this.description = obj.getDescription();
        this.id = obj.getId();
        this.name = obj.getName();
        this.serviceDate = obj.getServiceDate();
    }
}
