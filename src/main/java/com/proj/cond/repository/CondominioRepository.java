package com.proj.cond.repository;

import com.proj.cond.domain.Condominio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CondominioRepository extends JpaRepository<Condominio, Integer> {

    public Optional<Condominio> findById(Integer codCond);
}
