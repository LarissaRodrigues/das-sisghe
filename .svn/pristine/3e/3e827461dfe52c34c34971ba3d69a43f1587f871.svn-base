package DAO;

import Control.ControleManterAluno;
import Exception.CursoInvalidoException;
import Exception.MatriculaInvalidaException;
import Exception.NomeInvalidoException;
import Model.*;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

public class DaoAluno {

    public static boolean deleteAluno() {
        return (deleteAlunoXML() && deleteAlunoLista() && deleteAlunoOferta());
    }
    
    public static boolean deleteAlunoXML() {
        try {
            File alunoFile = new File("XML/Aluno.xml");
            alunoFile.delete();
            File fileAluno = new File("XML/Aluno.xml");
            return false;
        } catch (Exception ex) {
            System.out.println("Aluno deletado com sucesso.");
            return true;
        }
    }

    public static boolean deleteAlunoLista() {
        try {
            File listaFile = new File("XML/Lista de disciplinas cursadas.xml");
            listaFile.delete();
            File fileLista = new File("XML/Lista de disciplinas cursadas.xml");
            return false;
        } catch (Exception ex) {
            System.out.println("Aluno deletado com sucesso.");
            return true;
        }
    }
    
    public static boolean deleteAlunoOferta() {
        try {
            File ofertaFile = new File("XML/Oferta.xml");
            ofertaFile.delete();
            File fileOferta = new File("XML/Oferta.xml");
            return false;
        } catch (Exception ex) {
            System.out.println("Aluno deletado com sucesso.");
            return true;
        }
    }
    
    public static void SerializarAluno(Aluno aluno) {
        
        String alunoNome = aluno.getNome();
        String alunoMatricula = aluno.getMatricula();
        String alunoCurso = aluno.getCurso();
        String alunoSemestre = aluno.getSemestre();
        ArrayList<Disciplina> alunoDisciplinas = aluno.getDisciplinasCursadas();
        if (alunoDisciplinas != null) {
            ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
            Iterator i = alunoDisciplinas.iterator();
            while (i.hasNext()) {
                Disciplina d = (Disciplina) i.next();
                String disciplinaNome = d.getNome();
                String disciplinaCodigo = d.getCodigo();
                String disciplinaPre_req = d.getPre_req();
                disciplinas.add(new Disciplina(disciplinaNome,disciplinaCodigo,disciplinaPre_req,null));
            }
            serializarAlunoDisciplinas(disciplinas);
        }
        try {
            Aluno a = new Aluno(alunoNome, alunoMatricula, alunoCurso, alunoSemestre, null);
            serializarAlunoXml(a);
        } catch (NomeInvalidoException ex) {
            Logger.getLogger(DaoAluno.class.getName()).log(Level.SEVERE, null, ex);
        } catch (CursoInvalidoException ex) {
            Logger.getLogger(DaoAluno.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MatriculaInvalidaException ex) {
            Logger.getLogger(DaoAluno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static Aluno DeserializarAluno() {
        try {
            Aluno a = deserializarAlunoXml();
            ArrayList<Disciplina> d = deserializarAlunoDisciplinas();
            Aluno aluno = new Aluno(a.getNome(),a.getMatricula(), a.getCurso(), a.getSemestre(), d);
            return aluno;
        } catch (Exception e) {
            System.out.println("Não foi possível realizar a deserialização. Erro: " + e.getMessage());
            return null;
        }
    }
    
    private static Aluno deserializarAlunoXml() {
        Aluno aluno = new Aluno();
        SAXBuilder builder = new SAXBuilder();

        try {
            Document documento = builder.build("XML/Aluno.xml");
            Element e = documento.getRootElement();
            aluno = new Aluno (e.getChildText("nome"),e.getChildText("matricula"), e.getChildText("curso"), e.getChildText("semestre"), null);
        } catch (Exception e) {
            System.out.println("Não foi possível realizar a deserialização. Erro: " + e.getMessage());
            return null;
        }

        return aluno;
    }
    
    public static ArrayList<Disciplina> deserializarAlunoDisciplinas() {
        ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
        SAXBuilder builder = new SAXBuilder();

        try {
            Document documento = builder.build("XML/Lista de disciplinas cursadas.xml");

            Element eDisciplinas = documento.getRootElement();
            List<Element> eDisciplina = eDisciplinas.getChildren();

            for (Element e : eDisciplina) {
                Disciplina disciplina = new Disciplina (
                        e.getChildText("nome"),
                        e.getChildText("codigo"),
                        e.getChildText("pre__req"),
                        null);
                disciplinas.add(disciplina);
            }
        } catch (Exception e) {
            System.out.println("Não foi possível realizar a deserialização. Erro: " + e.getMessage());
            return null;
        }

        return disciplinas;
    }
    private static void serializarAlunoXml(Aluno aluno) {
        XStream xstream = new XStream(new DomDriver());
        xstream.alias("aluno", Aluno.class);
        xstream.alias("disciplina", Disciplina.class);
        xstream.alias("turma", Turma.class);
        xstream.alias("horario", Horario.class);
        OutputStream alunoOutputStream = null;
        File alunoFile = new File("XML/Aluno.xml");
        try {
            alunoOutputStream = new FileOutputStream(alunoFile);
            Writer alunoWriter = new OutputStreamWriter(alunoOutputStream, "UTF-8");
            xstream.toXML(aluno, alunoWriter);
            alunoOutputStream.close();
            alunoWriter.close();
        } catch (IOException e) {
            System.out.println("Não foi possível realizar a deserialização. Erro: " + e.getMessage());
        }
    }
    
    private static void serializarAlunoDisciplinas(ArrayList<Disciplina> disciplinas) {
        XStream xstream = new XStream(new DomDriver());
        xstream.alias("aluno", Aluno.class);
        xstream.alias("disciplina", Disciplina.class);
        xstream.alias("turma", Turma.class);
        xstream.alias("horario", Horario.class);
        OutputStream alunoOutputStream = null;
        File alunoFile = new File("XML/Lista de disciplinas cursadas.xml");
        try {
            alunoOutputStream = new FileOutputStream(alunoFile);
            Writer alunoWriter = new OutputStreamWriter(alunoOutputStream, "UTF-8");
            xstream.toXML(disciplinas, alunoWriter);
            alunoOutputStream.close();
            alunoWriter.close();
        } catch (IOException e) {
            System.out.println("Não foi possível realizar a deserialização. Erro: " + e.getMessage());
        }
    }
    
}
