
package quiz.application;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Rules extends JFrame implements ActionListener {
    String name;
    JButton start ,back;
     Rules( String name)
     {
        this.name = name;
         getContentPane().setBackground(Color.WHITE);
         setLayout(null);
         
         JLabel heading=new JLabel( "Welcome "+name +" to Quiz Pro Quo");
        heading.setBounds(50 ,20, 900, 30);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,30));
        heading.setForeground(Color.BLUE);
        add(heading);
        
        
        JLabel rules=new JLabel();
        rules.setBounds(20 ,70, 700, 380);
        rules.setFont(new Font("Tahoma",Font.PLAIN,20)); 
        rules.setText(
                
                
     "<html>"+
            
       " 2. Clearly state that cheating or using external resources is not allowed " + "<br><br>" +
       " 1.Set a clear deadline for participants to submit their answers"  + "<br><br>" +
       " 2.There shall be no negative markings for a wrong answer"+ "<br><br>" +
       " 3.10 questions shall be fired  one after the  another" + "<br><br>" +
       " 4. Explain how points will be awarded (and if there are penalties for incorrect answers)" + "<br><br>" +
       " 5.Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
       " 6. You may have lot of options in every questions " + "<br><br>" +
      "  7. Good Luck for your quiz contest" + "<br><br>" +
   "<html>"
        

     );
     add(rules);
     
       start =new JButton("Start");
        start.setBounds(200, 500,100, 30);
        start.setBackground(Color.BLUE);
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
         back=new JButton("Back");
        back.setBounds(450, 500,100, 30);
        back.setBackground(Color.BLUE);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
         
         setSize(800,650);
         setLocation(350,100);
        setVisible(true);
    }
     
       public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== start)
        {
            
            setVisible(false);
            new Quiz(name);
        
           
        }
        else if(ae.getSource()== back)
        {
            setVisible(false);
            new Login();
        }
        
     
}
    
    

 public static void main(String[]args){
     new Rules("User");
        
    }
}
