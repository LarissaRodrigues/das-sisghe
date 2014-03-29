/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Disciplinas.DAO;

import Disciplinas.Controle.ControlDay;
import Disciplinas.Modelo.Dia;
import java.util.ArrayList;
import java.util.List;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

/**
 *
 * @author Axs
 */
public class DeserializeDays {

    public DeserializeDays() {
    }
    static ArrayList<Dia> days = ControlDay.createDays();

    public static ArrayList<Dia> deserializingDays() {
        SAXBuilder builder = new SAXBuilder();

        try {
            Document documento = builder.build("src/Disciplinas/DAO/lista_dias.xml");

            Element dias = documento.getRootElement();

            List<Element> lista_dias = dias.getChildren();

            //System.out.println("Dias");
            for (Element e : lista_dias) {
                //System.out.println("Codigo: " + e.getChildText("codigo"));
                //System.out.println("Nome: " + e.getChildText("nome"));
                ControlDay.registerDay(days, ControlDay.createDay(e.getChildText("codigo"), e.getChildText("nome")));
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

        return days;
    }
}
