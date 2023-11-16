
package com.mycompany.userpage;



import java.awt.*;
import javax.swing.*;


public class UserPage extends JFrame{
    
    private JLabel l1;
    private JTextField t1;
    private JTextArea t2;
    private JButton b1, b2, b3;
    
    public UserPage(String title){
        super(title);
        //this.setSize(500, 500);
        this.setLocation(200, 400);
        
        
        
        l1= new JLabel("Title:");
        
        t1= new JTextField(15);
        t2= new JTextArea(15, 30);
        
        b1= new JButton("Save");
        b2= new JButton("Search");
        b3= new JButton("Clear");
        
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);
        setJMenuBar(menuBar);
        
        JPanel p= (JPanel)this.getContentPane();
        //p.setLayout(new GridLayout(3, 1));
        
        JPanel j1= new JPanel(); 
        JPanel j2= new JPanel(); 
        JPanel j3= new JPanel(); 
        
        j1.add(l1);
        j1.add(t1);
        
        j2.add(t2); 
        
        j3.add(b1); 
        j3.add(b2);
        j3.add(b3);
        

        
        p.add(j1, BorderLayout.NORTH);
        p.add(j2, BorderLayout.CENTER);
        p.add(j3, BorderLayout.SOUTH);
        
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
      UserPage page = new UserPage("Text Editor");
      
    }}
