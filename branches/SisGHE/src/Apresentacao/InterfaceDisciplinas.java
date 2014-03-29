/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Apresentacao;

import Disciplinas.Controle.ControlClass;
import Disciplinas.Controle.ControlDay;
import Disciplinas.Controle.ControlSubject;
import Disciplinas.Modelo.Dia;
import Disciplinas.Modelo.Disciplina;
import Disciplinas.Modelo.Hora;
import Disciplinas.Modelo.Turma;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;

/**
 *
 * @author larissa
 */

public class InterfaceDisciplinas extends JPanel{
    
    public InterfaceDisciplinas(){
              
        this.setLayout(new GridLayout(375,1));

        ControlSubject controlSubect = new ControlSubject();
        ArrayList <Disciplina> disciplinas = controlSubect.callDeserialize();
        Iterator i = disciplinas.iterator();
        
                
        while(i.hasNext()){
            
            Panel pnlGuardaTudo = new Panel();
            
            Disciplina d = (Disciplina) i.next();
               
            JLabel Jlcodigo = new JLabel();
            JLabel Jlnome = new JLabel();
            JLabel Jlpre = new JLabel();
            JLabel Jlp   = new JLabel();
            JLabel Jconome = new JLabel();
            JLabel Jlteste = new JLabel();
            
            Jlp.setSize(30,30);
            Jlpre.setSize(30,30);
            Jlcodigo.setSize(30, 30);
            Jlnome.setSize(30, 30);
            Jconome.setSize(30, 30);
            Jlteste.setSize(30, 30);

            Jlnome.setText("                  "+d.getNome());
            Jlteste.setText("                 ");
            Jconome.setText("Código da disciplina:");
            Jlcodigo.setText(d.getCodigo());
            
           // Jlp.setText("<html>Pre-requisito <br>Da Materia:</html>");
            Jlp.setText("Pré-requisito da Matéria:");
            Jlpre.setText(d.getPre_req());
            
            this.add(Jlnome);
            this.add(Jlteste);
            this.add(Jconome);
            this.add(Jlcodigo);
            this.add(Jlp);
            this.add(Jlpre);
         
         ArrayList<Turma> turmas = d.getTurmas();
         Iterator iTurma = turmas.iterator();
                     
            while (iTurma.hasNext()) {
             Turma turma = (Turma) iTurma.next();
                 
            JLabel Jlturma = new JLabel();    
            JLabel Jltnome = new JLabel();
             
            Jlturma.setSize(30, 30);
            Jltnome.setSize(30, 30);
       
            Jltnome.setText("Turma:");
            Jlturma.setText(turma.getNome());
            
            this.add(Jltnome);
            this.add(Jlturma);
            
              
            ArrayList<Dia> dias = turma.getDias();
            Iterator iDia = dias.iterator();
                
                while (iDia.hasNext()) {
                    Dia dia = (Dia) iDia.next();
                    
                     JLabel Jldia = new JLabel();
            //         JLabel Jlnomedia = new JLabel();
                     
                     Jldia.setSize(30, 30);
              //       Jlnomedia.setSize(30, 30);
                     
                //     Jlnomedia.setText("Dia:");
                     Jldia.setText(dia.getNome());
                     
                  //   this.add(Jlnomedia);
                     this.add(Jldia);
                    
                   }
                
                ArrayList<Hora> horas = turma.getHoras();
                Iterator iHora = horas.iterator();
                
                while (iHora.hasNext()) {
                    Hora hora = (Hora) iHora.next();
                    
                     JLabel Jlhora = new JLabel();
           
                     Jlhora.setSize(30, 30);
                     Jlhora.setText(hora.getNome());
            
                    
                      this.add(Jlhora);
                }
             }
           }     
        }     
}
