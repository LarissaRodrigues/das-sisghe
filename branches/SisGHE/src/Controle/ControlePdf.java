package Controle;
import Disciplinas.Controle.ControlSubject;
import DAO.DeserializaAluno;
import DAO.GerarPdf;
import Modelo.Aluno;
import DisciplinasCursadas.Modelo.*;
import DisciplinasCursadas.DAO.*;
import Disciplinas.Modelo.Disciplina;
import java.util.ArrayList;

/**
 *
 * @author Felipe
 */
public class ControlePdf {
    
    private Aluno aluno = new Aluno();
    private ArrayList<DisciplinaCursada> disciplinaCursada = new ArrayList<DisciplinaCursada>();
    private static ArrayList<Disciplina> listaDisciplina;
    private static String arquivo;

    public ControlePdf() {

    }

    //neste metodo que serão obtidos o s dados do documento XML
    //aqui serão realizadas as verificações e validações
    // falta colocar DISCIPLINAS CURSADAS E GRADE HORARIA;
    public void chamaDeserializar(){
        DAO.DeserializaAluno.DeserializaAlunoR(aluno);
        disciplinaCursada = XmlDisciplinasCursadas.lerXml();
        ControlSubject controlSubect = new ControlSubject(); //necesario para chamar o metodo.
        listaDisciplina = controlSubect.callDeserialize();
       System.out.println(aluno);
       System.out.println(disciplinaCursada);
       System.out.println(listaDisciplina);
    }

    public void build(String arquivo, String tipo){
        GerarPdf gerar = new GerarPdf(aluno,disciplinaCursada ,listaDisciplina, arquivo , tipo);
        System.out.println(tipo);
        gerar.gerarPdf();
    
    
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public ArrayList<DisciplinaCursada> getDisciplinaCursada() {
        return disciplinaCursada;
    }

    public void setDisciplinaCursada(ArrayList<DisciplinaCursada> disciplinaCursada) {
        this.disciplinaCursada = disciplinaCursada;
    }

    public static ArrayList<Disciplina> getListaDisciplina() {
        return listaDisciplina;
    }

    public static void setListaDisciplina(ArrayList<Disciplina> listaDisciplina) {
        ControlePdf.listaDisciplina = listaDisciplina;
    }
    
    
}   
