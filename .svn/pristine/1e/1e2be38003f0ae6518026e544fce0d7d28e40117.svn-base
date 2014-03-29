package Business;

import Control.ControleGrade;
import Exception.MateriaInvalidaException;
import Model.Disciplina;
import Model.Grade;
import Model.Horario;
import Model.Matricula;
import Model.Turma;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class GradeBusiness {

    private static GradeBusiness instance;

    private GradeBusiness() {
    }

    public static GradeBusiness getInstance() {
        if (instance == null) {
            instance = new GradeBusiness();
        }
        return instance;
    }

 

    public int confereColuna(Horario temp) {

        if (temp.getDiaDaSemana()
                .equals("Segunda")) {
            return 1;
        }

        if (temp.getDiaDaSemana()
                .equals("Terca")) {
            return 2;
        }

        if (temp.getDiaDaSemana()
                .equals("Quarta")) {
            return 3;
        }

        if (temp.getDiaDaSemana()
                .equals("Quinta")) {
            return 4;
        }

        if (temp.getDiaDaSemana()
                .equals("Sexta")) {
            return 5;
        }

        if (temp.getDiaDaSemana()
                .equals("Sabado")) {
            return 6;
        }
        return -1;
    }

    public int confereHorario(Horario temp) {

        if (temp.getHora().equals("08:00 as 10:00")) {
            return 0;
        }
        if (temp.getHora().equals("10:00 as 12:00")) {
            return 1;
        }
        if (temp.getHora().equals("12:00 as 14:00")) {
            return 2;
        }
        if (temp.getHora().equals("14:00 as 16:00")) {
            return 3;
        }
        if (temp.getHora().equals("16:00 as 18:00")) {
            return 4;
        }
        if (temp.getHora().equals("18:00 as 20:00")) {
            return 5;
        }
        return -1;
    }

    public void abrirGrade() throws Exception {

        ArrayList<Matricula> matriculas = new ArrayList<Matricula>();
        Grade g = ControleGrade.getInstance().obterGrade();

        matriculas = g.getMatriculas();

        Iterator i = matriculas.iterator();
        while (i.hasNext()) {

            Matricula temp = (Matricula) i.next();

            ControleGrade.getInstance().setarGrade(temp.getNomeDisciplina(), temp.getTurma());
        }

    }

    public void abrirMontarGrade() throws Exception {

        ArrayList<Matricula> matriculas = new ArrayList<Matricula>();
        Grade g = ControleGrade.getInstance().obterGrade();

        matriculas = g.getMatriculas();

        Iterator i = matriculas.iterator();
        while (i.hasNext()) {

            Matricula temp = (Matricula) i.next();
            ControleGrade.getInstance().setarMontarGrade(temp.getNomeDisciplina(), temp.getTurma());
        }

    }

  
    public void verificaChoque(Turma turma) throws Exception, MateriaInvalidaException {

        ArrayList<Matricula> matriculas = ControleGrade.getInstance().matriculas;
        Iterator m = matriculas.iterator();
        while (m.hasNext()) {
            Matricula matricula = (Matricula) m.next();
            ArrayList<Horario> matriculaHorarios = matricula.getTurma().getHorario();
            Iterator mh = matriculaHorarios.iterator();
            while (mh.hasNext()) {
                Horario matriculaHorario = (Horario) mh.next();
                ArrayList<Horario> turmaHorarios = turma.getHorario();
                Iterator th = turmaHorarios.iterator();
                while (th.hasNext()) {
                    Horario turmaHorario = (Horario) th.next();
                    if (matriculaHorario.getDiaDaSemana().equalsIgnoreCase(turmaHorario.getDiaDaSemana()) && matriculaHorario.getHora().equalsIgnoreCase(turmaHorario.getHora())) {
                        throw new MateriaInvalidaException("Choque de Horário.");
                    }
                }
            }
        }
    }

    public void adicionarFrame(Object disciplinaSelecionada, Object turmaSelecionada) throws Exception {

        Iterator i = ControleGrade.getInstance().matriculas.iterator();
        Disciplina d = (Disciplina) disciplinaSelecionada;
        Turma t = (Turma) turmaSelecionada;

        while (i.hasNext()) {
            Matricula m = (Matricula) i.next();
            //Se essa turma já foi add:
            if (m.getTurma().equals(t) && m.getNomeDisciplina().equals(d.getNome())) {
                int op = JOptionPane.showConfirmDialog(null, "Essa Turma já foi adicionada, Deseja removê-la da grade?", "Atenção!", JOptionPane.OK_CANCEL_OPTION);
                if (op == 0) {
                    ControleGrade.getInstance().remover(d.getNome());
                }
                return;
            }
            //Se a disciplina já foi add:
            if (m.getNomeDisciplina().equals(d.getNome())) {
                int op = JOptionPane.showConfirmDialog(null, "Essa Disciplina já foi adicionada, Deseja substituí-la na grade?", "Atenção!", JOptionPane.OK_CANCEL_OPTION);
                if (op == 0) {
                    GradeBusiness.getInstance().verificaChoque(t);
                    ControleGrade.getInstance().adicionar(d, t);
                    ControleGrade.getInstance().remover(d.getNome());
                    ControleGrade.getInstance().setarMontarGrade(disciplinaSelecionada, turmaSelecionada);
                    return;
                } else {
                    return;
                }
            }
        }

        GradeBusiness.getInstance().verificaChoque(t);
        ControleGrade.getInstance().adicionar(disciplinaSelecionada, turmaSelecionada);
        ControleGrade.getInstance().setarMontarGrade(disciplinaSelecionada, turmaSelecionada);

    }

}
