package io.github.antoniojobs.model.repository;

import io.github.antoniojobs.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente,Integer> {
}
