package DAO;

import Model.Disciplina;
import Model.Horario;
import Model.Turma;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

/**
 *
 * @author david
 */
public class DaoOferta {
   private static ArrayList <Disciplina> arrayDisciplina = new ArrayList<Disciplina>();
   private static ArrayList<Turma> classes = new ArrayList<Turma>();
   public static boolean SerializaOferta(DefaultListModel oferta) throws FileNotFoundException{
       boolean confirm = false;
       ArrayList <Disciplina> disciplinas = new ArrayList<Disciplina>();
       for(int cont = 0; cont<oferta.getSize(); cont++){
           disciplinas.add((Disciplina) oferta.getElementAt(cont));
      } 
      
       XStream xstream = new XStream(new DomDriver());
        File file = new File("XML/Oferta.xml");
        OutputStream outputStream = null;
       try{
           System.out.println("teste");
           outputStream = new FileOutputStream(file);
           Writer writer = new OutputStreamWriter(outputStream,"UTF-8");
           xstream.toXML(disciplinas,writer);
           confirm = true;
       }catch(IOException e){
           confirm = false;
           e.getMessage();
       }
  return confirm;
   }
       
   
   public static ArrayList<Disciplina> DeserializaOferta() throws JDOMException, IOException{
          
            ArrayList<Disciplina> disciplines = new ArrayList<Disciplina>();
    SAXBuilder builder = new SAXBuilder();

    try {
        Document documento = builder.build("XML/Oferta.xml");

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
                        for (Element h: horario) {
                            Horario hourClass = new Horario(h.getChildText("diaDaSemana"), h.getChildText("hora"));
                            hourClasses.add(hourClass);
                        }
                        Turma classLesson = new Turma(t.getChildText("nome"), hourClasses);
                        classes.add(classLesson);
                    }
                }
            }
            Disciplina disciplina = new Disciplina (
                    e.getChildText("nome"),
                    e.getChildText("codigo"),
                    e.getChildText("pre__req"),
                    classes);
            disciplines.add(disciplina);
        }
    } catch (Exception e) {
           System.out.println("Não foi possível realizar a deserialização. Erro: " + e.getMessage());
    }

    return disciplines;
    }
               
                }
           
           
  
           
  
   

       
       
       
       
   


    
    
    
