package com.modelos;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.time.Instant;
import lombok.*;

@Entity
@Table(name = "clinica")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(onlyExplicitlyIncluded = true)
@Builder
public class Clinica {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClinica;

    @Column(nullable = false, unique = true)
    private String nombreClinica;

    @Column(nullable = false)
    private String direccionClinica;

    @Column(nullable = false)
    private int nCamas;

    @Column(nullable = false)
    private int numeroClinica;

    @Column(nullable = false)
    private String ciudadClinica;

    @Column(nullable = false)
    private Instant fechaCreacion;

    @OneToMany(mappedBy = "clinica")
    private ArrayList<Medico> medicos;
}
