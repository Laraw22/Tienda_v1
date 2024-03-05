package com.tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="Producto")
public class Producto implements Serializable {

  
    
    private static final long serialVersionID = 1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_producto")
    private long idProducto;    
    private String descripcion;
    private String detalle;
    private double precio;
    private int existencias;    
    private String ruta_imagen;
    private boolean activo;

      public Producto() {
    }

    public Producto(String descripcion, boolean activo) {
        this.descripcion = descripcion;
        this.activo = activo;
    }
      
      
}
