package com.utn.ejercicio_db.entities;

import com.utn.ejercicio_db.enums.Tipo;
import jakarta.persistence.*;
import jakarta.transaction.Transactional;
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
@Transactional
public class Producto extends EntidadBase{


    @Enumerated(EnumType.STRING)
    private Tipo tipo;
    private int tiempoEstimadoCocina;
    private String denominacion;
    private Double precioVenta;
    private Double precioCompra;
    private int stockMinimo;
    private int stockActual;
    private String unidadMedida;
    private String receta;
    private String foto;


}
