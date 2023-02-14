package com.tienda_k.domain;

import lombok.Data;
import javax.persistence.Table;
import javax.persistence.Entity;
import java.io.Serializable;

@Data
@Entity
@Table(name="cliente")
public class Cliente implemets Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GenerateValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;
    
    // Attributes
    private String nombre;
    private String apellidos;
    private String correo;
    private String telefono;
    
    // Constructores
    public Cliente() {
    }

    public Cliente(String nombre, String apellidos, String correo, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
    }
    
}
