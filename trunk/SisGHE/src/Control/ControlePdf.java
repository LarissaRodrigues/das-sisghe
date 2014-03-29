package Control;

import DAO.DAOPdf;
import Model.Aluno;
import Model.Disciplina;
import Model.Grade;
import View.SalvarPDF;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Felipe
 */
public class ControlePdf {
    
    private Aluno aluno = new Aluno();
    private static ArrayList<Disciplina> listaDisciplina;
    private static String arquivo;
    private Grade grade;

    public ControlePdf() {

    }


    public void chamaDeserializar() throws Exception{
       listaDisciplina = DAO.DaoDisciplinas.DeserializarDisciplinas();
       grade = DAO.DaoGrade.DeserializarGrade();
       Aluno XXX = null;
            try {
                XXX = DAO.DaoAluno.DeserializarAluno();
                
            } catch (Exception ex) {
                Logger.getLogger(SalvarPDF.class.getName()).log(Level.SEVERE, null, ex);
            }
            aluno = XXX;
    }

    public void build(String arquivo, String tipo){
        DAOPdf gerar = new DAOPdf(aluno ,listaDisciplina, arquivo , tipo, grade);
        gerar.gerarPdf();

    
    }
    
    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }



    public static ArrayList<Disciplina> getListaDisciplina() {
        return listaDisciplina;
    }

    public static void setListaDisciplina(ArrayList<Disciplina> listaDisciplina) {
        ControlePdf.listaDisciplina = listaDisciplina;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
    
    
}   
