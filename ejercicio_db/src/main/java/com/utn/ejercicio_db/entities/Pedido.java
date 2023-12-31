package com.utn.ejercicio_db.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.utn.ejercicio_db.enums.Estado;
import com.utn.ejercicio_db.enums.TipoEnvio;
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
public class Pedido extends EntidadBase {

    private String fecha;
    private String horaEstimadaEntrega;
    private Double total;
    @Enumerated(EnumType.STRING)
    private Estado estado;

    @Enumerated(EnumType.STRING)
    private TipoEnvio tipoEnvio;

    @OneToOne(fetch = FetchType.EAGER)
    private Factura factura;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "pedidosId")
    private List<DetallePedido> detallesPedidos = new ArrayList<>();

}
