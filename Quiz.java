
package quiz.application;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.JFrame;
import java.awt.event.ActionListener;


public class Quiz extends JFrame  implements ActionListener{
    String questions[][]=new String[10][5];
    String answers[][]=new String[10][2];
    String user_answer[][]=new String[10][1];
    JLabel qno, question;
    ButtonGroup groupoptions;
    JRadioButton op1,op2,op3,op4;
    JButton next,lifeline,submit;
    
    public static int count=0;
    public static int timer=15;
    public static int ans_given=0;
    public static int score=0;
    
     String  name;
     
    Quiz( String name){
        this.name=name;
         setSize(1200,680);
        setLocation(200,100);
        getContentPane().setBackground(Color.WHITE);
         setLayout(null);
         
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/ima5.png"));
        JLabel image=new JLabel(i1);
       image.setBounds(0,0,1200,350);
        add(image);
        
        //for question no
        qno=new JLabel("");
        qno.setBounds(90,300, 100, 180);
        qno.setFont(new Font("Tahoma",Font.PLAIN,17));
        add(qno);
        
        //for questions figure set
        question=new JLabel("");
        question.setBounds(120,300, 1000, 180);
        question.setFont(new Font("Tahoma",Font.PLAIN,17));
        add(question);
        
        questions[0][0] = "What does JDK  stand for.?";
        questions[0][1] = "Java Deploy Kit ";
        questions[0][2] = "Java Development Kit";
        questions[0][3] = "Java Developer Kit";
        questions[0][4] = "Java Developed Kit";

        questions[1][0] = "What does JRE stands for.?";
        questions[1][1] = "Java Runtime Execution";
        questions[1][2] = "Java Runtime Environment";
        questions[1][3] = "Java Run Execution";
        questions[1][4] = "None of the above";

        questions[2][0] = "Who is responsible for executing java programs line by line.?";
        questions[2][1] = "JDK";
        questions[2][2] = "JRE";
        questions[2][3] = "JVM";
        questions[2][4] = "None of the above";

        questions[3][0] = "What is extension of the java code files.?";
        questions[3][1] = ".java";
        questions[3][2] = ".txt";
        questions[3][3] = ".class";
        questions[3][4] = ".js";

        questions[4][0] = "What is the extension of the compiled java classes.?";
        questions[4][1] = ".java";
        questions[4][2] = ".txt";
        questions[4][3] = ".class";
        questions[4][4] = ".js";

        questions[5][0] = "Which of the following commands is used to compile java code.?";
        questions[5][1] = "javac file_Name.java";
        questions[5][2] = "javac file_Name";
        questions[5][3] = "java file_Name";
        questions[5][4] = "java file_Name.java";

        questions[6][0] = "How many types of  comments are available in java.?";
        questions[6][1] = "1";
        questions[6][2] = "2";
        questions[6][3] = "3";
        questions[6][4] = "4";

        questions[7][0] = "In java, jar stands for?";
        questions[7][1] = "Java Archive Runner";
        questions[7][2] = "Java Archive";
        questions[7][3] = "Java Application Resource";
        questions[7][4] = "Java Application Runner";

        questions[8][0] = "What is the default value of int data type?";
        questions[8][1] = "2";
        questions[8][2] = "0";
        questions[8][3] = "1";
        questions[8][4] = "0.0";

        questions[9][0] = "Which of the following option leads to the portability and security of Java?";
        questions[9][1] = "Bytecode is executed by JVM";
        questions[9][2] = "The applet makes the Java code secure and portable";
        questions[9][3] = "Use of exception handling";
        questions[9][4] = "Dynamic binding between objects";
        
        
        
        answers[0][1] = "Java Development Kit";
        answers[1][1] = "Java Runtime Environment";
        answers[2][1] = "JVM";
        answers[3][1] = ".java";
        answers[4][1] = ".class";
        answers[5][1] = "javac file_Name.java";
        answers[6][1] = "3";
        answers[7][1] = "Java Archive";
        answers[8][1] = "0";
        answers[9][1] = "Bytecode is executed by JVM";
        

         op1=new JRadioButton("");
         op1.setBounds(120,430,700,20);
         op1.setFont(new Font("Dialog",Font.PLAIN,17));
         op1.setBackground(Color.WHITE);
         add(op1);
         
         op2=new JRadioButton("");
         op2.setBounds(120,460,700,20);
         op2.setFont(new Font("Dialog",Font.PLAIN,17));
         op2.setBackground(Color.WHITE);
         add(op2);
         
          op3=new JRadioButton("");
         op3.setBounds(120,490,700,20);
         op3.setFont(new Font("Dialog",Font.PLAIN,17));
         op3.setBackground(Color.WHITE);
         add(op3);
         
         op4=new JRadioButton("");
         op4.setBounds(120,520,700,20);
         op4.setFont(new Font("Dialog",Font.PLAIN,17));
         op4.setBackground(Color.WHITE);
         add(op4);

        
         
         groupoptions=new ButtonGroup();
         groupoptions.add(op1);
         groupoptions.add(op2);
         groupoptions.add(op3);
         groupoptions.add(op4);
         
          next=new JButton("Next");
         next.setBounds(900, 450, 160, 30);
         next.setFont(new Font("Tahoma",Font.PLAIN,19));
         next.setBackground(Color.BLUE);
         next.setForeground(Color.WHITE);
         next.addActionListener(this);
         add(next);
         
         
         submit=new JButton("Submit");
         submit.setBounds(900, 500, 160, 30);
         submit.setFont(new Font("Tahoma",Font.PLAIN,19));
         submit.setBackground(Color.BLUE);
         submit.setForeground(Color.WHITE);
         submit.setEnabled(false);
         submit.addActionListener(this);
         add(submit);
         
         start(count);
        
        setVisible(true);
    }
    
