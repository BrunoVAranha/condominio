package com.proj.cond.service;

import com.proj.cond.domain.Morador;
import com.proj.cond.repository.MoradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoradorService {

    @Autowired
    MoradorRepository moradorRepository;

    public List<Morador> getMoradoresPorCondominio(Integer codCond){
        return moradorRepository.findByCondominio_CodCond(codCond);
    }
}
