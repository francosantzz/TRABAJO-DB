package com.utn.ejercicio_db.repositories;

import com.utn.ejercicio_db.entities.Cliente;
import com.utn.ejercicio_db.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
