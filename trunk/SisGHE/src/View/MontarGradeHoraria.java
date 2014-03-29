package View;

import Control.ControleGrade;
import DAO.DaoOferta;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;

public class MontarGradeHoraria extends javax.swing.JDialog {

    private ArrayList<Model.Disciplina> materias;
    protected static DefaultListModel<Model.Disciplina> disciplinas = new DefaultListModel();
    private DefaultListModel<Model.Turma> turmas = new DefaultListModel();

    public MontarGradeHoraria(java.awt.Frame parent, boolean modal, boolean abreGrade) {
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
            java.util.logging.Logger.getLogger(MontarGradeHoraria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MontarGradeHoraria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MontarGradeHoraria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MontarGradeHoraria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        setResizable(false);


        initComponents();

        try {

            if (abreGrade) {
               ControleGrade.getInstance().abrirMontarGrade();
            }
            materias = DaoOferta.DeserializaOferta();
            for (int i = 0; i < materias.size(); i++) {
                disciplinas.addElement(materias.get(i));
            }
            JListDisciplinas.setModel(disciplinas);
        } catch (Exception ex) {
            Logger.getLogger(ListaOferta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        gradeHoraria = new javax.swing.JTable();
        Concluir = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        JListDisciplinas = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        JListTurmas = new javax.swing.JList();
        Adicionar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        gradeHoraria.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        gradeHoraria.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][]{
                {"08h", null, null, null, null, null, null},
                {"10h", null, null, null, null, null, null},
                {"12h", null, null, null, null, null, null},
                {"14h", null, null, null, null, null, null},
                {"16h", null, null, null, null, null, null},
                {"18h", null, null, null, null, null, null},
                {"20h", null, null, null, null, null, null}
            },
            new String[]{
                "Horários", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"
            }) {
                boolean[] canEdit = new boolean[]{
                    false, false, false, false, false, false, false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            });
            gradeHoraria.setRowHeight(25);
            gradeHoraria.getTableHeader().setReorderingAllowed(false);
            //  INICIO

            DefaultTableCellRenderer letras = new DefaultTableCellRenderer() {
                public void setValue(Object value) {
                    setBackground(new Color(238, 238, 238));
                    setForeground(Color.BLACK);
                    setHorizontalAlignment(JLabel.CENTER);

                    //outras alterações entram aqui...
                    super.setValue(value);
                }
            };

            DefaultTableCellRenderer numeros = new DefaultTableCellRenderer() {
                public void setValue(Object value) {
                    setHorizontalAlignment(JLabel.CENTER);
                    super.setValue(value);
                }
            };
            gradeHoraria.getColumn("Horários").setCellRenderer(numeros);
            gradeHoraria.getColumn("Horários").setCellRenderer(letras);
            gradeHoraria.getColumn("Segunda").setCellRenderer(numeros);
            gradeHoraria.getColumn("Terça").setCellRenderer(numeros);
            gradeHoraria.getColumn("Quarta").setCellRenderer(numeros);
            gradeHoraria.getColumn("Quinta").setCellRenderer(numeros);
            gradeHoraria.getColumn("Sexta").setCellRenderer(numeros);
            gradeHoraria.getColumn("Sábado").setCellRenderer(numeros);

            // FIM
            jScrollPane2.setViewportView(gradeHoraria);

            Concluir.setText("Concluir");
            Concluir.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    ConcluirActionPerformed(evt);
                }
            });

            jScrollPane4.setBorder(javax.swing.BorderFactory.createTitledBorder("Matérias"));
            jScrollPane4.setToolTipText("");

            JListDisciplinas.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""))))));
            JListDisciplinas.setModel(new javax.swing.AbstractListModel() {
                String[] strings = { };
                public int getSize() { return strings.length; }
                public Object getElementAt(int i) { return strings[i]; }
            });
            JListDisciplinas.setToolTipText("");
            JListDisciplinas.setFocusable(false);
            JListDisciplinas.setRequestFocusEnabled(false);
            JListDisciplinas.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    JListDisciplinasMouseClicked(evt);
                }
                public void mouseReleased(java.awt.event.MouseEvent evt) {
                    JListDisciplinasMouseReleased(evt);
                }
            });
            JListDisciplinas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
                public void mouseDragged(java.awt.event.MouseEvent evt) {
                    JListDisciplinasMouseDragged(evt);
                }
            });
            JListDisciplinas.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyReleased(java.awt.event.KeyEvent evt) {
                    JListDisciplinasKeyReleased(evt);
                }
            });
            jScrollPane4.setViewportView(JListDisciplinas);

            jScrollPane3.setBorder(javax.swing.BorderFactory.createTitledBorder("Turmas"));

            JListTurmas.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
            JListTurmas.setModel(new javax.swing.AbstractListModel() {
                String[] strings = {  };
                public int getSize() { return strings.length; }
                public Object getElementAt(int i) { return strings[i]; }
            });
            JListTurmas.setToolTipText("");
            JListTurmas.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    JListTurmasMouseClicked(evt);
                }
            });
            jScrollPane3.setViewportView(JListTurmas);

            Adicionar.setText("Adicionar");
            Adicionar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    AdicionarActionPerformed(evt);
                }
            });

            btnRemover.setText("Remover");
            btnRemover.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnRemoverActionPerformed(evt);
                }
            });

            jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Horário"));

            jTextArea1.setColumns(20);
            jTextArea1.setRows(5);
            jScrollPane1.setViewportView(jTextArea1);

            jButton1.setText("(teste) Visualizar Array");
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
                }
            });

            btnLimpar.setText("Limpar");
            btnLimpar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnLimparActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnLimpar)
                            .addGap(270, 270, 270)
                            .addComponent(btnRemover)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Concluir))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(42, 42, 42)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(42, 42, 42)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Adicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 814, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jScrollPane1)
                            .addGap(34, 34, 34)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton1)
                                .addComponent(Adicionar))
                            .addGap(18, 18, 18))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Concluir)
                        .addComponent(btnRemover)
                        .addComponent(btnLimpar))
                    .addGap(10, 10, 10))
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void ConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConcluirActionPerformed
        salvar();
    }//GEN-LAST:event_ConcluirActionPerformed

    private void AdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarActionPerformed

        if (JListTurmas.isSelectionEmpty()) {
            JOptionPane.showMessageDialog(this, "Nenhuma turma selecionada\n", "Selecione pelo menos uma turma.", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {

            ControleGrade.getInstance().adicionarFrame(JListDisciplinas.getSelectedValue(), JListTurmas.getSelectedValue());

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao adicionar disciplina! " + ex.getMessage());
        }

    }//GEN-LAST:event_AdicionarActionPerformed

    public static void preencheGrade(Object valor, int coluna, int linha) {

        gradeHoraria.setValueAt(valor, linha, coluna);
    }

    private void JListDisciplinasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JListDisciplinasMouseClicked
        preencheTurmas();
    }//GEN-LAST:event_JListDisciplinasMouseClicked

    private void JListDisciplinasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JListDisciplinasKeyReleased
        preencheTurmas();
    }//GEN-LAST:event_JListDisciplinasKeyReleased

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        try {
            int linha = gradeHoraria.getSelectedRow();
            int coluna = gradeHoraria.getSelectedColumn();

            String valor = gradeHoraria.getValueAt(linha, coluna).toString();

            ControleGrade.getInstance().remover(valor);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não há disciplinas selecionadas!", "Atenção!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void JListTurmasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JListTurmasMouseClicked
        preencheLabel();
    }//GEN-LAST:event_JListTurmasMouseClicked

    private void JListDisciplinasMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JListDisciplinasMouseDragged
        turmas.removeAllElements();
        JListTurmas.setModel(turmas);
    }//GEN-LAST:event_JListDisciplinasMouseDragged

    private void JListDisciplinasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JListDisciplinasMouseReleased
        preencheTurmas();
    }//GEN-LAST:event_JListDisciplinasMouseReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(null, ControleGrade.matriculas);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed

        try {
            ControleGrade.getInstance().limparGrade();
            for (int linha = 0; linha < 7; linha++) {
                gradeHoraria.setValueAt("", linha, 1);
                for (int coluna = 1; coluna < 7; coluna++) {
                    gradeHoraria.setValueAt("", linha, coluna);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro!\n" + e.getMessage(), "Erro.", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnLimparActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Adicionar;
    private javax.swing.JButton Concluir;
    private static javax.swing.JList JListDisciplinas;
    private javax.swing.JList JListTurmas;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnRemover;
    private static javax.swing.JTable gradeHoraria;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

    private void preencheTurmas() {
        if (!(turmas.isEmpty())) {
            turmas.removeAllElements();
            JListTurmas.setModel(turmas);
        }

        try {

            Model.Disciplina d = (Model.Disciplina) JListDisciplinas.getSelectedValue();

            for (int i = 0; i < d.getTurmas().size(); i++) {

                turmas.addElement(d.getTurmas().get(i));
            }
            JListTurmas.setModel(turmas);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    private void preencheLabel() {

        try {
            Model.Turma t = (Model.Turma) JListTurmas.getSelectedValue();
            String di = "";

            for (int i = 0; i < t.getHorario().size(); i++) {
                di = di + t.getHorario().get(i).getDiaDaSemana() + "\n";
                di = di + t.getHorario().get(i).getHora() + "\n";

            }
            jTextArea1.setText(di);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void removeGrade(int linha, int coluna) {

        gradeHoraria.setValueAt("", linha, coluna);

    }

    private void salvar() {
        try {
            ControleGrade.getInstance().cadastrarGrade();
            JOptionPane.showMessageDialog(this, "Grade salva com Sucesso!");
            zerarJLists();

            this.dispose();

            GradeHoraria grade;

            try {
                ControleGrade.getInstance().obterGrade();
                grade = new GradeHoraria(null, true, false);
                grade.setLocationRelativeTo(null);
                grade.setVisible(true);
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Preencha a grade com disciplinas!", "Atenção", JOptionPane.ERROR);
            System.out.println(ex.getMessage());
        }
    }

    private void zerarJLists() {
        disciplinas.clear();
        turmas.clear();
        JListDisciplinas.setModel(disciplinas);
        JListTurmas.setModel(turmas);
    }
}
