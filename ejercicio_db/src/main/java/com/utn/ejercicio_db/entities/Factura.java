package com.utn.ejercicio_db.entities;

import com.utn.ejercicio_db.enums.FormaPago;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Factura extends EntidadBase {
    //DateTime
    private String fecha;
    private int numero;
    private Double descuento;
    private int total;
    @Enumerated(EnumType.STRING)
    private FormaPago formaPago;
}
