package DAO;

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
import java.util.List;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

public class DaoDisciplinas {

    public static boolean SerializarDisciplinas(ArrayList<Disciplina> disciplinas) throws IOException {

        if (disciplinas == null) {
            throw new IOException("lista de disciplinas nula!");
        }

        XStream xstream = new XStream(new DomDriver());

        OutputStream outputStream = null;
        xstream.alias("lista_disciplinas", disciplinas.getClass());
        xstream.alias("disciplina", Disciplina.class);
        xstream.alias("turma", Turma.class);
        xstream.alias("horario", Horario.class);

        File file = new File("XML/Lista de disciplinas.xml");

        try {
            outputStream = new FileOutputStream(file);
            Writer writer = new OutputStreamWriter(outputStream, "UTF-8");
            xstream.toXML(disciplinas, writer);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return true;
    }

    public static ArrayList<Disciplina> DeserializarDisciplinas() throws Exception {

        ArrayList<Disciplina> disciplines = new ArrayList<Disciplina>();
        SAXBuilder builder = new SAXBuilder();

        try {
            Document documento = builder.build("XML/Lista de disciplinas.xml");

            Element disciplinas = documento.getRootElement();
            List<Element> lista_disciplinas = disciplinas.getChildren();

            for (Element e : lista_disciplinas) {
                List<Element> turmas = e.getChildren("turmas");
                ArrayList<Turma> classes = new ArrayList<Turma>();
                for (Element f : turmas) {
                    List<Element> turma = f.getChildren();
                    for (Element t : turma) {
                        List<Element> horarios = t.getChildren("horarios");
                        for (Element g : horarios) {
                            List<Element> horario = g.getChildren();
                            ArrayList<Horario> hourClasses = new ArrayList<Horario>();
                            for (Element h : horario) {
                                Horario hourClass = new Horario(h.getChildText("diaDaSemana"), h.getChildText("hora"));
                                hourClasses.add(hourClass);
                            }
                            Turma classLesson = new Turma(t.getChildText("nome"), hourClasses);
                            classes.add(classLesson);
                        }
                    }
                }
                Disciplina disciplina = new Disciplina(
                        e.getChildText("nome"),
                        e.getChildText("codigo"),
                        e.getChildText("pre__req"),
                        classes);
                disciplines.add(disciplina);
            }
        } catch (Exception e) {
            //System.out.println("Não foi possível realizar a deserialização. Erro: " + e.getMessage());
        }

        return disciplines;
    }
}