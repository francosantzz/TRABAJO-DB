package com.utn.ejercicio_db.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DetallePedido extends EntidadBase {

    private int cantidad;
    private Double subtotal;

    @ManyToOne
    @JoinColumn(name = "pedido_Id")
    private Pedido pedido;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "producto_id")
    private Producto producto;
}
