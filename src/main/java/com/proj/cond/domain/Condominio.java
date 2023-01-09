package com.proj.cond.domain;

import javax.persistence.*;
import java.util.List;

@Entity(name="condominios")
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

    public Integer getCodCond() {
        return codCond;
    }

    public void setCodCond(Integer codCond) {
        this.codCond = codCond;
    }

    public String getNomeCond() {
        return nomeCond;
    }

    public void setNomeCond(String nomeCond) {
        this.nomeCond = nomeCond;
    }

    public String getNomeFant() {
        return nomeFant;
    }

    public void setNomeFant(String nomeFant) {
        this.nomeFant = nomeFant;
    }

    public String getEndCond() {
        return endCond;
    }

    public void setEndCond(String endCond) {
        this.endCond = endCond;
    }

    public Integer getCadCondNum() {
        return cadCondNum;
    }

    public void setCadCondNum(Integer cadCondNum) {
        this.cadCondNum = cadCondNum;
    }

    public String getBairroCond() {
        return bairroCond;
    }

    public void setBairroCond(String bairroCond) {
        this.bairroCond = bairroCond;
    }

    public String getCidCond() {
        return cidCond;
    }

    public void setCidCond(String cidCond) {
        this.cidCond = cidCond;
    }

    public String getUfCond() {
        return ufCond;
    }

    public void setUfCond(String ufCond) {
        this.ufCond = ufCond;
    }

    public String getCepCond() {
        return cepCond;
    }

    public void setCepCond(String cepCond) {
        this.cepCond = cepCond;
    }

    public String getEmailCond() {
        return emailCond;
    }

    public void setEmailCond(String emailCond) {
        this.emailCond = emailCond;
    }

    public String getTelFixoCond() {
        return telFixoCond;
    }

    public void setTelFixoCond(String telFixoCond) {
        this.telFixoCond = telFixoCond;
    }

    public String getCnpjCond() {
        return cnpjCond;
    }

    public void setCnpjCond(String cnpjCond) {
        this.cnpjCond = cnpjCond;
    }

    public String getInscrEstCond() {
        return inscrEstCond;
    }

    public void setInscrEstCond(String inscrEstCond) {
        this.inscrEstCond = inscrEstCond;
    }

    public String getInscrMunCond() {
        return inscrMunCond;
    }

    public void setInscrMunCond(String inscrMunCond) {
        this.inscrMunCond = inscrMunCond;
    }

    public List<Morador> getMoradores() {
        return moradores;
    }

    public void setMoradores(List<Morador> moradores) {
        this.moradores = moradores;
    }

}
