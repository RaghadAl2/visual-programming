package com.mycompany.userpage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class LoginPage extends JFrame implements ActionListener{
    private JLabel l1,l2;
    private JTextField t1,t2;
    private JButton b1,b2;
    
    public LoginPage()
    {
        this.setTitle("Login Page");
        this.setLocation(300,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel p=(JPanel)this.getContentPane();
        
        l1=new JLabel("Login");
        t1=new JTextField(12);
        l2=new JLabel("Password");
        t2=new JTextField(12);
       
        JPanel p1= new JPanel(new GridLayout(2,2));
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        
        b1= new JButton("Enter");
        b2= new JButton("Cancel");
        JPanel p2= new JPanel();
        p2.add(b1);
        p2.add(b2);
        
        
        p.add(p1,BorderLayout.CENTER);
        p.add(p2,BorderLayout.SOUTH);

        this.pack();
        this.setVisible(true);
        
        b1.addActionListener(this);
        
    }
    public void actionPerformed( ActionEvent e ){
        
        Project n=new Project("User");
    }
}

    

