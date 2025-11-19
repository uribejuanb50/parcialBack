package com.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.modelos.Clinica;

@Repository
public interface ClinicaRepositorio extends JpaRepository<Clinica,Long> {

}
