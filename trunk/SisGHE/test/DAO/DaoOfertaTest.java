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
import javax.swing.DefaultListModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author david
 */
public class DaoOfertaTest {
    
    public DaoOfertaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of SerializaOferta method, of class DaoOferta.
     */
    @Test
    public void testSerializaOferta() throws Exception {
        System.out.println("SerializaOferta");
       
        DefaultListModel  materias = new DefaultListModel<Disciplina>();
        String disciplina1Nome = "Acustica e Vibracoes Veiculares";
        String disciplina2Nome = "Analise de Sinais e Design de Circuitos";
        String disciplina3Nome = "Calculo 1";
        String disciplina4Nome = "Validação 1";
         String disciplina5Nome = "Validação 2";
         String disciplina6Nome = "Validação 3";
        String disciplina1Codigo = "111111";
        String disciplina2Codigo = "222222";
        String disciplina3Codigo = "333333";
        String disciplina4Codigo = "444444";
        String disciplina5Codigo = "555555";
        String disciplina6Codigo = "666666";
        
        String disciplina1Pre_req = "111111";
        String disciplina2Pre_req = "222222";
        String disciplina3Pre_req = "333333";
        String disciplina4Pre_req = "222222 ou 333333";
        String disciplina5Pre_req = "222222";
        String disciplina6Pre_req = "333333";
        ArrayList<Turma> disciplina1Turmas = new ArrayList<Turma>();
        ArrayList<Turma> disciplina2Turmas = new ArrayList<Turma>();
        ArrayList<Turma> disciplina3Turmas = new ArrayList<Turma>();
        ArrayList<Turma> disciplina4Turmas = new ArrayList<Turma>();
        ArrayList<Turma> disciplina5Turmas = new ArrayList<Turma>();
        ArrayList<Turma> disciplina6Turmas = new ArrayList<Turma>();
        String disciplina1Turma1Nome = "A";
        String disciplina2Turma1Nome = "A";
        String disciplina3Turma1Nome = "AA";
        String disciplina3Turma2Nome = "BB";
        String disciplina3Turma3Nome = "CC";
        String disciplina4Turma1Nome = "D";
        String disciplina5Turma1Nome = "E";
        String disciplina6Turma1Nome = "F";
        
        ArrayList<Horario> disciplina1Turma1Horarios = new ArrayList<Horario>();
        ArrayList<Horario> disciplina2Turma1Horarios = new ArrayList<Horario>();
        ArrayList<Horario> disciplina3Turma1Horarios = new ArrayList<Horario>();
        ArrayList<Horario> disciplina3Turma2Horarios = new ArrayList<Horario>();
        ArrayList<Horario> disciplina3Turma3Horarios = new ArrayList<Horario>();
        ArrayList<Horario> disciplina4Turma1Horarios = new ArrayList<Horario>();
        ArrayList<Horario> disciplina5Turma1Horarios = new ArrayList<Horario>();
        ArrayList<Horario> disciplina6Turma1Horarios = new ArrayList<Horario>();
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
        String disciplina4Turma1Horario1DiaDaSemana = "Segunda";
        String disciplina5Turma1Horario1DiaDaSemana = "Quarta";      
        String disciplina6Turma1Horario1DiaDaSemana = "Sexta";
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
        String disciplina4Turma1Horario1Hora = "08:00 as 12:00";
        String disciplina5Turma1Horario1Hora = "08:00 as 12:00";
         String disciplina6Turma1Horario1Hora = "08:00 as 12:00";
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
        Horario disciplina4Turma1Horario1 = new Horario(
                disciplina4Turma1Horario1DiaDaSemana,
                disciplina4Turma1Horario1Hora);
         Horario disciplina5Turma1Horario1 = new Horario(
                disciplina5Turma1Horario1DiaDaSemana,
                disciplina5Turma1Horario1Hora);
         Horario disciplina6Turma1Horario1 = new Horario(
                disciplina6Turma1Horario1DiaDaSemana,
                disciplina6Turma1Horario1Hora);
        //System.out.println(disciplina1Turma1Horario1.getDiaDaSemana());
        //System.out.println(disciplina1Turma1Horario1.getHora());
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
        disciplina4Turma1Horarios.add(disciplina4Turma1Horario1);
        disciplina5Turma1Horarios.add(disciplina5Turma1Horario1);
        disciplina6Turma1Horarios.add(disciplina6Turma1Horario1);
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
          Turma disciplina4Turma1 = new Turma(
              disciplina4Turma1Nome,
              disciplina4Turma1Horarios);
            Turma disciplina5Turma1 = new Turma(
              disciplina5Turma1Nome,
              disciplina5Turma1Horarios);
              Turma disciplina6Turma1 = new Turma(
              disciplina6Turma1Nome,
              disciplina6Turma1Horarios);
        disciplina1Turmas.add(disciplina1Turma1);
        disciplina2Turmas.add(disciplina2Turma1);
        disciplina3Turmas.add(disciplina3Turma1);
        disciplina3Turmas.add(disciplina3Turma2);
        disciplina3Turmas.add(disciplina3Turma3);
        disciplina4Turmas.add(disciplina4Turma1);
        disciplina5Turmas.add(disciplina5Turma1);
        disciplina6Turmas.add(disciplina6Turma1);
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
                    
        Disciplina disciplina4 = new Disciplina(
                   disciplina4Nome,
                   disciplina4Codigo,
                   disciplina4Pre_req,
                   disciplina4Turmas);
                      
        Disciplina disciplina5 = new Disciplina(
                   disciplina5Nome,
                   disciplina5Codigo,
                   disciplina5Pre_req,
                   disciplina5Turmas);
                      
        Disciplina disciplina6= new Disciplina(
                   disciplina6Nome,
                   disciplina6Codigo,
                   disciplina6Pre_req,
                   disciplina6Turmas);
       
        
        DefaultListModel list = new DefaultListModel<Object>();
        DefaultListModel list_selected = new DefaultListModel<Object>();
        
       materias.addElement(disciplina1);
       materias.addElement(disciplina2);
       materias.addElement(disciplina3);
       materias.addElement(disciplina4);
       materias.addElement(disciplina5);
       materias.addElement(disciplina6);
        
       try{
           assertTrue(DaoOferta.SerializaOferta(materias));
           
       }catch(Exception ex){
           fail("SerializaOferta() falhou");
       }
    }

    /**
     * Test of DeserializaOferta method, of class DaoOferta.
     */
    @Test
    public void testDeserializaOferta() throws Exception {
            System.out.println("SerializaOferta");
       
       
       try{
           assertNotNull(DaoOferta.DeserializaOferta());
       }catch(IOException ex){
           fail("DeserializaOferta() Quebrou");
       }
    }
}
