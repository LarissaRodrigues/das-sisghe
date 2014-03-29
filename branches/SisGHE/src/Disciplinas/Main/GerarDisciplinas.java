package Disciplinas.Main;


import Disciplinas.Controle.ControlClass;
import Disciplinas.Controle.ControlDay;
import Disciplinas.Controle.ControlHour;
import Disciplinas.Controle.ControlSubject;
import Disciplinas.Modelo.Dia;
import Disciplinas.Modelo.Disciplina;
import Disciplinas.Modelo.Hora;
import Disciplinas.Modelo.Turma;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Axs
 */
public class GerarDisciplinas {
    
    public static void main(String args[]) {

        try {
        
        BufferedReader inputStream = new BufferedReader(new FileReader("src/Disciplinas/DAO/entradaTeste.txt"));
        
        ControlSubject controlSubject = new ControlSubject();
        ControlClass controlClass = new ControlClass();
        ControlDay controlDay = new ControlDay();
        ControlHour controlHour = new ControlHour();

        String nomeDisciplina = "";
        String codigoDisciplina = "";
        String pre_reqDisciplina = "";
        
        int creditos = 0;
        
        String nomeTurma = "";
        
        int nr_dia = 0;
        String idDia = "";
        String nomeDia = "";

        String idHora = "";
        String nomeHora = "";
        
        String opD = "S";
        String opT = "S";
        
        ArrayList<Dia> model_days = controlDay.callDeserialize();
        ArrayList<Hora> model_hours = controlHour.callDeserialize();
        ArrayList <Disciplina> disciplinas = controlSubject.createDisciplines();
        
        do {
            nomeDisciplina = inputStream.readLine();
            codigoDisciplina = inputStream.readLine();
            pre_reqDisciplina = inputStream.readLine();
            creditos = Integer.parseInt(inputStream.readLine())/2;

            ArrayList <Turma> turmas = controlClass.createClasses();
            do {
                nomeTurma = inputStream.readLine();
                
                ArrayList <Dia> dias = controlDay.createDays();
                ArrayList <Hora> horas = controlHour.createHours();

                nr_dia = 0;
                do {
                    idDia = inputStream.readLine();
                    int intidDia = Integer.parseInt(idDia);
                    nomeDia = model_days.get(intidDia).getNome();
                    
                    idHora = inputStream.readLine();
                    int intidHora = Integer.parseInt(idHora);
                    nomeHora = model_hours.get(intidHora).getNome();
                    
                    Dia dia = controlDay.createDay(String.valueOf(nr_dia),nomeDia);
                    Hora hora = controlHour.createHour(String.valueOf(nr_dia),nomeHora);

                    controlDay.registerDay(dias, dia);
                    controlHour.registerHour(horas, hora);

                    nr_dia ++;
                    
                }while(nr_dia < creditos);

                Turma turma = controlClass.createClassLesson(nomeTurma, dias, horas);
                controlClass.registerClassLesson(turmas, turma);

                opT = inputStream.readLine();
                
            }while(!opT.equalsIgnoreCase("n"));
            Disciplina disciplina = controlSubject.createSubject(nomeDisciplina, codigoDisciplina, pre_reqDisciplina, turmas);
            controlSubject.registerSubject(disciplinas, disciplina);
            
            opD = inputStream.readLine();
            
        }while(!opD.equalsIgnoreCase("n"));
        inputStream.close();
        
        Iterator i = disciplinas.iterator();
        
        while(i.hasNext()) {
            Disciplina subject = (Disciplina) i.next();
            System.out.println(subject.toString());
        }
        
        controlSubject.callSerialize(disciplinas);
        } catch (FileNotFoundException e) {
            System.out.println("Não achei ou não consegui abrir o arquivo!");
        } catch (IOException e) {
            System.out.println("Erro genérico ao ler o arquivo!");
        }
        System.exit(0);
    }
    
}