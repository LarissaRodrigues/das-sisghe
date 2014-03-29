package Business;

import Model.Disciplina;
import Control.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/**
 *
 * @author david
 */
public class LiberaDisciplina {

    public LiberaDisciplina() {
    }

    public static boolean validaDisciplina(ArrayList<Disciplina> materias, Model.Disciplina d, DefaultListModel lista_selected, DefaultListModel lista) throws Exception{
       
           
        
        
        boolean verifica = false;
        try {
            Iterator i = materias.iterator();
            while (i.hasNext()) {
                Disciplina disciplina = (Disciplina) i.next();
                
                if (d.getCodigo().equals(disciplina.getPre_req())) {
                    boolean achou = false;
                    for (int k = 0; k < lista.size(); k++) {
                        Disciplina dis = (Disciplina) lista.get(k);
                        if (dis.getNome().equals(disciplina.getNome())) {
                            achou = true;
                            break;
                        }
                    }
                    if (!achou) {
                        lista.addElement(disciplina);
                        verifica = true;
                    }
                } 
                else if (disciplina.getPre_req().indexOf(" e ") != -1) {
                    quebraStringE(disciplina, lista_selected, lista);

                        
                    removeDisciplina(disciplina, lista_selected, lista);

                    verifica = true;
                } 
                else if (disciplina.getPre_req().indexOf(" ou ") != -1) {
                    quebraStringOU(disciplina, lista_selected, lista);
                    removeDisciplina(disciplina, lista_selected, lista);
                    verifica = true;
                }
            }
        } catch (Exception e) {
            verifica = false;
        }
        return verifica;
    }

    public static boolean quebraStringE(Disciplina disciplina, DefaultListModel lista_selected, DefaultListModel lista) throws Exception {
        boolean confirm = false;
        boolean verifica = false;
        

        try {

            String splitVector[] = disciplina.getPre_req().split(" ");
            for (int contLista = 0; contLista < lista_selected.size(); contLista++) {
                Disciplina listaDisciplina = (Disciplina) lista_selected.get(contLista);

                for (int contVector = 0; contVector < splitVector.length; contVector++) {
                    if (splitVector[contVector].equals(listaDisciplina.getCodigo())) {
                        confirm = true;
                         verifica = true; 
                    } else {
                        confirm = false;
                      
                    }
                }
            }



            if (confirm == true) {
                   
                boolean aux = true;
                
                for (int auxCont = 0; auxCont < lista.getSize(); auxCont++) {
                    if (disciplina == (Disciplina) lista.getElementAt(auxCont)) {
                        aux = false; 
                    }
                }
                if (aux == true) {
                    boolean achou = false;
                    for (int i = 0; i < lista.size(); i++) {
                        Disciplina dis = (Disciplina) lista.get(i);
                        if (dis.getNome().equals(disciplina.getNome())) {
                            achou = true;
                            break;
                        }
                    }
                    if (!achou) {
                      
                        lista.addElement(disciplina);
                    }

                    
                }
            }
        } catch (Exception e) {
            verifica = false;
        }
        return verifica;
    }

    public static boolean quebraStringOU(Disciplina disciplina, DefaultListModel lista_selected, DefaultListModel lista) {
        boolean verifica = false;
        try {
            String splitVector2[] = disciplina.getPre_req().split(" ");
            boolean confirm = false;
            for (int auxCont2 = 0; auxCont2 < lista_selected.size(); auxCont2++) {
                Disciplina listaDisciplina2 = (Disciplina) lista_selected.get(auxCont2);
                for (int contLista2 = 0; contLista2 < splitVector2.length; contLista2++) {
                    if (splitVector2[contLista2].equals(listaDisciplina2.getCodigo())) {
                        confirm = true;
                     

                    }
                }
                if (confirm == true) {
                       
                    boolean confirm2 = true;
                    for (int auxCount = 0; auxCount < lista.getSize(); auxCount++) {
                        if (disciplina == lista.getElementAt(auxCount)) {
                          
                            confirm2 = false;
                        }
                    }
                    if (confirm2 == true) {
                        
                         
                        boolean achou = false;
                        for (int i = 0; i < lista.size(); i++) {
                            Disciplina dis = (Disciplina) lista.get(i);
                            if (dis.getNome().equals(disciplina.getNome())) {
                                achou = true;
                                 
                                break;
                               
                            }
                        }
                        if (!achou) {
                            verifica = true;
                            lista.addElement(disciplina);
                        
                        }
                       
                    }
                }
            }
        } catch (Exception e) {
            verifica = false;
        }
        return verifica;
    }

    public static boolean removeDisciplina(Disciplina disciplina, DefaultListModel lista_selected, DefaultListModel lista) {
        boolean confirm = false;
        try {
            for (int contLista = 0; contLista < lista.size(); contLista++) {
                if (disciplina == (Disciplina) lista.getElementAt(contLista)) {
                   
                    for (int contLista_S = 0; contLista_S < lista_selected.size(); contLista_S++) {
                           
                        if (disciplina == (Disciplina) lista_selected.getElementAt(contLista_S)) {
                                 confirm = true;
                            lista.removeElementAt(contLista);
                            
                        }
                    }
                }
            }
        } catch (Exception e) {
            confirm = false;
        }
        return confirm;
    }


 public static ArrayList<Disciplina> FiltraDisciplinas(ArrayList alldisciplines) throws Exception {
        ArrayList<Disciplina> filterdisciplines = new ArrayList<Disciplina>();
        Iterator i = alldisciplines.iterator();
        while (i.hasNext()) {
            Disciplina disciplina = (Disciplina) i.next();
            if (disciplina.getPre_req().equals("0")) {
                filterdisciplines.add(disciplina);
            }
        }
       return filterdisciplines;
     }
    







}
