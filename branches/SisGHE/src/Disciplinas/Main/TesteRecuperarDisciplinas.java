/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Disciplinas.Main;

import Disciplinas.Controle.ControlSubject;
import Disciplinas.Modelo.Dia;
import Disciplinas.Modelo.Disciplina;
import Disciplinas.Modelo.Hora;
import Disciplinas.Modelo.Turma;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Axs
 */
public class TesteRecuperarDisciplinas {
    
    public static void main(String args[]){
    
        ControlSubject controlSubject = new ControlSubject();

        ArrayList<Disciplina> disciplinas = controlSubject.callDeserialize();
        Iterator iDisciplina = disciplinas.iterator();

        while (iDisciplina.hasNext()) {
            Disciplina disciplina = (Disciplina) iDisciplina.next();
            
            String disciplinaCodigo = disciplina.getCodigo();
            String disciplinaNome = disciplina.getNome();
            String disciplinaPre_Req = disciplina.getPre_req();
            
            System.out.println("Disciplina Codigo: " + disciplinaCodigo);
            System.out.println("Disciplina Nome: " + disciplinaNome);
            System.out.println("Disciplina Pre Requisito: " + disciplinaPre_Req);
            
            ArrayList<Turma> turmas = disciplina.getTurmas();
            Iterator iTurma = turmas.iterator();
            
            while (iTurma.hasNext()) {
                Turma turma = (Turma) iTurma.next();
                
                String turmaNome = turma.getNome();
    
                System.out.println("Turma Nome: " + turmaNome);
                
                ArrayList<Dia> dias = turma.getDias();
                Iterator iDia = dias.iterator();
                
                while (iDia.hasNext()) {
                    Dia dia = (Dia) iDia.next();
                    
                    String diaId = dia.getId_dia();
                    String diaNome = dia.getNome();
                    
                    System.out.println("Dia Codigo: " + diaId);
                    System.out.println("Dia Nome: " + diaNome);
                }
                
                ArrayList<Hora> horas = turma.getHoras();
                Iterator iHora = horas.iterator();
                
                while (iHora.hasNext()) {
                    Hora hora = (Hora) iHora.next();
                    
                    String horaId = hora.getId_hora();
                    String horaNome = hora.getNome();

                    System.out.println("Hora Codigo: " + horaId);
                    System.out.println("Hora Nome: " + horaNome);
                }
            }
        } 
    }
}
