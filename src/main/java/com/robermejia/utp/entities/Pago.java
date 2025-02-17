package com.robermejia.utp.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Entity
@Table(name = "pagos")
@Data
public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpagos")
    private Integer id;
    @Column 
    @NotNull(message = "Ingrese el monto")
    @Positive(message = "El monto debe ser positivo")
    private BigDecimal monto;
    @Column 
    private LocalDateTime fecha;
    @ManyToOne
    @JoinColumn(name = "producto", nullable = false) // Obligatorio "name"
    private Producto producto;
}
