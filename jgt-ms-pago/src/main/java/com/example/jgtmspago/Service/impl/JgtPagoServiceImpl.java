package com.example.jgtmspago.Service.impl;


import com.example.jgtmspago.Entity.JgtPago;
import com.example.jgtmspago.Repository.JgtPagoRepository;
import com.example.jgtmspago.Service.JgtPagoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class JgtPagoServiceImpl implements JgtPagoService {

    private final JgtPagoRepository pagoRepository;

    @Override
    public JgtPago crear(JgtPago pago) {
        return pagoRepository.save(pago);
    }



    @Override
    public List<JgtPago> listar() {
        return pagoRepository.findAll();
    }

    @Override
    public JgtPago actualizar(Long id, JgtPago pago) {
        JgtPago entity = pagoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pago no encontrado"));

        entity.setJ_g_t_i_monto(pago.getJ_g_t_i_monto());
        entity.setJ_g_t_i_fecha(pago.getJ_g_t_i_fecha());

        return pagoRepository.save(entity);
    }

    @Override
    public void eliminar(Long id) {
        pagoRepository.deleteById(id);
    }
}
