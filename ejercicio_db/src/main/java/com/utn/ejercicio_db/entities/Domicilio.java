package com.utn.ejercicio_db.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Domicilio extends EntidadBase {
    private String calle;
    private String numero;
    private String localidad;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "domicilio_id")
    private List<Pedido> pedidos = new ArrayList<>();

    @OneToMany
    @JoinColumn(name = "domicilio_Id")
    private List<Cliente> clientes = new ArrayList<>();
}
