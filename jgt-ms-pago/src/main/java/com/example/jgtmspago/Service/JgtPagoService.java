package com.example.jgtmspago.Service;



import com.example.jgtmspago.Entity.JgtPago;

import java.util.List;

public interface JgtPagoService {
    JgtPago crear(JgtPago pago);
    List<JgtPago> listar();
    JgtPago actualizar(Long id, JgtPago pago);
    void eliminar(Long id);
}
