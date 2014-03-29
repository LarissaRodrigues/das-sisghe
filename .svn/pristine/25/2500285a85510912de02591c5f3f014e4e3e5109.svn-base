package DAO;

import Model.Disciplina;
import Model.Grade;
import Model.Horario;
import Model.Matricula;
import Model.Turma;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

/**
 *
 * @author Beatriz
 */
public class DaoGrade {

    public static boolean SerializarGrade(Grade matriculas) throws IOException {
        if (matriculas == null) {
            throw new IOException("Grade nula!");
        }
        XStream xstream = new XStream(new DomDriver());
        OutputStream outputStream = null;
        xstream.alias("grade", Grade.class);
        xstream.alias("matricula", Matricula.class);
        xstream.alias("disciplina", Disciplina.class);
        xstream.alias("turma", Turma.class);
        xstream.alias("horario", Horario.class);
        File file = new File("XML/Grade.xml");
        try {
            outputStream = new FileOutputStream(file);
            Writer writer = new OutputStreamWriter(outputStream, "UTF-8");
            xstream.toXML(matriculas, writer);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return true;
    }

    public static Grade DeserializarGrade() throws Exception {

        Grade grade = new Grade();
        SAXBuilder builder = new SAXBuilder();
        try {
            Document documento = builder.build("XML/Grade.xml");
            Element aGrade = documento.getRootElement();
            List<Element> bMatriculas = aGrade.getChildren();
            ArrayList<Matricula> matriculas = new ArrayList<Matricula>();
            for (Element b : bMatriculas) {
                List<Element> cMatriculaa = b.getChildren();
                for (Element c : cMatriculaa) {
                    List<Element> dMatricula = c.getChildren("turma");
                    String disciplinaNome = c.getChildText("nomeDisciplina");
                    Turma turma = new Turma();
                    for (Element d : dMatricula) {
                        List<Element> eTurma = d.getChildren("horarios");
                        String turmaNome = d.getChildText("nome");
                        ArrayList<Horario> horarios = new ArrayList<Horario>();
                        for (Element e : eTurma) {
                            List<Element> fHorario = e.getChildren();
                            for (Element f : fHorario) {
                                String horarioDiaDaSemana = f.getChildText("diaDaSemana");
                                String horarioHora = f.getChildText("hora");
                                Horario horario = new Horario (horarioDiaDaSemana, horarioHora);
                                horarios.add(horario);
                            }
                        }
                        turma = new Turma(turmaNome, horarios);
                    }
                    Matricula matricula = new Matricula(disciplinaNome, turma);
                    matriculas.add(matricula);
                }
            }
            grade.setMatriculas(matriculas);
        } catch (Exception e) {
//            System.out.println("Não foi possível realizar a deserialização. Erro: " + e.getMessage());
        }
        return grade;
    }

    public static boolean ExcluirGrade() {
        File file = new File("XML/Grade.xml");
        return file.delete();
    }
}
