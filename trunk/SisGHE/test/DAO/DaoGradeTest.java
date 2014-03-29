package DAO;

import Model.Grade;
import java.io.IOException;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Beatriz
 */
public class DaoGradeTest {

    public DaoGradeTest() {
    }

    @Before
    public void setUp() throws Exception {
        DaoGrade.ExcluirGrade();
    }

    /**
     * Test of SerializarGrade method, of class DaoGrade.
     */
    @Test
    public void testSerializarGrade() throws IOException {
        System.out.println("SerializarGrade");
        try {
            DaoGrade.SerializarGrade(null);
            fail("Erro, serializou arquivo nulo!");
        } catch (IOException success) {
            //Sucesso
        }
    }

    /**
     * Test of DeserializarGrade method, of class DaoGrade.
     */
    @Test
    public void testDeserializarGrade() throws IOException, Exception {
        System.out.println("DeserializarGrade");
        try {
            DaoGrade.DeserializarGrade();
        } catch (Exception e) {
            System.out.println("Entrou no catch.");    
        }

    }
}
