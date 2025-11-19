package com.dtos;

import java.util.ArrayList;

import lombok.Data;

@Data
public class ClinicaDTO {
    private String nombreClinica;
    private String direccionClinica;
    private int numeroClinica;
    private String ciudadClinica;
    private ArrayList<String> nombresMedicos;
}
