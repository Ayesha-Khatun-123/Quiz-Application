
package quiz.application;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import javax.swing.JLabel;
import java.awt.event.*;
import java.awt.*;
//import javax.awt.evet.*;


public class Score extends JFrame  implements ActionListener{
    
    Score( String name,int score){
        
        
        setSize(800,680);
        setLocation(400,100);
        getContentPane().setBackground(Color.WHITE);
         setLayout(null);
         
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/ima6.png"));
        //Image i2= i1.getImage().getScaledInstance(300, HEIGHT, WIDTH)
       // ImageIcon i3= new ImageIcon(i2);
      // Image i2=i1.getImage().getScaledInstance(200, 300,Image.)
        JLabel image=new JLabel(i1);
       image.setBounds(20,150,520,500);
       image.setBackground(Color.WHITE);
        add(image);

        
        //for question no
      JLabel  heading=new JLabel(" Thankyou " + name+" for playing Quiz Pro Quo");
        heading.setBounds(45,5, 900, 80);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,25));
        heading.setForeground(Color.BLUE);
        add(heading);
        
          //for question no
      JLabel qiscore=new JLabel(" Your score is="+score);
        qiscore.setBounds(530,180, 500, 100);
        qiscore.setFont(new Font("Viner Hand ITC",Font.PLAIN,29));
        qiscore.setForeground(Color.BLUE);
        add(qiscore);
         
      JButton submit=new JButton("Play Again");
         submit.setBounds(550, 280, 160, 30);
         submit.setFont(new Font("Arial",Font.PLAIN,19));
         submit.setBackground(Color.BLUE);
         submit.setForeground(Color.WHITE);
         submit.addActionListener(this);
         add(submit);
         
         //new Login();
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        setVisible(false);
        new Login();
        
    }
    public static void main(String[]args){
        new Score("user",0);
    }
}
    
