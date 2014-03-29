/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Disciplinas.Controle;

import Disciplinas.Modelo.Dia;
import Disciplinas.Modelo.Hora;
import Disciplinas.Modelo.Turma;
import java.util.ArrayList;

/**
 *
 * @author Axs
 */
public class ControlClass {

    public ControlClass() {
    }

    public static Turma createClassLesson(String name, ArrayList<Dia> days, ArrayList<Hora> hours) {
        Turma classLesson = new Turma(name, days, hours);
        return classLesson;
    }

    public static void registerClassLesson(ArrayList<Turma> classes, Turma classLesson) {
        classes.add(classLesson);
    }

    public static ArrayList<Turma> createClasses() {
        ArrayList<Turma> classes = new ArrayList<Turma>();
        return classes;
    }
}
