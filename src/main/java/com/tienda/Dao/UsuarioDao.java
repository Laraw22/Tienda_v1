package com.tienda.Dao;

import com.tienda.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioDao extends JpaRepository <Usuario, Long> {
    Usuario findByUsername(String username);
}
