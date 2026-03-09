/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.joaoguilhermeburg;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class Estudante {

        private String nome;
        private Date DadadNascimento;
        private String cpf;
        private char genero;
        private String matrucula;
        private String email;
                
      
        public Estudante(){
        nome = " Nobody";
}
    public int obterIdade(Date hoje) {
    int idade = 0;

    return idade;
}
public String getNome (){
return nome;
}
public void setNome(String _nome){
    nome = _nome;
}
}