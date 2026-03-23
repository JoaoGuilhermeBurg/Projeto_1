/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.joaoguilherme;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class Professor {

    private String nome;
    private String intidaeinstitucional;
    private String email;
    private int telefone;
    private String titulacao;
    private String area;
    private String regime;
    private Date datadIngresso;
    private String formacao;

    public Professor () {
        
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String _nome) {
        nome = _nome;
    }

    public String getIntidaeinstitucional() {
        return intidaeinstitucional;
    }

    public void setIntidaeinstitucional(String _intidaeinstitucional) {
        intidaeinstitucional = _intidaeinstitucional;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String _email) {
        email = _email;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int _telefone) {
        telefone = _telefone;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String _titulacao) {
        titulacao = _titulacao;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String _area) {
        area = _area;
    }

    public String getRegime() {
        return regime;
    }

    public void setRegime(String _regime) {
        regime = _regime;
    }

    public Date getDatadIngresso() {
        return datadIngresso;
    }

    public void setDatadIngresso(Date _datadIngresso) {
        datadIngresso = _datadIngresso;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String _formacao) {
        formacao = _formacao;
    }

}
