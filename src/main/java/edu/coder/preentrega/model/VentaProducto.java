package edu.coder.preentrega.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
public class VentaProducto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "venta_id")
    private Venta venta;

    @ManyToOne
    @JoinColumn(name = "producto_id")
    private Producto producto;

    private Integer cantidad;

    public VentaProducto() {
    }

    public VentaProducto(Venta venta, Producto producto, Integer cantidad) {
        this.venta = venta;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VentaProducto that = (VentaProducto) o;
        return Objects.equals(id, that.id) && Objects.equals(venta, that.venta) && Objects.equals(producto, that.producto) && Objects.equals(cantidad, that.cantidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, venta, producto, cantidad);
    }

    @Override
    public String toString() {
        return "VentaProducto{" +
                "id=" + id +
                ", venta=" + venta +
                ", producto=" + producto +
                ", cantidad=" + cantidad +
                '}';
    }
}


