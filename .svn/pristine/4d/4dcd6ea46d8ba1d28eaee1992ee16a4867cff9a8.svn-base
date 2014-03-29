/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Exception.CursoInvalidoException;
import Exception.MatriculaInvalidaException;
import Exception.NomeInvalidoException;
import Model.Aluno;
import Model.Disciplina;
import Model.Horario;
import Model.Turma;
import java.io.IOException;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Axs
 */
public class DaoAlunoTest {
    
    public DaoAlunoTest() {
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
     * Test of ResetAlunoXml method, of class DaoAluno.
     */
    @Test
    public void testResetAlunoXml() {
        System.out.println("ResetAlunoXml");
   //     assertTrue(DaoAluno.deleteAlunoXml());
    }

    /**
     * Test of SerializarAluno method, of class DaoAluno.
     */
    @Test
    public void testSerializarAluno() throws NomeInvalidoException, CursoInvalidoException, CursoInvalidoException, MatriculaInvalidaException {
        System.out.println("SerializarAluno");
        try {
            DaoAluno.SerializarAluno(null);
            fail("Erro, serializou arquivo nulo!");
        } catch (Exception ex) {
            
        }
    }

    /**
     * Test of DeserializarAluno method, of class DaoAluno.
     */
    @Test
    public void testDeserializarAluno() throws Exception {
        System.out.println("DeserializarAluno");
        assertNotNull(DaoAluno.DeserializarAluno());
    }
}
