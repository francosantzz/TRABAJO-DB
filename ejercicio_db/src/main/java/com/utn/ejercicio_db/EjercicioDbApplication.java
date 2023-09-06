package com.utn.ejercicio_db;

import com.utn.ejercicio_db.entities.*;
import com.utn.ejercicio_db.repositories.*;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class EjercicioDbApplication {

    @Autowired
    ClienteRepository clienteRepository;
    @Autowired
    DetallePedidoRepository detallePedidoRepository;
    @Autowired
    DomicilioRepository domicilioRepository;
    @Autowired
    FacturaRepository facturaRepository;
    @Autowired
    PedidoRepository pedidoRepository;
    @Autowired
    ProductoRepository productoRepository;
    @Autowired
    UsuarioRepository usuarioRepository;
    @Autowired
    RubroRepository rubroRepository;
    @Autowired
    ConfiguracionGeneralRepository configuracionGeneralRepository;

    public static void main(String[] args) {
        SpringApplication.run(EjercicioDbApplication.class, args);
        System.out.println("Funcionando");
    }
    @Bean
    CommandLineRunner demo() {
        return args -> {

            //Patrón de diseño builder
            Rubro rubro = Rubro.builder()
                    .denominacion("Comida")
                    .build();
            rubroRepository.save(rubro);

            Usuario usuario = Usuario.builder()
                    .rol("Cliente")
                    .password("holas")
                    .nombre("Rodri")
                    .build();
            usuarioRepository.save(usuario);

            //Añadimos el objeto rubro a producto
            Producto producto = Producto.builder()
                    .denominacion("pancho")
                    .precioVenta(500.5)
                    .precioCompra(200.0)
                    .rubro(rubro)
                    .receta("cocinarlo")
                    .stockActual(14)
                    .stockMinimo(1)
                    .tiempoEstimadoCocina(15)
                    .tipo("nose")
                    .unidadMedida("kg")
                    .build();
            productoRepository.save(producto);

            Cliente cliente = Cliente.builder()
                    .apellido("Benavidez")
                    .nombre("Rodri")
                    .email("rodri@yahoo.com")
                    .telefono("12345678")
                    .domicilios(new ArrayList<Domicilio>())
                    .build();
            clienteRepository.save(cliente);

            Domicilio domicilio = Domicilio.builder()
                    .calle("Calle")
                    .clientes(new ArrayList<Cliente>())
                    .localidad("Mendoza")
                    .numero("1234")
                    .pedidos(new ArrayList<Pedido>())
                    .build();
            domicilioRepository.save(domicilio);

            Pedido pedido = Pedido.builder()
                    .fecha("18/8/74")
                    .estado("cocinando")
                    .total(1.0)
                    .tipoEnvio("Retiro en local")
                    .horaEstimadaEntrega("2")
                    .cliente(cliente)
                    .domicilio(domicilio)
                    .usuario(usuario)
                    .build();
            pedidoRepository.save(pedido);

            DetallePedido detallePedido = DetallePedido.builder()
                    .producto(producto)
                    .cantidad(1)
                    .subtotal(500.0)
                    .pedido(pedido)
                    .build();
            detallePedidoRepository.save(detallePedido);


            Factura factura = Factura.builder()
                    .descuento(100.0)
                    .fecha("18/8/74")
                    .formaPago("Efectivo")
                    .numero(1)
                    .pedido(pedido)
                    .total(400)
                    .build();
            facturaRepository.save(factura);

        };
        }
    }