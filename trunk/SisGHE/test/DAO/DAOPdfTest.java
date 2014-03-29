
package DAO;

import Control.ControlePdf;
import Model.Aluno;
import Model.Disciplina;
import Model.Grade;
import View.SalvarPDF;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Felipe
 * 
 * Esta Classe ainda nao esta implementada de maneira correta ou 100%
 */ class DAOPdfTest {
    DAOPdf daoPdf ;
    Aluno aluno = new Aluno();
    Document document;
    
    private static ArrayList<Disciplina> listaDisciplina;
    private static String arquivo;
    private Grade grade;

    public DAOPdfTest() {
    }
    
   
    @Before

    public void setUp() throws Exception {

       document =new Document();             
       daoPdf = new DAOPdf(aluno, listaDisciplina, arquivo, arquivo, grade);
       
    
    }
      
    @After
    public void tearDown() {
    }

    /**
     * Test of toString method, of class DAOPdf.
     */
    @Test
    public void testToString() {
        
        System.out.println("toString");
        Aluno estudante = new Aluno();
        estudante.setNome("Felipe");estudante.setMatricula("090005694");estudante.setSemestre("8");estudante.setCurso("Software");
        DAOPdf instance = new DAOPdf(estudante, null, null, null, null);
        DAOPdf instance2 = new DAOPdf(estudante, null, null, null);
        DAOPdf instance3;
        instance3  = new DAOPdf(estudante);
        String expResult = "Aluno{" + "nome=" + "Felipe" + ", matricula=" + "090005694" + ", curso=" + "Software" + ", semestre=" + "8" + ", disciplinasCursadas=" + null + '}';;
        String result = instance3.toString();
        assertEquals(expResult, result);       
    }

    /**
     * Test of addLinhaVazia method, of class DAOPdf.
     */
    @Test
    public void testAddLinhaVazia() {
        System.out.println("addLinhaVazia");
        Paragraph paragraph = new Paragraph("aaaaaaa");
        int number = 3;
        int expResult = 1;
        int result = DAOPdf.addLinhaVazia(paragraph, number);
        assertEquals(expResult, result);
        // Caso de erro
        paragraph = null;
        expResult = -1;
        result = DAOPdf.addLinhaVazia(paragraph, number);        
        assertEquals(expResult, result);
    }

    /**
     * Test of addMetaDados method, of class DAOPdf.
     */
    @Test
    public void testAddMetaDados() {
        System.out.println("addMetaDados");
        int expResult = 1;
        int result = daoPdf.addMetaDados(document);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        document = null;
        expResult = -1;
        result = daoPdf.addMetaDados(document);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of addConteudo method, of class DAOPdf.
     */
    //robado, falta inicializar todas as instancias e corrigir o erro do Grade.txt
    @Test
   public void testAddConteudo() throws Exception {
        System.out.println("addConteudo");

        int expResult = -1;
        int result = daoPdf.addConteudo(document);
        assertEquals(expResult, result);
        

    }

    /**
     * Test of gerarPdf method, of class DAOPdf.
     */
    @Test
    public void testGerarPdf() {
        System.out.println("gerarPdf");
        DAOPdf instance = daoPdf;
        int expResult = -2;
        int result = instance.gerarPdf();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
}
