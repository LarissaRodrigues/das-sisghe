package Model;

import Exception.CursoInvalidoException;
import Exception.MatriculaInvalidaException;
import Exception.NomeInvalidoException;
import java.io.Serializable;
import java.util.ArrayList;

public class Aluno implements Serializable{

    private String nome;
    private String matricula;
    private String curso;
    private String semestre;
    private ArrayList <Disciplina> disciplinasCursadas;
    
    public Aluno() {
    }

    public Aluno(String nome, String matricula, String curso, String semestre,ArrayList <Disciplina> disciplinas)throws NomeInvalidoException, CursoInvalidoException, MatriculaInvalidaException {
        this.setNome(nome);
        this.setMatricula (matricula);
        this.setCurso (curso);
        this.setSemestre(semestre);
        this.setDisciplinasCursadas(disciplinas);
    }

    public void setNome(String nome) {
          this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    
    public void setMatricula(String matricula){
              
	          this.matricula = matricula;
		
    }

    public String getMatricula() {
        return matricula;
    }

    public void setCurso(String curso){
       		this.curso = curso;
	
    }

                
    public String getCurso() {
        return curso;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getSemestre() {
        return semestre;
    }

    public ArrayList<Disciplina> getDisciplinasCursadas() {
        return disciplinasCursadas;
    }

    public void setDisciplinasCursadas(ArrayList<Disciplina> disciplinasCursadas) {
        this.disciplinasCursadas = disciplinasCursadas;
    }
    
    public void addDisciplinas(Disciplina in){
        disciplinasCursadas.add(in);
    }
    public Disciplina getDisciplina(int index){
        return disciplinasCursadas.get(index);
    }
    
    public void removerDisciplina(int index){
        disciplinasCursadas.remove(index);
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", matricula=" + matricula + ", curso=" + curso + ", semestre=" + semestre + ", disciplinasCursadas=" + disciplinasCursadas + '}';
    }
    
    
    
}
