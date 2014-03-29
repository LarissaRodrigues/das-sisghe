package Model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Beatriz
 */

public class Grade implements Serializable{

    ArrayList<Matricula> matriculas = new ArrayList<Matricula>();
    
     public Grade(ArrayList<Matricula> matriculas) {
        this.setMatriculas(matriculas);
    }

    public Grade() {
    }

    public ArrayList<Matricula> getMatriculas() {
        return this.matriculas;
    }

    public void setMatriculas(ArrayList<Matricula> matriculas) {
        this.matriculas = matriculas;
    }
    
    @Override
    public String toString() {
        return "Matrículas da grade: " + matriculas ;
    }
    
}
