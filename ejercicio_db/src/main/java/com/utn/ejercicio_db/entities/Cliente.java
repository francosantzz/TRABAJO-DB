package com.utn.ejercicio_db.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
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
public class Cliente extends EntidadBase {

    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    // hola me explican :( a mi tambien porfa D:

    @OneToMany
    @JoinColumn(name = "cliente_Id")
    private List<Domicilio>domicilios=new ArrayList<>();
}
