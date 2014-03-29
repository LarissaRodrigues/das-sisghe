/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Apresentacao;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author larissa
 */
public class ChamaDisciplina extends JFrame{
    
    public ChamaDisciplina(){
        JPanel interfaceD = new InterfaceDisciplinas();
   
        this.add(interfaceD, BorderLayout.CENTER);
        
        JScrollPane scrolled = new JScrollPane(interfaceD);
        scrolled.setRowHeaderView(new JLabel());

        getContentPane().add(scrolled, BorderLayout.CENTER);

        
         pack();
       
         setSize(680, 680);
         setVisible(true);
      
    }   
   
}