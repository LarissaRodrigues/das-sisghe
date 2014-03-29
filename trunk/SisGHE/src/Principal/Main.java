package Principal;

import Business.SerializarDisciplinas;
import Control.*;
import View.*;

public class Main {
    
    public static void main(String[] args) {
        iniciarControladores();
        SerializarDisciplinas.start();
        
        Principal principal;
        principal = new Principal();
        principal.setLocationRelativeTo(null);
        principal.setVisible(true);
        
    }

    public static void iniciarControladores() {
        ControleManterAluno.getInstance();
        ControleDisciplinas.getInstance();
    }
}
