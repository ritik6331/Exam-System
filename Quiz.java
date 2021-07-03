
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Quiz implements ActionListener{
    JFrame jf;
    JLabel jl;
    JRadioButton jr[]=new JRadioButton[5];
    JButton b1,b2;  
    ButtonGroup bg;
     int current=0;
     int count=0; 
    Quiz(String s){
        jf=new JFrame();
        jf.setSize(500,500);
        jf.setDefaultCloseOperation(3);
        jl=new JLabel();
        jl.setBounds(30,40,450,20);  
        jf.add(jl);
        bg=new ButtonGroup();
        for(int i=0;i<5;i++){
            jr[i]=new JRadioButton();
            jf.add(jr[i]);
            jf.add(jr[i]);
        }
        //set();
        b1=new JButton("Next"); 
        b1.addActionListener(this); 
        jf.add(b1);
        b2=new JButton("Cancel");  
        b2.addActionListener(this);  
        jf.add(b2);
        jf.add(jl);
       // set();  
        jr[0].setBounds(50,80,100,20);  
        jr[1].setBounds(50,110,100,20);  
        jr[2].setBounds(50,140,100,20);  
        jr[3].setBounds(50,170,100,20);  
        b1.setBounds(100,240,100,30);  
        b2.setBounds(270,240,100,30);  
        jf.setLayout(null);  
        jf.setLocation(250,100); 
        set();
        jf.setVisible(true);
    }
    
    public static void main(String[] args) {
        Quiz q=new Quiz("Online Test Of Class");
    }

   @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1)  
        {  
            if(check())  
                count=count+1;  
            current++;  //question number increase;
            set();    
            if(current==9)  
            {  
                b1.setEnabled(false);  
                b2.setText("Result");  
            }  
        }  
        if(e.getActionCommand().equals("Cancel")){
             System.exit(0);
        }
        if(e.getActionCommand().equals("Result"))  
        {  
            if(check())  
                count=count+1;  
            current++;  
            //System.out.println("correct ans="+count);  
            JOptionPane.showMessageDialog(jf,"correct ans="+count);  
            System.exit(0);  
        }  
    }
    void set()  
    {  
        jr[4].setSelected(true);  
        if(current==0)  
        {  
            jl.setText("Que1: Which one among these is not a primitive datatype?");  
            jr[0].setText("int");
            jr[1].setText("Float");
            jr[2].setText("boolean");
            jr[3].setText("char");   
        }  
        if(current==1)  
        {  
            jl.setText("Que2: Which class is available to all the class automatically?");  
            jr[0].setText("Swing");
            jr[1].setText("Applet");
            jr[2].setText("Object");
            jr[3].setText("ActionEvent");  
        }  
        if(current==2)  
        {  
            jl.setText("Que3: Which package is directly available to our class without importing it?");  
            jr[0].setText("swing");
            jr[1].setText("applet");
            jr[2].setText("net");
            jr[3].setText("lang");  
        }  
        if(current==3)  
        {  
            jl.setText("Que4: String class is defined in which package?");  
            jr[0].setText("lang");
            jr[1].setText("Swing");
            jr[2].setText("Applet");
            jr[3].setText("awt");  
        }  
        if(current==4)  
        {  
            jl.setText("Que5: Which institute is best for java coaching?");  
            jr[0].setText("Utek");
            jr[1].setText("Aptech");
            jr[2].setText("SSS IT");
            jr[3].setText("jtek");  
        }  
        if(current==5)  
        {  
            jl.setText("Que6: Which one among these is not a keyword?");  
            jr[0].setText("class");
            jr[1].setText("int");
            jr[2].setText("get");
            jr[3].setText("if");  
        }  
        if(current==6)  
        {  
            jl.setText("Que7: Which one among these is not a class? ");  
            jr[0].setText("Swing");
            jr[1].setText("Actionperformed");
            jr[2].setText("ActionEvent");  
             jr[3].setText("Button");  
        }  
        if(current==7)  
        {  
jl.setText("Que8: which one among these is not a function of Object class?");  
            jr[0].setText("toString");
            jr[1].setText("finalize");
            jr[2].setText("equals");  
                        jr[3].setText("getDocumentBase");         
        }  
        if(current==8)  
        {  
            jl.setText("Que9: which function is not present in Applet class?");  
            jr[0].setText("init");
            jr[1].setText("main");
            jr[2].setText("start");
            jr[3].setText("destroy");  
        }  
        if(current==9)  
        {  
            jl.setText("Que10: Which one among these is not a valid component?");  
            jr[0].setText("JButton");
            jr[1].setText("JList");
            jr[2].setText("JButtonGroup");  
            jr[3].setText("JTextArea");  
        }  
        jl.setBounds(30,40,450,20);  
        for(int i=0,j=0;i<=90;i+=30,j++)  
            jr[j].setBounds(50,80+i,200,20);  
    }  
     boolean check()  
    {  
        if(current==0)  
            return(jr[1].isSelected());  
        if(current==1)  
            return(jr[2].isSelected());  
        if(current==2)  
            return(jr[3].isSelected());  
        if(current==3)  
            return(jr[0].isSelected());  
        if(current==4)  
            return(jr[2].isSelected());  
        if(current==5)  
            return(jr[2].isSelected());  
        if(current==6)  
            return(jr[1].isSelected());  
        if(current==7)  
            return(jr[3].isSelected());  
        if(current==8)  
            return(jr[1].isSelected());  
        if(current==9)  
            return(jr[2].isSelected());  
        return false;  
    }  

    private void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
