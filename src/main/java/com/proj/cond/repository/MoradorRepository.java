package com.proj.cond.repository;

import com.proj.cond.domain.Morador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MoradorRepository extends JpaRepository<Morador, Integer> {
    List<Morador> findByCondominio_CodCond(@Param("cod_cond") int codCond);
}
