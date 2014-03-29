package Control;

import DAO.*;
import Exception.TratamentoDeExcecoes;
import Exception.CursoInvalidoException;
import Exception.MatriculaInvalidaException;
import Exception.NomeInvalidoException;
import Model.*;
import java.io.IOException;
import java.util.ArrayList;
import org.jdom2.JDOMException;

public class ControleManterAluno {

    private static ControleManterAluno instance;
    public static Aluno aluno;

    private ControleManterAluno() {
        
    }

    public static ControleManterAluno getInstance() {
        if (instance == null) {
            instance = new ControleManterAluno();
        }
        return instance;
    }
    
    public boolean cadastrarAluno(String nome, String matricula, String curso, String semestre, ArrayList <Disciplina> lista) throws NomeInvalidoException, CursoInvalidoException,MatriculaInvalidaException, Exception{
        
        TratamentoDeExcecoes.validarNome(nome);       
        TratamentoDeExcecoes.validarCurso(curso);
        TratamentoDeExcecoes.validarMatricula(matricula);
         
        aluno = new Aluno(nome,matricula,curso,semestre,lista);      
        try {
            DaoAluno.SerializarAluno(aluno);
        } catch (Exception ex) {
            return false;
        }
        return true;
    }
    public Aluno obterAluno() {
        try {
            return DaoAluno.DeserializarAluno();
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public ArrayList<Disciplina> obterDisciplinasCursadas() {
        return DAO.DaoAluno.deserializarAlunoDisciplinas();
    }
    
    public ArrayList<Disciplina> obterDisciplinasOferta() throws JDOMException, IOException{
        return DAO.DaoOferta.DeserializaOferta();
        }

}