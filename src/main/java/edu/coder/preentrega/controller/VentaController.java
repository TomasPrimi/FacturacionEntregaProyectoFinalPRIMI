package edu.coder.preentrega.controller;

import edu.coder.preentrega.model.Venta;
import edu.coder.preentrega.service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ventas")
public class VentaController {
    @Autowired
    private VentaService ventaService;

    @PostMapping("/agregar")
    public Venta agregarVenta(@RequestBody Venta venta) {
        return ventaService.agregarVenta(venta);
    }

    @GetMapping("/buscar/{id}")
    public Optional<Venta> buscarVenta(@PathVariable Long id) {
        return ventaService.buscarVenta(id);
    }

    @GetMapping("/listar")
    public List<Venta> listarVentas() {
        return ventaService.listarVentas();
    }
}
