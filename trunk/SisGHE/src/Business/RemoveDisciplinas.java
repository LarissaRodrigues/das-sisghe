/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Model.Disciplina;
import View.ListaDisciplinas;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.DefaultListModel;

/**
 *
 * @author david
 */
public class RemoveDisciplinas {

    /*
     * To change this template, choose Tools | Templates
     * and open the template in the editor.
     */
    /**
     *
     * @author david
     */
    public static boolean validaDisciplina(ArrayList<Disciplina> materias, Model.Disciplina disciplinaEscolhida,
            DefaultListModel lista_selected, DefaultListModel lista) throws Exception {
        ArrayList<Disciplina> arrayDisciplinaEscolhida = new ArrayList<Disciplina>();
        boolean verifica = false;

        //Remover apenas Uma disciplina    
        for (int auxCont = 0; auxCont < lista.getSize(); auxCont++) {
            Disciplina auxD = (Disciplina) lista.getElementAt(auxCont);
            if (disciplinaEscolhida.getCodigo().equals((auxD.getPre_req()))) {
                System.out.println(auxD.getNome());
                lista_selected.removeElement(disciplinaEscolhida);
                lista.removeElement(auxD);
               
            } else {
                lista_selected.removeElement(disciplinaEscolhida);
            }
        }
     
        for (int auxCont2 = 0; auxCont2 < lista.getSize(); auxCont2++) {
            Disciplina auxD = (Disciplina) lista.getElementAt(auxCont2);
            
            if (auxD.getPre_req().indexOf(" e ") != -1) {
               
                quebraString(auxD, disciplinaEscolhida, lista);
            }
            
            
        }




        //Gerando a Array Com as disciplinas interelacionadas pelo pre_req.
        
        for (int auxCont = 0; auxCont < lista_selected.size(); auxCont++) {
            
            Disciplina auxDisciplina = (Disciplina) lista_selected.getElementAt(auxCont);

         
            if (disciplinaEscolhida.getCodigo().equals(auxDisciplina.getPre_req())) {
                arrayDisciplinaEscolhida.add(disciplinaEscolhida);
                arrayDisciplinaEscolhida.add(auxDisciplina);
                Disciplina auxDisc = auxDisciplina;
                
                for (int auxCont2 = 0; auxCont2 < lista_selected.size(); auxCont2++) {
                    Disciplina disciplina2 = (Disciplina) lista_selected.getElementAt(auxCont2);
                    if (auxDisc.getCodigo().equals(disciplina2.getPre_req())) {
                        arrayDisciplinaEscolhida.add(disciplina2);
                    }
                }
                
            }
            
        }
        
        
        
        
        Iterator i = arrayDisciplinaEscolhida.iterator();
        while (i.hasNext()) {
            Disciplina disciplinaArray = (Disciplina) i.next();
            //Remove da lista_selected todas as disciplinas da array arraDisciplinaEscolhida
            for (int auxCont = 0; auxCont < lista_selected.size(); auxCont++) {
                Disciplina disciplina3 = (Disciplina) lista_selected.getElementAt(auxCont);
                if (disciplinaArray.equals(disciplina3)) {
                    lista_selected.removeElement(disciplina3);
                }
            }
            
        }

       
        Iterator x = arrayDisciplinaEscolhida.iterator();
        while (x.hasNext()) {
            Disciplina disciplinaArray = (Disciplina) x.next();
            
            for (int auxCont = 0; auxCont < lista.getSize(); auxCont++) {
                
                Disciplina auxDisciplina = (Disciplina) lista.getElementAt(auxCont);
                
                if (disciplinaArray.getCodigo().equals(auxDisciplina.getPre_req())) {
                    
                    lista.removeElement(auxDisciplina);
                }
            }
        }
        lista.addElement(disciplinaEscolhida);

        //Procura por matérias com mais de um pré requisito
        while (i.hasNext()) {            
            for (int auxCont = 0; auxCont < lista.getSize(); auxCont++) {
                Disciplina auxDisciplina = (Disciplina) lista.getElementAt(auxCont);
                if (auxDisciplina.getPre_req().indexOf(" e ") != -1) {
                    
                    quebraStringE(auxDisciplina, arrayDisciplinaEscolhida, lista);
                    
                }
                
                
            }
            
            
        }




             

        
        
        return verifica;
    }
    
    public static boolean quebraString(Disciplina auxD, Disciplina disciplinaEscolhida, DefaultListModel lista) throws Exception {
        boolean confirm = false;
        try {
            String splitVector[] = auxD.getPre_req().split(" ");
            for (int auxCont = 0; auxCont < splitVector.length; auxCont++) {
                if (splitVector[auxCont].equals(disciplinaEscolhida.getCodigo())) {
                    lista.removeElement(auxD);
                  
                    confirm = true;
                }
            }
            
        } catch (Exception ex) {
            confirm = false;
            
        }
        return confirm;
        
    }
    
    public static boolean quebraStringE(Disciplina d, ArrayList<Disciplina> removeArray, DefaultListModel lista) {
        boolean confirm = false;
        boolean verifica = false;
        //Quebra A String do pre requisito para comparação posterior.
        try {
            String splitVector[] = d.getPre_req().split(" ");
            
            Iterator i = removeArray.iterator();
           
            while (i.hasNext()) {
                Disciplina listaDisciplina = (Disciplina) i.next();
                
                for (int contVector = 0; contVector < splitVector.length; contVector++) {
                    if (splitVector[contVector].equals(listaDisciplina.getCodigo())) {
                        
                        confirm = true;
                    } else {
                        confirm = false;
                    }
                }
            }
            if (confirm == true) {
                
                lista.removeElement(d);
            }
        } catch (Exception e) {
            verifica = false;
        }
        return verifica;
    }
    
    public static boolean removeDisciplina(Disciplina disciplinaEscolhida, DefaultListModel lista) {
        boolean confirm = false;
        
        for (int auxCont = 0; auxCont < lista.getSize(); auxCont++) {
            Disciplina auxDisciplina = (Disciplina) lista.getElementAt(auxCont);
            if (disciplinaEscolhida.equals(auxDisciplina)) {
                confirm = true;
            } else {
                confirm = false;
            }
            
        }
        if (confirm != false) {
            lista.removeElement(disciplinaEscolhida);
            lista.addElement(disciplinaEscolhida);
        }
        return confirm;        
    }
}