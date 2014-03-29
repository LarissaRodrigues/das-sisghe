package View;

import Control.ControleManterAluno;

public class MenuAluno extends javax.swing.JDialog {

    public MenuAluno(java.awt.Frame parent, boolean modal, boolean cadastrado) {
        super(parent, modal);

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        setResizable(false);

        initComponents();
        if (ControleManterAluno.getInstance().obterAluno() == null) {
            CadastrarButton.setEnabled(true);
            AlterarButton.setEnabled(false);
            ExcluirButton.setEnabled(false);
        } else {
            CadastrarButton.setEnabled(false);
            AlterarButton.setEnabled(true);
            ExcluirButton.setEnabled(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBDisciplinas = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        CadastrarButton = new javax.swing.JButton();
        AlterarButton = new javax.swing.JButton();
        ExcluirButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();

        jBDisciplinas.setBackground(new java.awt.Color(1, 176, 13));
        jBDisciplinas.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jBDisciplinas.setForeground(new java.awt.Color(254, 254, 254));
        jBDisciplinas.setText("Disciplinas");
        jBDisciplinas.setEnabled(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(169, 243, 132));

        jPanel1.setBackground(new java.awt.Color(169, 243, 132));
        jPanel1.setToolTipText("");

        CadastrarButton.setBackground(new java.awt.Color(1, 176, 13));
        CadastrarButton.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        CadastrarButton.setForeground(new java.awt.Color(254, 254, 254));
        CadastrarButton.setText("Cadastrar");
        CadastrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarButtonActionPerformed(evt);
            }
        });

        AlterarButton.setBackground(new java.awt.Color(1, 176, 13));
        AlterarButton.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        AlterarButton.setForeground(new java.awt.Color(254, 247, 247));
        AlterarButton.setText("Alterar");
        AlterarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlterarButtonActionPerformed(evt);
            }
        });

        ExcluirButton.setBackground(new java.awt.Color(1, 176, 13));
        ExcluirButton.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        ExcluirButton.setForeground(new java.awt.Color(254, 247, 247));
        ExcluirButton.setText("Excluir");
        ExcluirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(65, 19, 136));
        jLabel1.setText("Aluno");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jSeparator3)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(CadastrarButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(AlterarButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(ExcluirButton)))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(CadastrarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(AlterarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(ExcluirButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CadastrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarButtonActionPerformed
        ManterAluno manterAluno = new ManterAluno(new Principal(), true, this, true);
        manterAluno.setLocationRelativeTo(null);
        manterAluno.setVisible(true);
        ManterAluno.materiasSemPreReq.clear();
        ManterAluno.listaA_Cursar.clear();
        ManterAluno.materias.clear();


    }//GEN-LAST:event_CadastrarButtonActionPerformed

    private void AlterarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarButtonActionPerformed
        ManterAluno manterAluno = new ManterAluno(new Principal(), true, this, false);
        manterAluno.setLocationRelativeTo(null);
        manterAluno.setVisible(true);
        
        
    }//GEN-LAST:event_AlterarButtonActionPerformed

    private void ExcluirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirButtonActionPerformed
        DAO.DaoAluno.deleteAluno();
        DAO.DaoGrade.ExcluirGrade();
        DAO.DaoAluno.deserializarAlunoDisciplinas();
        if (ControleManterAluno.getInstance().obterAluno() == null) {
            CadastrarButton.setEnabled(true);
            AlterarButton.setEnabled(false);
            ExcluirButton.setEnabled(false);
        } else {
            CadastrarButton.setEnabled(false);
            AlterarButton.setEnabled(true);
            ExcluirButton.setEnabled(true);
        }

    }//GEN-LAST:event_ExcluirButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton AlterarButton;
    public javax.swing.JButton CadastrarButton;
    public javax.swing.JButton ExcluirButton;
    private javax.swing.JButton jBDisciplinas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
