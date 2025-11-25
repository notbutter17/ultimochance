package com.example.jgtmspago.Controller;

import com.example.jgtmspago.Entity.JgtPago;
import com.example.jgtmspago.Service.JgtPagoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pagos")
@RequiredArgsConstructor
public class JgtPagoController {

    private final JgtPagoService pagoService;

    @PostMapping
    public ResponseEntity<JgtPago> crear(@RequestBody JgtPago pago) {
        return ResponseEntity.ok(pagoService.crear(pago));
    }

    @GetMapping
    public ResponseEntity<List<JgtPago>> listar() {
        return ResponseEntity.ok(pagoService.listar());
    }

    @PutMapping("/{id}")
    public ResponseEntity<JgtPago> actualizar(
            @PathVariable Long id,
            @RequestBody JgtPago pago
    ) {
        return ResponseEntity.ok(pagoService.actualizar(id, pago));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        pagoService.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