    //for next bottom
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==next){
        
        repaint();
        
        ans_given=1;
            
            if(groupoptions.getSelection()== null){
                   user_answer[count][0]="";
                }
                 else{
                     user_answer[count][0]= groupoptions.getSelection().getActionCommand();
                 }
            
             if(count==8){
                
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            count++;
            start(count);
    }
        else if(ae.getSource()==submit){
            ans_given=1;
            if(groupoptions.getSelection()== null){
                      user_answer[count][0]="";
                  }
                  else{
                      user_answer[count][0]= groupoptions.getSelection().getActionCommand();
                  }
                      for(int i=0;i<user_answer.length;i++){
                          if(user_answer[i][0].equals(answers[i][1])){
                              score+=10;
                              
                          }
                          
                      }
                      setVisible(false);
                      new Score(name,score);
        }
         
    }
    
    // for timer...
    
   public void paint(Graphics g) //graphics class
   {
       super.paint(g); 
       String time="Time left -" +timer+ " seconds";
       g.setColor(Color.RED);
        g.setFont(new Font("Tahoma",Font.BOLD,20));
     
        
        if(timer>0){
            g.drawString(time,880,430);
        }
        else{
            g.drawString("Times up!!",930,430);
        }
        timer--;
              try{
                  Thread.sleep(1000); // try class under sleep method
                  
                  repaint();
              }
              catch(Exception e)
              {
                  e.printStackTrace();
              }
              
              if(ans_given==1){
                  ans_given=0;
                  timer=15;
              }
              else if(timer<0){
                  timer=15;
                  
                  if(count==9){ //submit buttton
                      ans_given=1;
                      
                       if(groupoptions.getSelection()== null){
                      user_answer[count][0]="";
                  }
                  else{
                      user_answer[count][0]= groupoptions.getSelection().getActionCommand();
                  }
                      for(int i=0;i<user_answer.length;i++){
                          if(user_answer[i][0].equals(answers[i][1])){
                              score+=10;
                              
                          }
                          
                      }
                      setVisible(false);
                      new Score(name,score);
                     
                    
                         
                      
                  }
                  else  //next button
                  {
                      if(groupoptions.getSelection()== null){
                      user_answer[count][0]="";
                  }
                  else{
                      user_answer[count][0]= groupoptions.getSelection().getActionCommand();
                  }
                  count++;
                  start(count);
                      
                  }
                      
                  }
                  
   }
   
   //for question and answer set..
    
    public void start(int count){
        qno.setText(""+ (count+1)+".");
        question.setText(questions[count][0]);
        
        op1.setText(questions[count][1]);
        op1.setActionCommand(questions[count][1]);
        
        op2.setText(questions[count][2]);
        op2.setActionCommand(questions[count][2]);
        
        op3.setText(questions[count][3]);
        op3.setActionCommand(questions[count][3]);
        
        op4.setText(questions[count][4]);
        op4.setActionCommand(questions[count][4]);
        groupoptions.clearSelection();
  }
    
    
    public static void main(String[]args){
                 new Quiz("user");
        
    }
    
}
