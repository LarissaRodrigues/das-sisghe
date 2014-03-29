package Control;

import Business.GradeBusiness;
import DAO.DaoGrade;
import Exception.MateriaInvalidaException;
import Model.*;
import View.MontarGradeHoraria;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Beatriz
 */
public class ControleGrade {

    private static ControleGrade instance;
    public static ArrayList<Matricula> matriculas = new ArrayList<Matricula>();

    private ControleGrade() {
    }

    public static ControleGrade getInstance() {
        if (instance == null) {
            instance = new ControleGrade();
        }
        return instance;
    }

    public Grade obterGrade() throws Exception {
        Grade g = DaoGrade.DeserializarGrade();
        matriculas = g.getMatriculas();
        return g;
    }

    public boolean excluirGrade() throws Exception {
        return DaoGrade.ExcluirGrade();
    }

    public static boolean adicionar(Object disciplinaSelecionada, Object turmaSelecionada) throws MateriaInvalidaException, Exception {
        Disciplina d = (Disciplina) disciplinaSelecionada;
        Turma t = (Turma) turmaSelecionada;
        Matricula matricula = new Model.Matricula(d.getNome(), t);
        GradeBusiness.getInstance().verificaChoque(t);
        return matriculas.add(matricula);
    }

    public static void cadastrarGrade() throws IOException {
        Grade g = new Grade(matriculas);
        DaoGrade.SerializarGrade(g);
    }

    public void limparGrade() {
        matriculas.clear();
    }

    public boolean remover(String valor) {

        Iterator<Matricula> i = matriculas.iterator();
        int cont = 0;

        while (i.hasNext()) {

            Matricula temp = i.next();

            if (temp.getNomeDisciplina().equals(valor)) {
                matriculas.remove(cont);

                removerGrade(temp.getTurma().getHorario());

                return true;
            }
            cont++;

        }

        return false;
    }

    public boolean setarMontarGrade(Object valor, Object turma) {


        Model.Turma t = (Model.Turma) turma;
        ArrayList<Horario> horarios = new ArrayList<Horario>();

        horarios = t.getHorario();
        Iterator i = horarios.iterator();
        int linha = -1;
        int coluna = -1;

        while (i.hasNext()) {

            Horario temp = (Horario) i.next();

            linha = GradeBusiness.getInstance().confereHorario(temp);

            coluna = GradeBusiness.getInstance().confereColuna(temp);

            MontarGradeHoraria.preencheGrade(valor, coluna, linha);

        }
        return true;
    }

    public void setarGrade(Object valor, Object turma) {


        Model.Turma t = (Model.Turma) turma;
        ArrayList<Horario> horarios = new ArrayList<Horario>();

        horarios = t.getHorario();
        Iterator i = horarios.iterator();
        int linha;
        int coluna;

        while (i.hasNext()) {

            Horario temp = (Horario) i.next();

            linha = GradeBusiness.getInstance().confereHorario(temp);

            coluna = GradeBusiness.getInstance().confereColuna(temp);

            View.GradeHoraria.preencheGrade(valor, coluna, linha);

        }

    }

    public void removerGrade(ArrayList<Horario> horarios) {

        Iterator i = horarios.iterator();
        int linha;
        int coluna;

        while (i.hasNext()) {

            Horario temp = (Horario) i.next();

            linha = GradeBusiness.getInstance().confereHorario(temp);

            coluna = GradeBusiness.getInstance().confereColuna(temp);


            MontarGradeHoraria.removeGrade(linha, coluna);

        }
    }

    public void abrirMontarGrade() throws Exception {

        ArrayList<Matricula> matriculas = new ArrayList<Matricula>();
        Grade g = obterGrade();

        matriculas = g.getMatriculas();

        Iterator i = matriculas.iterator();
        while (i.hasNext()) {

            Matricula temp = (Matricula) i.next();
           setarMontarGrade(temp.getNomeDisciplina(), temp.getTurma());
        }

    }

    public void adicionarFrame(Object d, Object t) throws Exception {
        GradeBusiness.getInstance().adicionarFrame(d, t);
    }
}