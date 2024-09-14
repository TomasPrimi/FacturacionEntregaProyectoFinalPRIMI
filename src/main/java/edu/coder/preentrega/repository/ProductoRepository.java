package edu.coder.preentrega.repository;

import edu.coder.preentrega.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> { }
