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

    private Condominio buildCond(){
        Condominio cond = new Condominio();
        cond.setBairroCond("bairro");
        cond.setCepCond("cep");
        cond.setCnpjCond("cnpj");
        cond.setCidCond("cidade");
        cond.setEmailCond("email");
        cond.setCadCondNum(1);
        cond.setEndCond("endereço");
        cond.setNomeCond("nome");
        cond.setInscrMunCond("inscrMun");
        cond.setInscrEstCond("inscrEst");
        return cond;
    }

    @PostMapping(path="/addCond")
    public @ResponseBody String addNewCond () {
        condominioRepository.save(buildCond());
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
        Condominio cond = buildCond();
        cond.setCodCond(1);
        mor.setCondominio(cond);
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

