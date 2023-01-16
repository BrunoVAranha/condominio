package com.proj.cond.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
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

    public Integer getCodMor() {
        return codMor;
    }

    public void setCodMor(Integer codMor) {
        this.codMor = codMor;
    }

    public String getNomeMor() {
        return nomeMor;
    }

    public void setNomeMor(String nomeMor) {
        this.nomeMor = nomeMor;
    }

    public Boolean getMorResp() {
        return morResp;
    }

    public void setMorResp(Boolean morResp) {
        this.morResp = morResp;
    }

    public Integer getBlocoMor() {
        return blocoMor;
    }

    public void setBlocoMor(Integer blocoMor) {
        this.blocoMor = blocoMor;
    }

    public Integer getAndarMor() {
        return andarMor;
    }

    public void setAndarMor(Integer andarMor) {
        this.andarMor = andarMor;
    }

    public Integer getAptoMor() {
        return aptoMor;
    }

    public void setAptoMor(Integer aptoMor) {
        this.aptoMor = aptoMor;
    }

    public LocalDate getDtIniMor() {
        return dtIniMor;
    }

    public void setDtIniMor(LocalDate dtIniMor) {
        this.dtIniMor = dtIniMor;
    }

    public LocalDate getDtSaidaMor() {
        return dtSaidaMor;
    }

    public void setDtSaidaMor(LocalDate dtSaidaMor) {
        this.dtSaidaMor = dtSaidaMor;
    }

    public LocalDate getDtNascMor() {
        return dtNascMor;
    }

    public void setDtNascMor(LocalDate dtNascMor) {
        this.dtNascMor = dtNascMor;
    }

    public String getCpfMor() {
        return cpfMor;
    }

    public void setCpfMor(String cpfMor) {
        this.cpfMor = cpfMor;
    }

    public String getRgMor() {
        return rgMor;
    }

    public void setRgMor(String rgMor) {
        this.rgMor = rgMor;
    }

    public String getTelFixMor() {
        return telFixMor;
    }

    public void setTelFixMor(String telFixMor) {
        this.telFixMor = telFixMor;
    }

    public String getTelCelMor() {
        return telCelMor;
    }

    public void setTelCelMor(String telCelMor) {
        this.telCelMor = telCelMor;
    }

    public String getEmailMorBoolean() {
        return emailMorBoolean;
    }

    public void setEmailMorBoolean(String emailMorBoolean) {
        this.emailMorBoolean = emailMorBoolean;
    }

    public Condominio getCondominio() {
        return condominio;
    }

    public void setCondominio(Condominio condominio) {
        this.condominio = condominio;
    }
}
