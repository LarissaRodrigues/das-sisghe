package Control;

import Business.LiberaDisciplina;
import java.util.ArrayList;
import DAO.*;
import Model.Disciplina;
import javax.swing.DefaultListModel;

public class ControleDisciplinas {
    private static ControleDisciplinas instance;
    
        private ControleDisciplinas() {
    }

    public static ControleDisciplinas getInstance() {
        if (instance == null) {
            instance = new ControleDisciplinas();
        }
        return instance;
    }
        public ArrayList obterDisciplinas() throws Exception{
         return DaoDisciplinas.DeserializarDisciplinas();
    }
    
        public  void chamaLiberarDisciplina(ArrayList<Disciplina> materias,Model.Disciplina d,DefaultListModel lista_selected,DefaultListModel lista) throws Exception{
           LiberaDisciplina.validaDisciplina( materias, d, lista_selected, lista);
        }

}