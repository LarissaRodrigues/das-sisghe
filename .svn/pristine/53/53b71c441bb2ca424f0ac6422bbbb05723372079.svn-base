package View;

import Business.GradeBusiness;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Beatriz e Felipe
 */
public class GradeHoraria extends javax.swing.JDialog {

    public GradeHoraria(java.awt.Frame parent, boolean modal, boolean novaGrade) {
        super(parent, modal);
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GradeHoraria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GradeHoraria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GradeHoraria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GradeHoraria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        setResizable(false);
        initComponents();

        try {

            GradeBusiness.getInstance().abrirGrade();

        } catch (Exception ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        menuBar2 = new java.awt.MenuBar();
        menu3 = new java.awt.Menu();
        menu4 = new java.awt.Menu();
        choice1 = new java.awt.Choice();
        Editar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        gradeHoraria = new javax.swing.JTable();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        menu3.setLabel("File");
        menuBar2.add(menu3);

        menu4.setLabel("Edit");
        menuBar2.add(menu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Editar.setText("Editar");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder("Grade Horária"));

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
            gradeHoraria.setCellSelectionEnabled(true);
            gradeHoraria.setRowHeight(35);
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

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(Editar)))
                    .addContainerGap())
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(Editar)
                    .addContainerGap())
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed

        this.dispose();
        MontarGradeHoraria ed = new MontarGradeHoraria(null, true, true);
        ed.setLocationRelativeTo(null);
        ed.setVisible(true);
        

    }//GEN-LAST:event_EditarActionPerformed

    public static void preencheGrade(Object valor, int coluna, int linha) {

        gradeHoraria.setValueAt(valor, linha, coluna);

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Editar;
    private java.awt.Choice choice1;
    private static javax.swing.JTable gradeHoraria;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.Menu menu3;
    private java.awt.Menu menu4;
    private java.awt.MenuBar menuBar1;
    private java.awt.MenuBar menuBar2;
    // End of variables declaration//GEN-END:variables
}
