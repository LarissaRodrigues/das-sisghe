/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Model.Matricula;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author Axs
 */
public class SortArray {

    public SortArray() {
    }

    public static void bubbleSortMatricula(ArrayList<Matricula> matriculas) {
        boolean houveTroca = true;
        while (houveTroca) {
            houveTroca = false;
            for (int i = 0; i < (matriculas.size()) - 1; i++) {
                for (int j = 0; j < (matriculas.get(i).getNomeDisciplina().length()); j++) {
                    if (Character.getType(matriculas.get(i).getNomeDisciplina().charAt(j)) > Character.getType(matriculas.get(i + 1).getNomeDisciplina().charAt(j))) {
                        Matricula variavelAuxiliar = matriculas.get(i+1);
                        matriculas.add(i+1,matriculas.get(i));
                        matriculas.add(i,variavelAuxiliar);
                        houveTroca = true;
                    }
                }
            }
        }
    }
}
