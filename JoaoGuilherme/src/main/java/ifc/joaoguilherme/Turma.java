/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.joaoguilherme;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author aluno
 */
public class Turma {
    
    private Estudante estudante = new Estudante();
    private Professor professor = new Professor();
    private Disciplina diciplina = new Disciplina();
    
    private Set<Estudante> Estudante = new HashSet<Estudante>();
    private Set<Professor> Professor = new HashSet<Professor>();
    private Set<Disciplina> Disciplina = new HashSet<Disciplina>();
    
}
