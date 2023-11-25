
package com.mycompany.userpage;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class Project extends JFrame implements ActionListener {
    
    private JLabel l1;
    private JButton b1, b2;

    public Project(String title){
        super(title);
        //this.setSize(500, 500);
        this.setLocation(400, 400);
          
        l1= new JLabel("Choose please:");
       
        b1= new JButton("Admin");
        b2= new JButton("User");
 
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        JPanel p= (JPanel)this.getContentPane();
        //p.setLayout(new GridLayout(2, 1));
        
        JPanel j1= new JPanel(); 
        JPanel j2= new JPanel();
        
        j1.add(l1);
        
        j2.add(b1); 
        j2.add(b2);
        
        p.add(j1, BorderLayout.NORTH);
        p.add(j2, BorderLayout.SOUTH);
        
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
      
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton bt= (JButton) e.getSource(); /***/
        if(bt==b1){
        AdminPage page = new AdminPage("Text Editor");
        }
        else{
        UserPage page = new UserPage("Text Editor");
        }
    }              
     

    
    
} 

