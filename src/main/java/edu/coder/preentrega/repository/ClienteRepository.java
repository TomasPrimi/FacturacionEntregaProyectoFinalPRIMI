package edu.coder.preentrega.repository;

import edu.coder.preentrega.model.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> { }
