package com.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.modelos.Medico;

@Repository
public interface MedicoRepositorio extends JpaRepository<Medico,Long> {

}
