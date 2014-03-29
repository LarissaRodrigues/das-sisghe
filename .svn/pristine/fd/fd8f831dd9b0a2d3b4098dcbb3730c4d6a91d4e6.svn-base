package View;

import Control.*;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    static void habilitaGrade() {
        System.out.println("habilitado");
    }

    public Principal() {
        boolean temAluno = false;
        try {

            try {
                if (ControleManterAluno.getInstance().obterAluno() == null) {
                    temAluno = false;
                } else {
                    temAluno = true;
                }
            } catch (Exception ex) {
                temAluno = false;
            }

            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }

        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        setResizable(false);
        initComponents();
        GradeButton.setEnabled(temAluno);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PdfButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        AlunoButton = new javax.swing.JButton();
        GradeButton = new javax.swing.JButton();
        DisciplinasButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLUniversidadeBrasilia = new javax.swing.JLabel();
        jLUnBimg = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(169, 243, 132));

        PdfButton.setBackground(new java.awt.Color(60, 2, 159));
        PdfButton.setForeground(new java.awt.Color(254, 254, 254));
        PdfButton.setText("PDF");
        PdfButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PdfButtonActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(57, 2, 126));

        AlunoButton.setBackground(new java.awt.Color(1, 176, 13));
        AlunoButton.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        AlunoButton.setForeground(new java.awt.Color(254, 254, 254));
        AlunoButton.setText("Aluno");
        AlunoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlunoButtonActionPerformed(evt);
            }
        });

        GradeButton.setBackground(new java.awt.Color(1, 176, 13));
        GradeButton.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        GradeButton.setForeground(new java.awt.Color(254, 254, 254));
        GradeButton.setText("Grade");
        GradeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GradeButtonActionPerformed(evt);
            }
        });
        GradeButton.setEnabled(true);

        DisciplinasButton.setBackground(new java.awt.Color(1, 176, 13));
        DisciplinasButton.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        DisciplinasButton.setForeground(new java.awt.Color(254, 254, 254));
        DisciplinasButton.setText("Disciplinas");
        DisciplinasButton.setEnabled(true);
        DisciplinasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisciplinasButtonActionPerformed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(57, 2, 126));

        jSeparator3.setBackground(new java.awt.Color(57, 2, 126));

        jLUniversidadeBrasilia.setText("Universidade de Brasilia");

        jLUnBimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/unb_logo2.gif"))); // NOI18N
        jLUnBimg.setText("jLabel2");
        jLUnBimg.setMinimumSize(new java.awt.Dimension(350, 100));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(65, 19, 136));
        jLabel2.setText("sisGHE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator3)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLUniversidadeBrasilia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PdfButton))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLUnBimg, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(AlunoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addComponent(GradeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addComponent(DisciplinasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AlunoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GradeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DisciplinasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLUnBimg, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PdfButton)
                    .addComponent(jLUniversidadeBrasilia)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PdfButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PdfButtonActionPerformed
        new SalvarPDF().setVisible(true);
    }//GEN-LAST:event_PdfButtonActionPerformed

    private void AlunoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlunoButtonActionPerformed

        MenuAluno menuAluno;
        boolean temAluno = false;

        try {
            if (ControleManterAluno.getInstance().obterAluno() == null) {
                temAluno = false;
            } else {
                temAluno = true;
            }
        } catch (Exception ex) {
            temAluno = false;
        }

        menuAluno = new MenuAluno(this, true, false);
        menuAluno.setLocationRelativeTo(null);
        menuAluno.setVisible(true);

        try {
            if (ControleManterAluno.getInstance().obterAluno() == null) {
                temAluno = false;
            } else {
                temAluno = true;
            }
        } catch (Exception ex) {
            temAluno = false;
        }
        
        GradeButton.setEnabled(temAluno);
    }//GEN-LAST:event_AlunoButtonActionPerformed

    private void GradeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GradeButtonActionPerformed

        GradeHoraria grade;
        MontarGradeHoraria gradeEd;

        try {
            ControleGrade.getInstance().obterGrade();
            grade = new GradeHoraria(this, true, false);
            grade.setLocationRelativeTo(null);
            grade.setVisible(true);
        } catch (Exception ex) {
            int op = JOptionPane.showConfirmDialog(this, "Nenhuma grade salva! Deseja criar nova grade?", "Atenção", JOptionPane.YES_NO_OPTION);
            if (op == 0) {
                gradeEd = new MontarGradeHoraria(this, true, false);
                gradeEd.setLocationRelativeTo(null);
                gradeEd.setVisible(true);
            }
        }
    }//GEN-LAST:event_GradeButtonActionPerformed

    private void DisciplinasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisciplinasButtonActionPerformed

        ListaDisciplinas lista = new ListaDisciplinas(this, true);
        lista.setLocationRelativeTo(null);
        lista.setVisible(true);
    }//GEN-LAST:event_DisciplinasButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AlunoButton;
    private javax.swing.JButton DisciplinasButton;
    private javax.swing.JButton GradeButton;
    private javax.swing.JButton PdfButton;
    private javax.swing.JLabel jLUnBimg;
    private javax.swing.JLabel jLUniversidadeBrasilia;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
