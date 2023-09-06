package com.utn.ejercicio_db.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Rubro extends EntidadBase {
    private String denominacion;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @Builder.Default
    @JoinColumn(name = "Rubro_id")
    List<Producto> productos = new ArrayList<>();
}
