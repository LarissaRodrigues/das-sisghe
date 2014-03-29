/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Disciplinas.Controle;

import Disciplinas.DAO.DeserializeSubject;
import Disciplinas.DAO.SerializeSubject;
import Disciplinas.Modelo.Disciplina;
import Disciplinas.Modelo.Turma;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Axs
 */
public class ControlSubject {

    public ControlSubject() {
    }

    public static Disciplina createSubject(String name, String id, String pre_id, ArrayList<Turma> classes) {
        Disciplina subject = new Disciplina(name, id, pre_id, classes);
        return subject;
    }

    public static void registerSubject(ArrayList<Disciplina> disciplines, Disciplina subject) {
        disciplines.add(subject);
    }

    public static ArrayList<Disciplina> createDisciplines() {
        ArrayList<Disciplina> disciplines = new ArrayList<Disciplina>();
        return disciplines;
    }

    public void callSerialize(ArrayList<Disciplina> disciplines) {
        SerializeSubject.serializingDisciplines(disciplines);
    }

    public ArrayList<Disciplina> callDeserialize() {
        ArrayList<Disciplina> disciplines = DeserializeSubject.deserializingDisciplines();
        return disciplines;
    }
}