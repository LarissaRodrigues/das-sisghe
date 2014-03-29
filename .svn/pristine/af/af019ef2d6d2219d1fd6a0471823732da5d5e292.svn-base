package Controle;

import Modelo.Aluno;
import DAO.SerializaAluno;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Apresentacao.*;
import DAO.DeserializaAluno;
import DisciplinasCursadas.DAO.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author david, felipe, beatriz
 */
public class ControlaAluno {

    public static List<Aluno> alunos = new ArrayList<Aluno>();
    public static List<Aluno> alteraAluno = new ArrayList<Aluno>();
    private Aluno aluno;
    private InAlteraAluno inAltera;

    public ControlaAluno() {
        this.aluno = new Aluno();

    }

    public void CadastraAluno(String nome, String matricula, String curso, String semestre) {

        this.aluno.setNome(nome);
        this.aluno.setMatricula(matricula);
        this.aluno.setCurso(curso);
        this.aluno.setSemestre(semestre);
        alunos.add(this.aluno);

    }

    public void AlterarAluno(String nome, String matricula, String curso, String semestre) throws IllegalArgumentException {
        this.aluno.setNome(nome);
        this.aluno.setMatricula(matricula);
        this.aluno.setCurso(curso);
        this.aluno.setSemestre(semestre);
        alteraAluno.add(aluno);
    }

    public void chamaSerializar() {
        SerializaAluno.SerializarCadastro(alunos);
    }

    public void chamaSerializarAlterar() {
        SerializaAluno.SerializarAlterar();

    }

    public void setaAluno() {

        Aluno novoAluno = (Aluno) DeserializaAluno.listaAluno.get(0);

        String nome = novoAluno.getNome();
        String matricula = novoAluno.getMatricula();
        String curso1 = novoAluno.getCurso();
        String semestre = novoAluno.getSemestre();
        this.inAltera = new InAlteraAluno(); //Crio a interface e seto os dados nos campos.
        this.inAltera.setVisible(true);
        inAltera.jTnome.setText(nome);
        inAltera.jTmatricula.setText(matricula);
        inAltera.jTcurso1.setText(curso1);
        inAltera.cbSemestre.setSelectedItem(semestre);
        DeserializaAluno.listaAluno.remove(novoAluno);
        //Zerando a array para manter a posição 0 sempre.
    }

    public void chamaDeserializar() {
        DeserializaAluno.DeserializaAluno();

    }

    public void verificaCadastro() {
        DeserializaAluno.VerificaCadastro();
    }

    /*Método responsavel por verificar a Existencia do arquivo do Cadastro. Se o arquivo existir
     * habilitamos os botões de alterar e excluir, caso não exista, habilitamos apenas o botão de cadastro.
     */
    public void habilitaButtonAluno() {
        InAluno interfaceAluno = new InAluno();
        interfaceAluno.setVisible(true);
        if (DeserializaAluno.VerificaCadastro()) {
            interfaceAluno.jBCadastrar.setEnabled(true);
            interfaceAluno.jBAlterar.setEnabled(false);
            interfaceAluno.jBExcluir.setEnabled(false);
        } else {
            interfaceAluno.jBCadastrar.setEnabled(false);
            interfaceAluno.jBAlterar.setEnabled(true);
            interfaceAluno.jBExcluir.setEnabled(true);
        }
    }

//FELIPE>>>  (Modificado por: Beatriz)
    public static boolean chamaExcluir() {
        boolean teste_1 = DeserializaAluno.excluiXmlAluno();
        boolean teste_2 = XmlDisciplinasCursadas.excluiXmlCadastro();
        alunos = new ArrayList<Aluno>();

        if (teste_1 && teste_2) {
            return true;
        } else {
            return false;

        }
    }
}
