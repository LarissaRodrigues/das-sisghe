package Business;

import DAO.*;
import Model.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class SerializarDisciplinas {
    public static void start() {
        
        String opD;
        String opT;
        try {
            ArrayList  <Model.Disciplina> disciplinas;
          
                BufferedReader inputStream = new BufferedReader(new FileReader("entrada.txt"));
                String nomeDisciplina;
                String codigoDisciplina;
                String pre_reqDisciplina;
                int creditos;
                String nomeTurma;
                int nr_aulas;
                disciplinas = new ArrayList();
                do {
                    nomeDisciplina = inputStream.readLine();
                    codigoDisciplina = inputStream.readLine();
                    pre_reqDisciplina = inputStream.readLine();
                    creditos = Integer.parseInt(inputStream.readLine()) / 2;
                    ArrayList<Model.Turma> turmas = new ArrayList();
                    do {
                        Model.Turma t;
                        nomeTurma = inputStream.readLine();
                        ArrayList<Horario> horario = new ArrayList();
                        nr_aulas = 0;
                        do {
                            Horario h = new Horario();
                            String idDia = inputStream.readLine();
                            int intidDia = Integer.parseInt(idDia);
                            h.setDiaDaSemana(getDia(intidDia));

                            String idHora = inputStream.readLine();
                            int intidHora = Integer.parseInt(idHora);
                            h.setHora(getHora(intidHora));

                            nr_aulas++;
                            horario.add(h);
                            
                        } while (nr_aulas < creditos);
                        t = new Model.Turma(nomeTurma, horario);
                        turmas.add(t);
                     
                        opT = inputStream.readLine();

                    } while (!opT.equalsIgnoreCase("n"));
                    
                    Model.Disciplina d = new Model.Disciplina();
                    d.setNome(nomeDisciplina);
                    d.setCodigo(codigoDisciplina);
                    d.setPre_req(pre_reqDisciplina);
                    d.setTurmas(turmas);
                    disciplinas.add(d);

                    opD = inputStream.readLine();
                } while (!opD.equalsIgnoreCase("n"));
            
            
            DaoDisciplinas.SerializarDisciplinas(disciplinas);


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static String getDia(int i) {
        switch (i) {
            case 0:
                return "Segunda";
            case 1:
                return "Terca";
            case 2:
                return "Quarta";
            case 3:
                return "Quinta";
            case 4:
                return "Sexta";
            case 5:
                return "Sabado";
            default:
                return "Unknown";
        }
    }

    public static String getHora(int i) {
        switch (i) {
            case 0:
                return "08:00 as 10:00";
            case 1:
                return "10:00 as 12:00";
            case 2:
                return "12:00 as 14:00";
            case 3:
                return "14:00 as 16:00";
            case 4:
                return "16:00 as 18:00";
            case 5:
                return "18:00 as 20:00";
            case 6:
                return "20:00 as 22:00";
            case 7:
                return "22:00 as 00:00";
            default:
                return "Unknown";
        }

    }
}