package com.proj.cond.controller;

import com.proj.cond.domain.Condominio;
import com.proj.cond.domain.Morador;
import com.proj.cond.repository.CondominioRepository;
import com.proj.cond.repository.MoradorRepository;
import com.proj.cond.service.CondominioService;
import com.proj.cond.service.MoradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
@RequestMapping(path="/projeto")
public class TesteController {

    @GetMapping(path="/teste")
    public String getTest(){
        return "TESTE";
    }
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");

    @Autowired
    CondominioRepository condominioRepository;

    @Autowired
    CondominioService condominioService;

    @Autowired
    MoradorService moradorService;

    @Autowired
    MoradorRepository moradorRepository;

    @PostMapping(path="/addCond")
    public @ResponseBody String addNewCond () {
        Condominio cond = new Condominio();
        cond.setBairroCond("Parque do Colégio");
        cond.setCepCond("13209-201");
        cond.setCnpjCond("77.777.777/7777-77");
        cond.setCidCond("cidade");
        cond.setEmailCond("Jundiaí");
        cond.setCadCondNum(1371);
        cond.setEndCond("Rua do Retiro");
        cond.setNomeCond("Residencial Morada Dos Deuses");
        cond.setNomeFant("Morada Dos Deuses");
        cond.setInscrMunCond("7777777");
        cond.setInscrEstCond("6666666666");
        cond.setEmailCond("morada.deuses@gmail.com");
        cond.setTelFixoCond("(11)4567-1234");
        condominioRepository.save(cond);
        return "Saved";
    }
    @PostMapping(path="/addMor")
    public @ResponseBody String addNewMor () {
        Morador mor = new Morador();
        mor.setAndarMor(1);
        mor.setBlocoMor(1);
        mor.setAptoMor(1);
        mor.setCpfMor("123456789");
        mor.setRgMor("123456789");
        mor.setTelCelMor("1199999999");
        mor.setDtNascMor(LocalDate.parse("15/09/1996", formatter));
        moradorRepository.save(mor);
        return "Saved";
    }
    @GetMapping(path="/getMoradores")
    public ResponseEntity<List<Morador>> getMoradoresFromCondominio(@RequestParam Integer codCond){
        return new ResponseEntity<>(moradorService.getMoradoresPorCondominio(codCond), HttpStatus.ACCEPTED);
    }

    @GetMapping(path="/getCondominios")
    public ResponseEntity<List<Condominio>> getCondominios(){
        return new ResponseEntity<>(condominioService.getCondominios(), HttpStatus.ACCEPTED);
    }
    @GetMapping(path="/getCondominio")
    public ResponseEntity<Condominio> getCondominio(@RequestParam Integer codCond){
        return new ResponseEntity<>(condominioService.getCondominio(codCond), HttpStatus.ACCEPTED);
    }


}

