/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TratamentoDeExcecoesTest {

    public TratamentoDeExcecoesTest() {
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
     * Test of validarNome method, of class TratamentoDeExcecoes.
     */
    @Test
    public void testValidarNome() throws Exception {
        System.out.println("validarNome");
        try {
            TratamentoDeExcecoes.validarNome("1234567890");
            fail("Deveria dar erro! Números não são permitidos no campo nome.");
        } catch (NomeInvalidoException e) {
            //Sucesso
        }
        try {
            TratamentoDeExcecoes.validarNome(";~´[]-=.,}{");
            fail("Deveria dar erro! Caracteres especiais não são permitidos no campo nome.");
        } catch (NomeInvalidoException e) {
            //Sucesso
        }
         try {
            TratamentoDeExcecoes.validarNome("Leticia");
         } catch (NomeInvalidoException e) {
             fail("Deveria dar erro! Caracteres especiais não são permitidos no campo nome.");
         }
         try{        
            TratamentoDeExcecoes.validarNome("Robson");
         } catch (NomeInvalidoException e) {
            fail("Deveria dar erro! Caracteres especiais não são permitidos no campo nome.");
         }

    }

    @Test
    public void testValidarCurso() throws Exception {
        System.out.println("validarCurso");
        try {            
            TratamentoDeExcecoes.validarCurso("1234567890");
            fail("Deveria dar erro! Números não são permitidos no campo curso.");
         } catch (CursoInvalidoException e) {
            //Sucesso
        }
        try {
            TratamentoDeExcecoes.validarCurso(";~´[]-=.,}{");
            fail("Deveria dar erro! Caracteres especiais não são permitidos no campo curso.");
        } catch (CursoInvalidoException e) {
            //Sucesso
        }
        try {
            TratamentoDeExcecoes.validarCurso("Engenharia de Software");
        } catch (CursoInvalidoException e) {
            fail("Deveria dar erro! Números não são permitidos no campo curso.");
        }
        try {
            TratamentoDeExcecoes.validarCurso("Fisica");
        } catch (CursoInvalidoException e) {
            fail("Deveria dar erro! Números não são permitidos no campo curso.");
        }

    }

    @Test
    public void testValidarMatricula() throws Exception {
        System.out.println("validarMatricula");
        try {
            TratamentoDeExcecoes.validarMatricula("qwertyuiopçlkjhgfdsazxcvbnm");
            fail("Deveria dar erro! Letras não são permitidas no campo matrícula");        
        } catch (MatriculaInvalidaException e) {
            //Sucesso
        }
        try {  
            TratamentoDeExcecoes.validarMatricula(",.;/~´[]=-}{");
            fail("Deveria dar erro! Caracteres especiais não são permitidos no campo matrícula.");            
        } catch (MatriculaInvalidaException e) {
            //Sucesso
        }
         try {
             TratamentoDeExcecoes.validarMatricula("110049934");
         } catch (MatriculaInvalidaException e) {
             fail("Deveria dar erro! Caracteres especiais não são permitidos no campo matrícula.");   
         }
         try {
              TratamentoDeExcecoes.validarMatricula("110015045");
         } catch (MatriculaInvalidaException e) {
              fail("Deveria dar erro! Caracteres especiais não são permitidos no campo matrícula.");
         }


    }
}
