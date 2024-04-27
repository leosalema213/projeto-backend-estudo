package br.com.leops.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.leops.projeto.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {

}
