package Control;

import Exception.MateriaInvalidaException;
import Model.Disciplina;
import Model.Grade;
import Model.Horario;
import Model.Matricula;
import Model.Turma;
import java.io.IOException;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Beatriz
 */
public class ControleGradeTest {

    public ControleGradeTest() {
    }
    Turma turma1, turma2;
    Disciplina dis, dis2;

    @Before
    public void setUp() throws IOException, MateriaInvalidaException, Exception {
        System.out.println("<Executa Before>");

        ArrayList<Horario> horarios = new ArrayList<Horario>();
        ArrayList<Horario> horarios2 = new ArrayList<Horario>();

        Horario h1 = new Horario("Segunda", "14h");
        Horario h2 = new Horario("Quarta", "14h");
        Horario h3 = new Horario("Terça", "08h");
        Horario h4 = new Horario("Quinta", "08h");
        Horario h5 = new Horario("Quinta", "18h");
        horarios.add(h1);
        horarios.add(h2);
        horarios2.add(h3);
        horarios2.add(h4);
        horarios2.add(h5);

        turma1 = new Turma("A", horarios);
        turma2 = new Turma("B", horarios2);

        dis = new Disciplina("Calculo 2", "123", "234");
        dis2 = new Disciplina("Sistema Digitais 1", "321", "432");
        
        Control.ControleGrade.adicionar(dis, turma1);
        Control.ControleGrade.adicionar(dis2, turma2);
        
        Control.ControleGrade.cadastrarGrade();
     
    }

    /**
     * Test of getInstance method, of class ControleGrade.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        System.out.println("aaaa");
        ControleGrade res = ControleGrade.getInstance();
        assertNotNull(res);
    }

    /**
     * Test of cadastrarGrade method, of class ControleGrade.
     */
    @Test
    public void testCadastrarGrade() {
        System.out.println("cadastrarGrade");
        try {
            ControleGrade.cadastrarGrade();
        } catch (IOException e) {
            fail("Erro, grade não cadastrada");
        }
    }

    /**
     * Test of obterGrade method, of class ControleGrade.
     */
    @Test
    public void testObterGrade() throws Exception {
        System.out.println("obterGrade");
        assertNotNull(ControleGrade.getInstance().obterGrade());
    }

    /**
     * Test of excluirGrade method, of class ControleGrade.
     */
    @Test
    public void testExcluirGrade() throws Exception {
        System.out.println("exluirGrade");
        assertTrue(ControleGrade.getInstance().excluirGrade());
    }

    /**
     * Test of adicionar method, of class ControleGrade.
     */
    @Test
    public void testAdicionar() throws MateriaInvalidaException, Exception {
        System.out.println("adicionar");
        assertNotNull(ControleGrade.getInstance().adicionar(dis, turma1));
    }
    
}
