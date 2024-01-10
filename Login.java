
package quiz.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Login  extends JFrame implements ActionListener{
    JButton rules,back;
    JTextField tfield;
    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/ima4.png"));
        JLabel image=new JLabel(i1);
       image.setBounds(0,0,700,650);
        add(image);
        
        JLabel heading=new JLabel("Quiz Pro Quo");
        heading.setBounds(800 ,60, 400, 50);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
        heading.setForeground(Color.BLUE);
        add(heading);
        
         JLabel name=new JLabel("Enter your name");
        name.setBounds(850 ,60, 300, 200);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD,25));
        name.setForeground(Color.BLUE);
        add(name);
        
        tfield=new JTextField();
        tfield.setBounds(800, 210,290,25);
         tfield.setFont(new Font("Mongolian Baiti",Font.BOLD,20));
        add(tfield);
        
        
         rules=new JButton("Rules");
        rules.setBounds(800, 300,100, 30);
        rules.setBackground(Color.BLUE);
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
         back=new JButton("Back");
        back.setBounds(995, 300,100, 30);
        back.setBackground(Color.BLUE);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        
       
        setSize(1200,600);
        setLocation(200,150);
        setVisible(true);  // here setvisible is a one type of function
        
    }
    
    //interface unimplement method over ride
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== rules)
        {
            String name=tfield.getText();
            setVisible(false);
            new Rules(name);
            
        }
        else if(ae.getSource()== back)
        {
            setVisible(false);
        }
        
     
}
    public static void main(String[]args){
        new Login();
    }
    
}
