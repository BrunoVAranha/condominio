package com.proj.cond.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Morador {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer codMor;
    private String nomeMor;
    private Boolean morResp;
    private Integer blocoMor;
    private Integer andarMor;
    private Integer aptoMor;
    private LocalDate dtIniMor;
    private LocalDate dtSaidaMor;
    private LocalDate dtNascMor;
    private String cpfMor;
    private String rgMor;
    private String telFixMor;
    private String telCelMor;
    private String emailMorBoolean;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "codCond")
    private Condominio condominio;
    //TODO VAGAS
//    @OneToMany
//    List<Vaga> vagas;
}
