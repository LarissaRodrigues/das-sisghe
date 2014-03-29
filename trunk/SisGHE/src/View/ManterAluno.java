package View;

import Business.*;
import Control.*;
import DAO.*;
import Exception.*;
import Model.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.IIOException;
import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class ManterAluno extends javax.swing.JDialog {

    protected static ArrayList<Model.Disciplina> materias, materiasSemPreReq, materiasGrade, materiasCursadas;
    protected static DefaultListModel listaA_Cursar = new DefaultListModel();
    protected static DefaultListModel listaMateriasCursadas = new DefaultListModel();
    JDialog menuAnterior;

    public ManterAluno(java.awt.Frame parent, boolean modal, JDialog menuAnterior, boolean novoCadastro) {
        super(parent, modal);

        try {
            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent evt) {
                    int op = JOptionPane.showConfirmDialog(null, "Deseja salvar?", "Atenção!", JOptionPane.OK_OPTION);
                    if (op == 0) {
                        salvar();
                        zerarJLists();
                    } else {
                        zerarJLists();
                    }
                }
            });
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManterAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManterAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManterAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManterAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        setResizable(false);
        initComponents();
        this.menuAnterior = menuAnterior;
        semestreCombo.setSelectedIndex(0);

        try {
            
            materiasCursadas = ControleManterAluno.getInstance().obterDisciplinasCursadas();
            
            if(novoCadastro){
            
                materias = ControleDisciplinas.getInstance().obterDisciplinas();
                materiasSemPreReq = LiberaDisciplina.FiltraDisciplinas(materias);

                for (int i = 0; i < materiasSemPreReq.size(); i++) {
                    listaA_Cursar.add(i, materiasSemPreReq.get(i));
                }

                JListDisciplinas.setModel(listaA_Cursar);
                JListSelecionada.setModel(listaMateriasCursadas);
                
            }else{
                
                Aluno aluno = ControleManterAluno.getInstance().obterAluno();
                nomeText.setText(aluno.getNome());
                cursoText.setText(aluno.getCurso());
                matriculaText.setText(aluno.getMatricula());
                semestreCombo.setSelectedIndex(Integer.parseInt(aluno.getSemestre()) - 1);

                for (int i = 0; i < materiasCursadas.size(); i++) {
                    listaMateriasCursadas.add(i, materiasCursadas.get(i));
                }

                JListSelecionada.setModel(listaMateriasCursadas);

                
                ArrayList <Disciplina> auxListaOferta = ControleManterAluno.getInstance().obterDisciplinasOferta();
                
                for (int i = 0; i < auxListaOferta.size(); i++) {
                    listaA_Cursar.add(i, auxListaOferta.get(i));
                }

                JListDisciplinas.setModel(listaA_Cursar);
            }
        } catch (Exception ex) {
            Logger.getLogger(ManterAluno.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jLnome = new javax.swing.JLabel();
        nomeText = new javax.swing.JTextField();
        cursoText = new javax.swing.JTextField();
        jLcurso = new javax.swing.JLabel();
        jLmatricula = new javax.swing.JLabel();
        matriculaText = new javax.swing.JTextField();
        jLsemestre = new javax.swing.JLabel();
        semestreCombo = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        salvarButton = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        JListSelecionada = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        JListDisciplinas = new javax.swing.JList();
        selecionarButton = new javax.swing.JButton();
        retirarButton = new javax.swing.JButton();
        jLmatricula1 = new javax.swing.JLabel();
        jLsemestre1 = new javax.swing.JLabel();
        jLsemestre2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(8, 5, 2));

        jPanel2.setBackground(new java.awt.Color(169, 243, 132));

        jLnome.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLnome.setForeground(new java.awt.Color(254, 254, 254));
        jLnome.setText("Nome");

        nomeText.setToolTipText("Digite seu nome");

        cursoText.setToolTipText("Digite seu curso");

        jLcurso.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLcurso.setForeground(new java.awt.Color(255, 250, 250));
        jLcurso.setText("Curso");

        jLmatricula.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLmatricula.setForeground(new java.awt.Color(251, 249, 249));
        jLmatricula.setText("Matricula");

        matriculaText.setToolTipText("Digite sua matricula");

        jLsemestre.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLsemestre.setForeground(new java.awt.Color(252, 245, 245));
        jLsemestre.setText("Semestre");

        semestreCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] {  "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));

        jLabel1.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(65, 19, 136));
        jLabel1.setText("Cadastro");

        salvarButton.setBackground(new java.awt.Color(60, 2, 159));
        salvarButton.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        salvarButton.setForeground(new java.awt.Color(254, 254, 254));
        salvarButton.setText("Salvar");
        salvarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarButtonActionPerformed(evt);
            }
        });

        JListSelecionada.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        JListSelecionada.setToolTipText("Para retirar, selecione e clique em <<");
        jScrollPane2.setViewportView(JListSelecionada);

        JListDisciplinas.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        JListDisciplinas.setToolTipText("Selecione as Materias e clique em >>");
        jScrollPane3.setViewportView(JListDisciplinas);

        selecionarButton.setText(">>");
        selecionarButton.setToolTipText("selecionar materias a esquerda");
        selecionarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionarButtonActionPerformed(evt);
            }
        });

        retirarButton.setText("<<");
        retirarButton.setToolTipText("retirar materias selecionadas");
        retirarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retirarButtonActionPerformed(evt);
            }
        });

        jLmatricula1.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLmatricula1.setForeground(new java.awt.Color(251, 249, 249));

        jLsemestre1.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLsemestre1.setForeground(new java.awt.Color(252, 245, 245));
        jLsemestre1.setText("Lista de Matérias");

        jLsemestre2.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLsemestre2.setForeground(new java.awt.Color(252, 245, 245));
        jLsemestre2.setText("Matérias Cursadas");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator4)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLmatricula)
                            .addComponent(jLsemestre))))
                .addGap(0, 383, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(salvarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLcurso)
                                    .addComponent(jLnome))
                                .addGap(68, 68, 68)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nomeText, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cursoText, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(matriculaText, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(semestreCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(selecionarButton, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(retirarButton, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLmatricula1)))
                                .addGap(130, 130, 130)))
                        .addGap(0, 69, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLsemestre1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLsemestre2)
                .addGap(39, 39, 39))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLnome)
                    .addComponent(nomeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLcurso)
                    .addComponent(cursoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLmatricula)
                    .addComponent(matriculaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLsemestre)
                    .addComponent(semestreCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLsemestre1)
                            .addComponent(jLsemestre2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLmatricula1)
                        .addGap(81, 81, 81)
                        .addComponent(selecionarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(retirarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(salvarButton)
                .addGap(213, 213, 213)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarButtonActionPerformed
        salvar();
    }//GEN-LAST:event_salvarButtonActionPerformed

    private void retirarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retirarButtonActionPerformed
        if (JListSelecionada.isSelectionEmpty()) {
            return;
        }
        Model.Disciplina d = (Model.Disciplina) JListSelecionada.getSelectedValue();
        try {
            RemoveDisciplinas.validaDisciplina(materias, d, listaMateriasCursadas, listaA_Cursar);
        } catch (Exception ex) {
            Logger.getLogger(ManterAluno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_retirarButtonActionPerformed

    private void selecionarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionarButtonActionPerformed
        if (JListDisciplinas.isSelectionEmpty()) {
            return;
        }

        //JOptionPane.showMessageDialog(null, listaMateriasCursadas);

        Model.Disciplina d = (Model.Disciplina) JListDisciplinas.getSelectedValue();

        listaMateriasCursadas.addElement(d);
        listaA_Cursar.remove(JListDisciplinas.getSelectedIndex());
        //LiberaDisciplina.validaDisciplina(materias,d,listaMateriasCursadas,listaA_Cursar);

        try {
            ControleDisciplinas.getInstance().chamaLiberarDisciplina(materias, d, listaMateriasCursadas, listaA_Cursar);
        } catch (Exception ex) {
            Logger.getLogger(ManterAluno.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_selecionarButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList JListDisciplinas;
    private javax.swing.JList JListSelecionada;
    public javax.swing.JTextField cursoText;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLcurso;
    private javax.swing.JLabel jLmatricula;
    private javax.swing.JLabel jLmatricula1;
    private javax.swing.JLabel jLnome;
    private javax.swing.JLabel jLsemestre;
    private javax.swing.JLabel jLsemestre1;
    private javax.swing.JLabel jLsemestre2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    public javax.swing.JTextField matriculaText;
    public javax.swing.JTextField nomeText;
    private javax.swing.JButton retirarButton;
    private javax.swing.JButton salvarButton;
    private javax.swing.JButton selecionarButton;
    private javax.swing.JComboBox semestreCombo;
    // End of variables declaration//GEN-END:variables

    private void zerarJLists() {

        listaA_Cursar.clear();
        listaMateriasCursadas.clear();
        JListDisciplinas.setModel(listaA_Cursar);
        JListSelecionada.setModel(listaMateriasCursadas);
    }

    private void salvar() {
        String nome = nomeText.getText();
        String matricula = matriculaText.getText();
        String curso = cursoText.getText();
        String semestre = String.valueOf(semestreCombo.getSelectedIndex() + 1);
        ArrayList<Disciplina> d = new ArrayList();

        for (int i = 0; i < listaMateriasCursadas.size(); i++) {
            d.add((Disciplina) listaMateriasCursadas.get(i));
        }

        try {
            TratamentoDeExcecoes.validarNome(nome);
            //TratamentoDeExcecoes.validarNome(matricula);
            //TratamentoDeExcecoes.validarNome(curso);

            ControleManterAluno.getInstance().cadastrarAluno(nome, matricula, curso, semestre, d);
            JOptionPane.showMessageDialog(this, "Cadastro Efetuado!");
            //materiasGrade = LiberaDisciplina.liberaDisciplinasGrade(listaA_Cursar);
            DaoOferta.SerializaOferta(listaA_Cursar);
            zerarJLists();
            this.dispose();
            menuAnterior.dispose();

        } catch (NomeInvalidoException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } catch (CursoInvalidoException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } catch (MatriculaInvalidaException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } catch (Exception ex) {
            ex.printStackTrace();

        }
    }
}
