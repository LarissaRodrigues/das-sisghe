package DisciplinasCursadas.Controle;

import Apresentacao.InAlteraAluno;
import Apresentacao.InCadastroAluno;
import Disciplinas.Controle.ControlSubject;
import Disciplinas.Modelo.Disciplina;
import DisciplinasCursadas.DAO.*;
import DisciplinasCursadas.Modelo.*;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JCheckBox;

/**
 *
 * @author Beatriz
 */
public class ControlaDisciplina {

    static ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
    static ArrayList<DisciplinaCursada> disciplinasCursadas = new ArrayList<DisciplinaCursada>();
    static ArrayList<DisciplinaCursada> novas_disciplinasCursadas = new ArrayList<DisciplinaCursada>();
    static ArrayList<JCheckBox> listaCB = new ArrayList<JCheckBox>();

    public void listaAltera() {

        listaCB.add(InAlteraAluno.Acustica_e_vibracoes_veiculares);
        listaCB.add(InAlteraAluno.Analise_de_sinais_e_design_de_circuitos);
        listaCB.add(InAlteraAluno.Calculo1);
        listaCB.add(InAlteraAluno.Calculo2);
        listaCB.add(InAlteraAluno.Calculo3);
        listaCB.add(InAlteraAluno.Circuitos_eletronicos1);
        listaCB.add(InAlteraAluno.Circuito_Eletronico2);
        listaCB.add(InAlteraAluno.circuitos_eletronicos3);
        listaCB.add(InAlteraAluno.Comunicacoes_digitais_para_engenharia);
        listaCB.add(InAlteraAluno.Dinamica_de_veiculos);
    }

    public void listaCadastra() {

        listaCB.add(InCadastroAluno.Acustica_e_vibracoes_veiculares);
        listaCB.add(InCadastroAluno.Analise_de_sinais_e_design_de_circuitos);
        listaCB.add(InCadastroAluno.Calculo1);
        listaCB.add(InCadastroAluno.Calculo2);
        listaCB.add(InCadastroAluno.Calculo3);
        listaCB.add(InCadastroAluno.Circuitos_eletronicos1);
        listaCB.add(InCadastroAluno.Circuito_Eletronico2);
        listaCB.add(InCadastroAluno.circuitos_eletronicos3);
        listaCB.add(InCadastroAluno.Comunicacoes_digitais_para_engenharia);
        listaCB.add(InCadastroAluno.Dinamica_de_veiculos);
    }

    public void setaDisciplina() {

        for (DisciplinaCursada dc : disciplinasCursadas) {
            for (JCheckBox componente : listaCB) {
                if (dc.getNome().equals(componente.getText())) {
                    componente.setSelected(true);
                }
            }
        }
    }

    public void chamaSerializar() {
        XmlDisciplinasCursadas.gerarXml(disciplinasCursadas);
    }

    public void chamaSerializarAlteracao() {
        XmlDisciplinasCursadas.gerarXml(novas_disciplinasCursadas);
    }

    public static void chamaDeserializar() {
        ControlSubject controlSubject = new ControlSubject();
        disciplinas = controlSubject.callDeserialize();
    }

    public static void chamaDeserializarCursadas() {
        disciplinasCursadas = new XmlDisciplinasCursadas().lerXml();
    }

    public void verificar() {

        for (JCheckBox cb : listaCB) {

            DisciplinaCursada dp = new DisciplinaCursada();

            if (cb.isSelected()) {
                for (Disciplina dc : disciplinas) {
                    if (dc.getNome().equalsIgnoreCase(cb.getText())) {
                        dp = new DisciplinaCursada(cb.getText(), dc.getCodigo(), dc.getPre_req());
                    }
                }
                disciplinasCursadas.add(dp);
            }
            if (!cb.isSelected()) {

                for (Iterator<DisciplinaCursada> it = disciplinasCursadas.iterator(); it.hasNext();) {
                    DisciplinaCursada n = it.next();
                    if (cb.getText().contains(n.getNome())) {
                        it.remove();
                    }
                }
            }
        }
    }

    public void verificarAlteracao() {

        for (JCheckBox cb : listaCB) {

            DisciplinaCursada dp = new DisciplinaCursada();
            int achei = 0;
            if (cb.isSelected()) {
                for (Disciplina dc : disciplinas) {
                    if (dc.getNome().equalsIgnoreCase(cb.getText())) {
                        dp = new DisciplinaCursada(cb.getText(), dc.getCodigo(), dc.getPre_req());
                    }
                }
                for (DisciplinaCursada ndc : novas_disciplinasCursadas) {
                    if (ndc.getNome().equals(dp.getNome())) {
                        achei++;
                    }
                }
                if (achei == 0) {
                    novas_disciplinasCursadas.add(dp);
                }
            }
            if (!cb.isSelected()) {

                for (Iterator<DisciplinaCursada> it = novas_disciplinasCursadas.iterator(); it.hasNext();) {
                    DisciplinaCursada n = it.next();
                    if (cb.getText().contains(n.getNome())) {
                        it.remove();
                    }
                }
            }
        }
    }
}
