import java.util.*;  

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JOptionPane; 
   
public class VectorCalculator{
   
   public static void main(String[] args){
         
      method();
         
   } 
   public static void method(){
      
      JFrame frame = new JFrame("Vector Calculator");
      JPanel panel = new JPanel();   
      panel.setLayout(null);  
   
      frame.setVisible(true);         
      frame.add(panel);
      panel.setPreferredSize(new Dimension(200,300));
     
      frame.pack();
      panel.setVisible(true);
      frame.setLocationRelativeTo(null); 
      
      JButton b1 = new JButton("1");
      b1.setBounds(0,50,50,50);
      JButton b2 = new JButton("2");
      b2.setBounds(50,50,50,50);
      JButton b3 = new JButton("3");
      b3.setBounds(100,50,50,50);  
      JButton b5 = new JButton("4");
      b5.setBounds(0,100,50,50);
      JButton b6 = new JButton("5");
      b6.setBounds(50,100,50,50);
      JButton b7 = new JButton("6");
      b7.setBounds(100,100,50,50);
      JButton b9 = new JButton("7");
      b9.setBounds(0,150,50,50);
      JButton b10 = new JButton("8");
      b10.setBounds(50,150,50,50);
      JButton b11 = new JButton("9");
      b11.setBounds(100,150,50,50);
      JButton b13 = new JButton(",");
      b13.setBounds(0,200,50,50);
      JButton b14 = new JButton("0");
      b14.setBounds(50,200,50,50);
      JButton b15 = new JButton("=");
      b15.setBounds(100,200,50,50);
      JButton b17 = new JButton(".");
      b17.setBounds(150,50,50,50);
      JButton b19 = new JButton("x");
      b19.setBounds(150,100,50,50);
      JButton b20 = new JButton("<");
      b20.setBounds(150,150,50,50);
      JButton b21 = new JButton(">");
      b21.setBounds(150,200,50,50);
      JButton b22 = new JButton("Clear");
      b22.setBounds(0,250,200,50);
      JLabel b23 = new JLabel("");
      b23.setBounds(0,0,200,50);
      
      panel.add(b1);
      panel.add(b2);
      panel.add(b3);
      panel.add(b5);
      panel.add(b6);
      panel.add(b7);
      panel.add(b9);
      panel.add(b10);
      panel.add(b11);
      panel.add(b13);
      panel.add(b14);
      panel.add(b15);
      panel.add(b17);
      panel.add(b19);
      panel.add(b20);
      panel.add(b21);
      panel.add(b22);
      panel.add(b23);
      panel.setVisible(true);
      
      b1.addActionListener(
         new ActionListener(){
            public void actionPerformed(ActionEvent e){
               String text = b1.getLabel();
               b23.setText(b23.getText()+text);
            }
         }
         );
      
      b2.addActionListener(
         new ActionListener(){
            public void actionPerformed(ActionEvent e){
               String text = b2.getLabel();
               b23.setText(b23.getText()+text);
            }
         }
         );
   
      b3.addActionListener(
         new ActionListener(){
            public void actionPerformed(ActionEvent e){
               String text = b3.getLabel();
               b23.setText(b23.getText()+text);
            }
         }
         );
      b13.addActionListener(
         new ActionListener(){
            public void actionPerformed(ActionEvent e){
               String text = b13.getLabel();
               b23.setText(b23.getText()+text);
            }
         }
         );
      b14.addActionListener(
         new ActionListener(){
            public void actionPerformed(ActionEvent e){
               String text = b14.getLabel();
               b23.setText(b23.getText()+text);
            }
         }
         );
      b5.addActionListener(
         new ActionListener(){
            public void actionPerformed(ActionEvent e){
               String text = b5.getLabel();
               b23.setText(b23.getText()+text);
            }
         }
         );
      b6.addActionListener(
         new ActionListener(){
            public void actionPerformed(ActionEvent e){
               String text = b6.getLabel();
               b23.setText(b23.getText()+text);
            }
         }
         );
      b7.addActionListener(
         new ActionListener(){
            public void actionPerformed(ActionEvent e){
               String text = b7.getLabel();
               b23.setText(b23.getText()+text);
            }
         }
         );
      b17.addActionListener(
         new ActionListener(){
            public void actionPerformed(ActionEvent e){
               String text = b17.getLabel();
               b23.setText(b23.getText()+text);
            }
         }
         );
      b9.addActionListener(
         new ActionListener(){
            public void actionPerformed(ActionEvent e){
               String text = b9.getLabel();
               b23.setText(b23.getText()+text);
            }
         }
         );
      b10.addActionListener(
         new ActionListener(){
            public void actionPerformed(ActionEvent e){
               String text = b10.getLabel();
               b23.setText(b23.getText()+text);
            }
         }
         );
      b11.addActionListener(
         new ActionListener(){
            public void actionPerformed(ActionEvent e){
               String text = b11.getLabel();
               b23.setText(b23.getText()+text);
            }
         }
         );
      b19.addActionListener(
         new ActionListener(){
            public void actionPerformed(ActionEvent e){
               String text = b19.getLabel();
               b23.setText(b23.getText()+text);
            }
         }
         );
      
      
      b20.addActionListener(
         new ActionListener(){
            public void actionPerformed(ActionEvent e){
               String text = b20.getLabel();
               b23.setText(b23.getText()+text);
            }
         }
         );
      
      b21.addActionListener(
         new ActionListener(){
            public void actionPerformed(ActionEvent e){
               String text = b21.getLabel();
               b23.setText(b23.getText()+text);
            }
         }
         );
   
      b22.addActionListener(
         new ActionListener(){
            public void actionPerformed(ActionEvent e){
               b23.setText("");
            }
         }
         );
      b15.addActionListener(
         new ActionListener(){
            public void actionPerformed(ActionEvent e){
               String text = b23.getText();
                  
               String[] NoCommaV = text.split("[<>,x.]");
               for(String i : NoCommaV) {
                  System.out.println(i);
               }
               int f1= Integer.parseInt(NoCommaV[1]);
               int f2= Integer.parseInt(NoCommaV[2]);
               int f3= Integer.parseInt(NoCommaV[3]);
                  
               int f4= Integer.parseInt(NoCommaV[6]);
               int f5= Integer.parseInt(NoCommaV[7]);
               int f6= Integer.parseInt(NoCommaV[8]);
               if(text.contains(".")){
                  b23.setText("Dot Product: "+((f1*f4)+(f2*f5)+(f3*f6)));
               }
               if(text.contains("x")){
               
                  b23.setText("Cross Product: "+"<"+(f2*f6-f3*f5)+","+(-(f1*f6-f3*f4))+","+(f1*f5-f2*f4)+">");                                    
               
               
               
               
               }
            
            
            }
         }
         );
   }
}