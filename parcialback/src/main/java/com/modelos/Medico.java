package com.modelos;

import jakarta.persistence.*;
import java.time.Instant;
import lombok.*;

@Entity
@Table(name = "medico")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(onlyExplicitlyIncluded = true)
@Builder
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMedico;

    @Column(nullable = false)
    private String nombreMedico;

    @Column(nullable = false)
    private String especialidadMedico;

    @Column(nullable = false, unique = true)
    private String correoMedico;

    @Column(nullable = false, unique = true)
    private String telefonoMedico;

    @Column(nullable = false)
    private Instant fechaContratacion;

    @ManyToOne
    @JoinColumn(name = "clinica_id", nullable = false)
    private Clinica clinica;

}
