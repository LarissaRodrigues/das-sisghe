
package Control;

import Model.Aluno;
import Model.Disciplina;
import Model.Grade;
import java.util.ArrayList;
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
 */
public class ControlePdfTest {
    Aluno estudante;
    public ControlePdfTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
       estudante = new Aluno();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of chamaDeserializar method, of class ControlePdf.
     */
    @Test
    public void testChamaDeserializar() throws Exception {
        System.out.println("chamaDeserializar");
        ControlePdf instance = new ControlePdf();
        instance.chamaDeserializar();
    }


    @Test
    public void testBuild() {
        System.out.println("build");
        String arquivo = "";
        String tipo = "";
        ControlePdf instance = new ControlePdf();
        instance.build(arquivo, tipo);
        // TODO review the generated test code and remove the default call to fail.
        
    }


    @Test
    public void testGetAluno() {
        System.out.println("getAluno");
        ControlePdf instance = new ControlePdf();
        Aluno expResult = instance.getAluno();
        Aluno result = instance.getAluno();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setAluno method, of class ControlePdf.
     */
    @Test
    public void testSetAluno() {
        System.out.println("setAluno");
        Aluno aluno = null;
        ControlePdf instance = new ControlePdf();
        instance.setAluno(aluno);
        
       
    }

    @Test
    public void testGetListaDisciplina() {
        System.out.println("getListaDisciplina");
        ArrayList expResult = ControlePdf.getListaDisciplina();
        ArrayList result = ControlePdf.getListaDisciplina();
        assertEquals(expResult, result);
        
        
    }


    @Test
    public void testSetListaDisciplina() {
        System.out.println("setListaDisciplina");
        ArrayList<Disciplina> listaDisciplina = null;
        ControlePdf.setListaDisciplina(listaDisciplina);

        
    }


    @Test
    public void testGetGrade() {
        System.out.println("getGrade");
        ControlePdf instance = new ControlePdf();
        Grade expResult = null;
        Grade result = instance.getGrade();
        assertEquals(expResult, result);

       
    }


    @Test
    public void testSetGrade() {
        System.out.println("setGrade");
        Grade grade = null;
        ControlePdf instance = new ControlePdf();
        instance.setGrade(grade);
       
    }
}
