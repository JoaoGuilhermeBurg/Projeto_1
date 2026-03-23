/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ifc.joaoguilherme;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class Estudante {

    private String nivel;
    private String nome;
    private Date DadadNascimento;
    private String cpf;
    private String genero;
    private int telefone;
    private String email;
    private int anoDingresso;
    private int semetreDingresso;
    private String situacaoAcademica;
    private String codigo;

    public Estudante() {
        nome = " Nobody";
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String _cpf) {
        cpf = _cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String _nome) {
        nome = _nome;
    }

    public int obterIdade(Date hoje) {
        int idade = 0;

        return idade;
    }

    public String obterGerero(String _genero) {

        String gerero = " ";

        return genero;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int _telefone) {
        telefone = _telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String _email) {
        email = _email;
    }

    public int getanoDingresso() {
        return anoDingresso;
    }

    public void setanoDingresso(int _anoDingresso) {
        anoDingresso = _anoDingresso;
    }

    public int getSemestreDingresso() {
        return semetreDingresso;
    }

    public void setSemestreDingresso(int _SemestreDingresso) {
        semetreDingresso = _SemestreDingresso;
    }

    public String getSituacaoAcademica() {
        return situacaoAcademica;
    }

    public void setSituacaoAcademica(String _situacaoAcademica) {

        situacaoAcademica = _situacaoAcademica;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCdigo(String _codigo) {
        codigo = _codigo;
    }
}
