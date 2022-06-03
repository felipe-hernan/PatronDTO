package com.propiedades.alquiler.dto;

import java.io.Serializable;

public class PropiedadDTO implements Serializable {

    private Long id_propiedad;
    private String tipo;
    private String direccion;
    private Double valor_alquiler;
    private String nombre_inquilino;
    private String apellido_inquilino;

    public void setId_propiedad(Long id_propiedad) {
        this.id_propiedad = id_propiedad;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setValor_alquiler(Double valor_alquiler) {
        this.valor_alquiler = valor_alquiler;
    }

    public void setNombre_inquilino(String nombre_inquilino) {
        this.nombre_inquilino = nombre_inquilino;
    }

    public void setApellido_inquilino(String apellido_inquilino) {
        this.apellido_inquilino = apellido_inquilino;
    }

    public Long getId_propiedad() {
        return id_propiedad;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDireccion() {
        return direccion;
    }

    public Double getValor_alquiler() {
        return valor_alquiler;
    }

    public String getNombre_inquilino() {
        return nombre_inquilino;
    }

    public String getApellido_inquilino() {
        return apellido_inquilino;
    }

}
