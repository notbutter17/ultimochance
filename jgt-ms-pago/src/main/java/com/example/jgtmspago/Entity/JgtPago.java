package com.example.jgtmspago.Entity;


import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "jgt_pago")
@Data
public class JgtPago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long j_g_t_i_dPago;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal j_g_t_i_monto;

    @Column(nullable = false)
    private LocalDate j_g_t_i_fecha;
}
