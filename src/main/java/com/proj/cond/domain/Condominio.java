package com.proj.cond.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity(name="condominios")
@Getter
@Setter
@NoArgsConstructor
public class Condominio {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer codCond;
    private String nomeCond;
    private String nomeFant;
    private String endCond;
    private Integer cadCondNum;
    private String bairroCond;
    private String cidCond;
    private String ufCond;
    private String cepCond;
    private String emailCond;
    private String telFixoCond;
    private String cnpjCond;
    private String inscrEstCond;
    private String inscrMunCond;
    @OneToMany
    private List<Morador> moradores;

}
