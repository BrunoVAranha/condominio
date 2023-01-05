package com.proj.cond.service;

import com.proj.cond.domain.Condominio;
import com.proj.cond.repository.CondominioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CondominioService {

    @Autowired
    CondominioRepository condominioRepository;

    public List<Condominio> getCondominios(){
        return condominioRepository.findAll();
    }

    public Condominio getCondominio(Integer codCond){
        return condominioRepository.findById(codCond).get();
    }
}
