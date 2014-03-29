/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Disciplina;
import Model.Horario;
import Model.Turma;
import java.io.IOException;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Axs
 */
public class DaoDisciplinasTest {
    
    ArrayList<Disciplina> listaDisciplinas = new ArrayList<Disciplina>();
    
    @BeforeClass
    public static void setUpClass() throws Exception {
        
    }
    
    @AfterClass
    public static void tearDownClass () throws Exception {
        
    }
    
    @Before
    public void setUp() {
        
    }
    
    @After
    public void tearDown() throws Exception {
        
    }
    
    @Test
    public void testSerializarDisciplinas() throws IOException {
        System.out.println("SerializarDisciplinas");
        String disciplina1Nome = "Acustica e Vibracoes Veiculares";
        String disciplina2Nome = "Analise de Sinais e Design de Circuitos";
        String disciplina3Nome = "Calculo 1";
        String disciplina1Codigo = "208582";
        String disciplina2Codigo = "208248";
        String disciplina3Codigo = "113034";
        String disciplina1Pre_req = "113301 e 201642";
        String disciplina2Pre_req = "203785";
        String disciplina3Pre_req = "0";
        ArrayList<Turma> disciplina1Turmas = new ArrayList<Turma>();
        ArrayList<Turma> disciplina2Turmas = new ArrayList<Turma>();
        ArrayList<Turma> disciplina3Turmas = new ArrayList<Turma>();
        String disciplina1Turma1Nome = "A";
        String disciplina2Turma1Nome = "A";
        String disciplina3Turma1Nome = "AA";
        String disciplina3Turma2Nome = "BB";
        String disciplina3Turma3Nome = "CC";
        ArrayList<Horario> disciplina1Turma1Horarios = new ArrayList<Horario>();
        ArrayList<Horario> disciplina2Turma1Horarios = new ArrayList<Horario>();
        ArrayList<Horario> disciplina3Turma1Horarios = new ArrayList<Horario>();
        ArrayList<Horario> disciplina3Turma2Horarios = new ArrayList<Horario>();
        ArrayList<Horario> disciplina3Turma3Horarios = new ArrayList<Horario>();
        String disciplina1Turma1Horario1DiaDaSemana = "Terca";
        String disciplina1Turma1Horario2DiaDaSemana = "Quinta";
        String disciplina2Turma1Horario1DiaDaSemana = "Terca";
        String disciplina2Turma1Horario2DiaDaSemana = "Quinta";
        String disciplina3Turma1Horario1DiaDaSemana = "Segunda";
        String disciplina3Turma1Horario2DiaDaSemana = "Quarta";
        String disciplina3Turma1Horario3DiaDaSemana = "Sexta";
        String disciplina3Turma2Horario1DiaDaSemana = "Segunda";
        String disciplina3Turma2Horario2DiaDaSemana = "Quarta";
        String disciplina3Turma2Horario3DiaDaSemana = "Sexta";
        String disciplina3Turma3Horario1DiaDaSemana = "Segunda";
        String disciplina3Turma3Horario2DiaDaSemana = "Quarta";
        String disciplina3Turma3Horario3DiaDaSemana = "Sexta";
        String disciplina1Turma1Horario1Hora = "14:00 as 16:00";
        String disciplina1Turma1Horario2Hora = "14:00 as 16:00";
        String disciplina2Turma1Horario1Hora = "16:00 as 18:00";
        String disciplina2Turma1Horario2Hora = "16:00 as 18:00";
        String disciplina3Turma1Horario1Hora = "10:00 as 12:00";
        String disciplina3Turma1Horario2Hora = "10:00 as 12:00";
        String disciplina3Turma1Horario3Hora = "10:00 as 12:00";
        String disciplina3Turma2Horario1Hora = "10:00 as 12:00";
        String disciplina3Turma2Horario2Hora = "10:00 as 12:00";
        String disciplina3Turma2Horario3Hora = "10:00 as 12:00";
        String disciplina3Turma3Horario1Hora = "08:00 as 10:00";
        String disciplina3Turma3Horario2Hora = "08:00 as 10:00";
        String disciplina3Turma3Horario3Hora = "08:00 as 10:00";
        Horario disciplina1Turma1Horario1 = new Horario(
                disciplina1Turma1Horario1DiaDaSemana,
                disciplina1Turma1Horario1Hora);
        Horario disciplina1Turma1Horario2 = new Horario(
                disciplina1Turma1Horario2DiaDaSemana,
                disciplina1Turma1Horario2Hora);
        Horario disciplina2Turma1Horario1 = new Horario(
                disciplina2Turma1Horario1DiaDaSemana,
                disciplina2Turma1Horario1Hora);
        Horario disciplina2Turma1Horario2 = new Horario(
                disciplina2Turma1Horario2DiaDaSemana,
                disciplina2Turma1Horario2Hora);
        Horario disciplina3Turma1Horario1 = new Horario(
                disciplina3Turma1Horario1DiaDaSemana,
                disciplina3Turma1Horario1Hora);
        Horario disciplina3Turma1Horario2 = new Horario(
                disciplina3Turma1Horario2DiaDaSemana,
                disciplina3Turma1Horario2Hora);
        Horario disciplina3Turma1Horario3 = new Horario(
                disciplina3Turma1Horario3DiaDaSemana,
                disciplina3Turma1Horario3Hora);
        Horario disciplina3Turma2Horario1 = new Horario(
                disciplina3Turma2Horario1DiaDaSemana,
                disciplina3Turma2Horario1Hora);
        Horario disciplina3Turma2Horario2 = new Horario(
                disciplina3Turma2Horario2DiaDaSemana,
                disciplina3Turma2Horario2Hora);
        Horario disciplina3Turma2Horario3 = new Horario(
                disciplina3Turma2Horario3DiaDaSemana,
                disciplina3Turma2Horario3Hora);
        Horario disciplina3Turma3Horario1 = new Horario(
                disciplina3Turma3Horario1DiaDaSemana,
                disciplina3Turma3Horario1Hora);
        Horario disciplina3Turma3Horario2 = new Horario(
                disciplina3Turma3Horario2DiaDaSemana,
                disciplina3Turma3Horario2Hora);
        Horario disciplina3Turma3Horario3 = new Horario(
                disciplina3Turma3Horario3DiaDaSemana,
                disciplina3Turma3Horario3Hora);
        System.out.println(disciplina1Turma1Horario1.getDiaDaSemana());
        System.out.println(disciplina1Turma1Horario1.getHora());
        disciplina1Turma1Horarios.add(disciplina1Turma1Horario1);
        disciplina1Turma1Horarios.add(disciplina1Turma1Horario2);
        disciplina2Turma1Horarios.add(disciplina2Turma1Horario1);
        disciplina2Turma1Horarios.add(disciplina2Turma1Horario2);
        disciplina3Turma1Horarios.add(disciplina3Turma1Horario1);
        disciplina3Turma1Horarios.add(disciplina3Turma1Horario2);
        disciplina3Turma1Horarios.add(disciplina3Turma1Horario3);
        disciplina3Turma2Horarios.add(disciplina3Turma2Horario1);
        disciplina3Turma2Horarios.add(disciplina3Turma2Horario2);
        disciplina3Turma2Horarios.add(disciplina3Turma2Horario3);
        disciplina3Turma3Horarios.add(disciplina3Turma3Horario1);
        disciplina3Turma3Horarios.add(disciplina3Turma3Horario2);
        disciplina3Turma3Horarios.add(disciplina3Turma3Horario3);
        Turma disciplina1Turma1 = new Turma(
              disciplina1Turma1Nome,
              disciplina1Turma1Horarios);
        Turma disciplina2Turma1 = new Turma(
              disciplina2Turma1Nome,
              disciplina2Turma1Horarios);
        Turma disciplina3Turma1 = new Turma(
              disciplina3Turma1Nome,
              disciplina3Turma1Horarios);
        Turma disciplina3Turma2 = new Turma(
              disciplina3Turma2Nome,
              disciplina3Turma2Horarios);
        Turma disciplina3Turma3 = new Turma(
              disciplina3Turma3Nome,
              disciplina3Turma3Horarios);
        disciplina1Turmas.add(disciplina1Turma1);
        disciplina2Turmas.add(disciplina2Turma1);
        disciplina3Turmas.add(disciplina3Turma1);
        disciplina3Turmas.add(disciplina3Turma2);
        disciplina3Turmas.add(disciplina3Turma3);
        Disciplina disciplina1 = new Disciplina(
                   disciplina1Nome,
                   disciplina1Codigo,
                   disciplina1Pre_req,
                   disciplina1Turmas);
        Disciplina disciplina2 = new Disciplina(
                   disciplina2Nome,
                   disciplina2Codigo,
                   disciplina2Pre_req,
                   disciplina2Turmas);
        Disciplina disciplina3 = new Disciplina(
                   disciplina3Nome,
                   disciplina3Codigo,
                   disciplina3Pre_req,
                   disciplina3Turmas);
        listaDisciplinas.add(disciplina1);
        listaDisciplinas.add(disciplina2);
        listaDisciplinas.add(disciplina3);

        try {
            DaoDisciplinas.SerializarDisciplinas(listaDisciplinas);
        } catch (IOException ex) {
            fail("Erro, não conseguiu serializar disciplinas");
        }
    }
    
    @Test
    public void testDeserializarDisciplinas() throws IOException, Exception{
        System.out.println("DeserializarDisciplinas");
        try {
            assertNotNull(DAO.DaoDisciplinas.DeserializarDisciplinas());
        } catch (Exception e) {
            System.out.println("Entrou no catch.");
        }
    }
}
