package Model;

import java.io.Serializable;

/**
 *
 * @author Beatriz
 */

public class Matricula implements Serializable {
    
    String nomeDisciplina;
    Turma turma;

    public Matricula(String nomeDisciplina, Turma turma) {
        this.setNomeDisciplina(nomeDisciplina);
        this.setTurma(turma);
    }

    public Matricula() {
    }

    public String getNomeDisciplina() {
        return this.nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public Turma getTurma() {
        return this.turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    @Override
    public String toString() {
        return "\nNome da Disciplina: " + nomeDisciplina + "\nTurma: " + turma +"\n";
    }  
    
}
