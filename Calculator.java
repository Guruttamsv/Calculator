package Assignment0;

import javax.swing.*;
import java.awt.*; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;

class Calculator extends JFrame implements ActionListener
{  
	static JLabel l1, l2, l3, l4, l5, l6, l7 ,l8;
	static String textbox1="";
	static String textbox2="";
    static JFrame f;
    static JPanel p; 
    static int i=0;
    static String ans="";

    static JTextField mbox;
        @SuppressWarnings("deprecation")
    	public static void mainbox()
        {
        	try { 
                // set look and feel 
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); 
            } 
            catch (Exception e) { 
                System.err.println(e.getMessage()); 
                }
        	Calculator c = new Calculator();     
        	f = new JFrame();
        	mbox = new JTextField();
        	mbox.setEditable(false); 
        	mbox.setFont(new Font("Arial", Font.BOLD, 15));
        	mbox.setBounds(10, 10, 367, 87);
        	mbox.setColumns(17);
        	
        	p = new JPanel();
    		
        	JButton b1, b2, b3, b4, b5, b6, b7, b8;
        	
        	

             b1 = new JButton("TASK1"); 
             b2 = new JButton("TASK2"); 
             b3 = new JButton("TASK3"); 
             b4 = new JButton("TASK4"); 
             b5 = new JButton("TASK5"); 
             b6 = new JButton("TASK6"); 
             b7 = new JButton("TASK7"); 
             b8 = new JButton("TASK8"); 

             b1.setFont(new Font("Tahoma", Font.BOLD, 21));
             b2.setFont(new Font("Tahoma", Font.BOLD, 21));
             b3.setFont(new Font("Tahoma", Font.BOLD, 21));
             b4.setFont(new Font("Tahoma", Font.BOLD, 21));
             b5.setFont(new Font("Tahoma", Font.BOLD, 21));
             b6.setFont(new Font("Tahoma", Font.BOLD, 21));
             b7.setFont(new Font("Tahoma", Font.BOLD, 21));
             b8.setFont(new Font("Tahoma", Font.BOLD, 21));
             
     		 b1.setBounds(10, 114, 61, 57);
     		 b2.setBounds(10, 114, 61, 57);
     		 b3.setBounds(10, 114, 61, 57);
     		 b4.setBounds(10, 114, 61, 57);
     		 b5.setBounds(10, 114, 61, 57);
     		 b6.setBounds(10, 114, 61, 57);
     		 b7.setBounds(10, 114, 61, 57);
     		 b8.setBounds(10, 114, 61, 57);
     		
             
             b8.addActionListener(c); 
             b7.addActionListener(c); 
             b6.addActionListener(c); 
             b5.addActionListener(c); 
             b4.addActionListener(c); 
             b3.addActionListener(c); 
             b2.addActionListener(c); 
             b1.addActionListener(c); 

             
             p.add(mbox); 
             p.add(b1); 
             p.add(b2); 
             p.add(b3); 
             p.add(b4); 
             p.add(b5); 
             p.add(b6); 
             p.add(b7); 
             p.add(b8); 
             
            

             p.setBackground(Color.gray); 
             f.add(p); 
             f.setSize(245, 240); 
             f.show(); 
     		 f.setVisible(true);
     		 
     		System.out.println("TASK1 : Addition, subtraction, multiplication, and division of two number ");
     		System.out.println("TASK2 : Power, modulo, and square/cube roots");
     		System.out.println("TASK3 : Conversions between temperature units (Celsius/Fahrenheit) ");
     		System.out.println("TASK4 : Conversions between Metric and Imperial units for mass (g/oz) and length (cm/inches)");
     		System.out.println("TASK5 : Conversion of a decimal number to binary");
     		System.out.println("TASK6 : Conversion of a binary number to decimal");
     		System.out.println("TASK7 : Conversion of a decimal number to hexadecimal");
     		System.out.println("TASK8 : Conversion of a hexadecimal number to decimal ");
     		
         } 
		
        static JTextField t6k;
        public static void Task6Keypad()
        {
    	try { 
            // set look and feel 
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); 
        } 
        catch (Exception e) { 
            System.err.println(e.getMessage()); 
            }
    	Calculator c = new Calculator();     
    	f = new JFrame();
    	t6k = new JTextField(16);
    	t6k.setEditable(false); 
    	
    	p = new JPanel();
		
    	JButton b0, b1, clear, sub;
    	
    	 b0 = new JButton("0"); 
         b1 = new JButton("1"); 
         clear = new JButton("AC");
         sub= new JButton("SUBMIT");
         
     
         b1.addActionListener(c); 
         clear.addActionListener(c);
         b0.addActionListener(c); 
         sub.addActionListener(c);  
         
         p.add(t6k); 
         p.add(b1); 
         p.add(b0); 
         p.add(clear);
         p.add(sub); 

         b0.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("0");t6k.setText(textbox1);}});
         b1.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("1");t6k.setText(textbox1);}});
         
         clear.addActionListener(e -> {
      	   textbox1="";
      	   t6k.setText(textbox1);
      	});
         
         sub.addActionListener(e -> {
        	   ans=task6(textbox1);
        	   textbox1="";
        	   f.dispose();
        	});

         p.setBackground(Color.gray); 
         f.add(p); 
         f.setSize(180, 220); 
         f.show(); 
 		 f.setVisible(true);
 		 
 		 System.out.println("Input number by clicking on buttons.");
 		System.out.println("Submit: Get the result.");
 		System.out.println("AC : All Clear.");
     } 
        
        static JTextField t7k;
        public static void Task7Keypad()
            {
            	try { 
                    // set look and feel 
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); 
                } 
                catch (Exception e) { 
                    System.err.println(e.getMessage()); 
                    }
            	Calculator c = new Calculator();     
            	f = new JFrame();
            	t7k = new JTextField(16);
            	t7k.setEditable(false); 
            	
            	p = new JPanel();
        		
            	JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, clear, sub;
            	
            	 b0 = new JButton("0"); 
                 b1 = new JButton("1"); 
                 b2 = new JButton("2"); 
                 b3 = new JButton("3"); 
                 b4 = new JButton("4"); 
                 b5 = new JButton("5"); 
                 b6 = new JButton("6"); 
                 b7 = new JButton("7"); 
                 b8 = new JButton("8"); 
                 b9 = new JButton("9"); 
                 clear = new JButton("AC");
                 sub= new JButton("SUBMIT");
                 
                 b9.addActionListener(c); 
                 b8.addActionListener(c); 
                 b7.addActionListener(c); 
                 b6.addActionListener(c); 
                 b5.addActionListener(c); 
                 b4.addActionListener(c); 
                 b3.addActionListener(c); 
                 b2.addActionListener(c); 
                 b1.addActionListener(c); 
                 b0.addActionListener(c); 
                 clear.addActionListener(c);
                 sub.addActionListener(c);  
                 
                 p.add(t7k); 
                 p.add(b1); 
                 p.add(b2); 
                 p.add(b3); 
                 p.add(b4); 
                 p.add(b5); 
                 p.add(b6); 
                 p.add(b7); 
                 p.add(b8); 
                 p.add(b9); 
                 p.add(b0); 
                 p.add(clear);
                 p.add(sub); 

                 b1.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("1");t7k.setText(textbox1);}});
                 b2.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("2");t7k.setText(textbox1);}});
                 b3.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("3");t7k.setText(textbox1);}});
                 b4.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("4");t7k.setText(textbox1);}});
                 b5.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("5");t7k.setText(textbox1);}});
                 b6.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("6");t7k.setText(textbox1);}});
                 b7.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("7");t7k.setText(textbox1);}});
                 b8.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("8");t7k.setText(textbox1);}});
                 b9.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("9");t7k.setText(textbox1);}});
                 b0.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("0");t7k.setText(textbox1);}});
                 

                 clear.addActionListener(e -> {
                	 textbox1="";
                	 t7k.setText(textbox1);
                 });
                 
                 sub.addActionListener(e -> {
                	 ans=task7(textbox1);
                	 textbox1="";
                	   f.dispose();
                	});

                 p.setBackground(Color.gray); 
                 f.add(p); 
                 f.setSize(180, 220); 
                 f.show(); 
         		 f.setVisible(true);
         		 
         		 System.out.println("Input number by clicking on buttons.");
          		System.out.println("Submit: Get the result.");
          		System.out.println("AC : All Clear.");
             } 
        
        static JTextField tc1;
        static JTextField tc2;
        public static void Task1Keypad()
        {
        	try { 
                // set look and feel 
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); 
            } 
            catch (Exception e) { 
                System.err.println(e.getMessage()); 
                }
        	Calculator c = new Calculator(); 
        	f = new JFrame();
        	tc1 = new JTextField(8);
        	tc1.setEditable(false); 
        	tc2 = new JTextField(8);
        	tc2.setEditable(false); 
        	
        	p = new JPanel();
    		
        	JButton clear, b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, badd, bmin, bmult, bdiv, dot, nxt;
        	
        	 b0 = new JButton("0"); 
             b1 = new JButton("1"); 
             b2 = new JButton("2"); 
             b3 = new JButton("3"); 
             b4 = new JButton("4"); 
             b5 = new JButton("5"); 
             b6 = new JButton("6"); 
             b7 = new JButton("7"); 
             b8 = new JButton("8"); 
             b9 = new JButton("9"); 
             dot = new JButton(".");
             nxt = new JButton("-->");
             badd= new JButton("+");
             bmin= new JButton("-");
             bmult= new JButton("*");
             bdiv= new JButton("/");
             clear = new JButton("AC");

             b9.addActionListener(c); 
             b8.addActionListener(c); 
             b7.addActionListener(c); 
             b6.addActionListener(c); 
             b5.addActionListener(c); 
             b4.addActionListener(c); 
             b3.addActionListener(c); 
             b2.addActionListener(c); 
             b1.addActionListener(c); 
             b0.addActionListener(c); 
             nxt.addActionListener(c);
             dot.addActionListener(c); 
             badd.addActionListener(c);  
             bmin.addActionListener(c);
             bmult.addActionListener(c);
             bdiv.addActionListener(c);
             clear.addActionListener(c);

             p.add(tc1);
             p.add(tc2);
             p.add(b1); 
             p.add(b2); 
             p.add(b3); 
             p.add(b4); 
             p.add(b5); 
             p.add(b6); 
             p.add(b7); 
             p.add(b8); 
             p.add(b9); 
             p.add(dot); 
             p.add(b0);
             p.add(nxt);
             p.add(clear);
             p.add(badd);
             p.add(bmin);
    	 	 p.add(bmult);
    	 	 p.add(bdiv); 
    	 	
    	 	 
    	 	nxt.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {i=1;}	}); 
    	 	
    	 	b1.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {if(i==0) {textbox1 =textbox1.concat("1");tc1.setText(textbox1);}else {textbox2 =textbox2.concat("1");tc2.setText(textbox2);}}});
    	 	b2.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {if(i==0) {textbox1 =textbox1.concat("2");tc1.setText(textbox1);}else {textbox2 =textbox2.concat("2");tc2.setText(textbox2);}}});
    	 	b3.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {if(i==0) {textbox1 =textbox1.concat("3");tc1.setText(textbox1);}else {textbox2 =textbox2.concat("3");tc2.setText(textbox2);}}});
    	 	b4.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {if(i==0) {textbox1 =textbox1.concat("4");tc1.setText(textbox1);}else {textbox2 =textbox2.concat("4");tc2.setText(textbox2);}}});
    	 	b5.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {if(i==0) {textbox1 =textbox1.concat("5");tc1.setText(textbox1);}else {textbox2 =textbox2.concat("5");tc2.setText(textbox2);}}});
    	 	b6.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {if(i==0) {textbox1 =textbox1.concat("6");tc1.setText(textbox1);}else {textbox2 =textbox2.concat("6");tc2.setText(textbox2);}}});
    	 	b7.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {if(i==0) {textbox1 =textbox1.concat("7");tc1.setText(textbox1);}else {textbox2 =textbox2.concat("7");tc2.setText(textbox2);}}});
    	 	b8.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {if(i==0) {textbox1 =textbox1.concat("8");tc1.setText(textbox1);}else {textbox2 =textbox2.concat("8");tc2.setText(textbox2);}}});
    	 	b9.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {if(i==0) {textbox1 =textbox1.concat("9");tc1.setText(textbox1);}else {textbox2 =textbox2.concat("9");tc2.setText(textbox2);}}});
    	 	b0.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {if(i==0) {textbox1 =textbox1.concat("0");tc1.setText(textbox1);}else {textbox2 =textbox2.concat("0");tc2.setText(textbox2);}}});
    	 	dot.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {if(i==0) {textbox1 =textbox1.concat(".");tc1.setText(textbox1);}else {textbox2 =textbox2.concat(".");tc2.setText(textbox2);}}});
    	 	i=0;
    	 	
    	 	clear.addActionListener(e -> {
    	      	   textbox1="";
    		   textbox2="";
    		   tc1.setText(textbox1);
    		   tc2.setText(textbox2);
    		   i=0;
    	      	});
    	 	
    	 	badd.addActionListener(e -> {
    	 		ans=task1 ('a', textbox1, textbox2);
    	 		textbox1="";
    	 		textbox2="";
    	 		f.dispose();
          	});
             bmin.addActionListener(e -> {
            	ans=task1 ('b', textbox1, textbox2);
     	 		textbox1="";
     	 		textbox2="";
     	 		f.dispose();
          	});
    	 	bmult.addActionListener(e -> {
    	 		ans=task1 ('c', textbox1, textbox2);
    	 		textbox1="";
    	 		textbox2="";
    	 		f.dispose();
          	});
    	 	bdiv.addActionListener(e -> {
    	 		ans=task1 ('a', textbox1, textbox2);
    	 		textbox1="";
    	 		textbox2="";
    	 		f.dispose();
          	});

             p.setBackground(Color.gray); 
             f.add(p); 
             f.setSize(180, 240); 
             f.show(); 
     		 f.setVisible(true);
        
     		 System.out.println("Input number in the first box by clicking on buttons.");
     		 System.out.println("click on --> and enter number on next box.");
       		 System.out.println("+-*/: Get the appropriate result by clicking on operator.");
       		 System.out.println("AC : All Clear.");
        
        }
        
        static JTextField kep;
        public static void Task5Keypad()
        {
        	try { 
                // set look and feel 
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); 
            } 
            catch (Exception e) { 
                System.err.println(e.getMessage()); 
                }
        	Calculator c = new Calculator();     
        	f = new JFrame();
        	kep = new JTextField(16);
        	kep.setEditable(false); 
        	
        	p = new JPanel();
    		
        	JButton clear, b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, sub;
        	
        	 b0 = new JButton("0"); 
             b1 = new JButton("1"); 
             b2 = new JButton("2"); 
             b3 = new JButton("3"); 
             b4 = new JButton("4"); 
             b5 = new JButton("5"); 
             b6 = new JButton("6"); 
             b7 = new JButton("7"); 
             b8 = new JButton("8"); 
             b9 = new JButton("9"); 
             clear = new JButton("AC");
             sub= new JButton("SUBMIT");
             
             b9.addActionListener(c); 
             b8.addActionListener(c); 
             b7.addActionListener(c); 
             b6.addActionListener(c); 
             b5.addActionListener(c); 
             b4.addActionListener(c); 
             b3.addActionListener(c); 
             b2.addActionListener(c); 
             b1.addActionListener(c); 
             b0.addActionListener(c);  
             clear.addActionListener(c);
             sub.addActionListener(c);  
             
             p.add(kep); 
             p.add(b1); 
             p.add(b2); 
             p.add(b3); 
             p.add(b4); 
             p.add(b5); 
             p.add(b6); 
             p.add(b7); 
             p.add(b8); 
             p.add(b9); 
             p.add(b0); 
             p.add(clear);
             p.add(sub); 
             
             b1.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("1");kep.setText(textbox1);}});
             b2.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("2");kep.setText(textbox1);}});
             b3.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("3");kep.setText(textbox1);}});
             b4.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("4");kep.setText(textbox1);}});
             b5.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("5");kep.setText(textbox1);}});
             b6.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("6");kep.setText(textbox1);}});
             b7.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("7");kep.setText(textbox1);}});
             b8.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("8");kep.setText(textbox1);}});
             b9.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("9");kep.setText(textbox1);}});
             b0.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("0");kep.setText(textbox1);}});
            
             
             sub.addActionListener(e -> {
            	 ans=task5(textbox1);
            	 textbox1="";
            	   f.dispose();
            	});
             

             clear.addActionListener(e -> {
            	 textbox1="";
            	 kep.setText(textbox1);
             });

             p.setBackground(Color.gray); 
             f.add(p); 
             f.setSize(160, 220); 
             f.show(); 
     		 f.setVisible(true);
     		 
     		 System.out.println("Input number by clicking on buttons.");
      		 System.out.println("Submit : Get the result.");
      		 System.out.println("AC : All Clear.");
         } 
        
        static JTextField t8k;
            @SuppressWarnings("deprecation")
        public static void Task8Keypad()
            {
            	try { 
                    // set look and feel 
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); 
                } 
                catch (Exception e) { 
                    System.err.println(e.getMessage()); 
                    }
            	Calculator c = new Calculator();     
            	f = new JFrame();
            	t8k = new JTextField(16);
            	t8k.setEditable(false); 
            	
            	p = new JPanel();
        		
            	JButton clear, b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bA, bB, bC, bD, bE, bF, sub;
            	
            	 b0 = new JButton("0"); 
                 b1 = new JButton("1"); 
                 b2 = new JButton("2"); 
                 b3 = new JButton("3"); 
                 b4 = new JButton("4"); 
                 b5 = new JButton("5"); 
                 b6 = new JButton("6"); 
                 b7 = new JButton("7"); 
                 b8 = new JButton("8"); 
                 b9 = new JButton("9"); 
                 bA = new JButton("A");
                 bB = new JButton("B");
                 bC = new JButton("C");
                 bD = new JButton("D");
                 bE = new JButton("E");
                 bF = new JButton("F");
                 clear = new JButton("AC"); 
                 sub= new JButton("SUBMIT");
                
                 bF.addActionListener(c);
                 bE.addActionListener(c); 
                 bD.addActionListener(c);
                 bC.addActionListener(c);
                 bB.addActionListener(c);
                 bA.addActionListener(c);
                 b9.addActionListener(c); 
                 b8.addActionListener(c); 
                 b7.addActionListener(c); 
                 b6.addActionListener(c); 
                 b5.addActionListener(c); 
                 b4.addActionListener(c); 
                 b3.addActionListener(c); 
                 b2.addActionListener(c); 
                 b1.addActionListener(c); 
                 b0.addActionListener(c); 
                 clear.addActionListener(c);
                 sub.addActionListener(c);  
                 
                 p.add(t8k); 
                 p.add(b1); 
                 p.add(b2); 
                 p.add(b3); 
                 p.add(b4); 
                 p.add(b5); 
                 p.add(b6); 
                 p.add(b7); 
                 p.add(b8); 
                 p.add(b9);
                 p.add(bA); 
                 p.add(b0); 
                 p.add(bB);
                 p.add(bC);
                 p.add(bD);
                 p.add(bE);
                 p.add(bF);
                 p.add(clear);
                 p.add(sub); 

                 b1.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("1");t8k.setText(textbox1);}});
                 b2.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("2");t8k.setText(textbox1);}});
                 b3.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("3");t8k.setText(textbox1);}});
                 b4.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("4");t8k.setText(textbox1);}});
                 b5.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("5");t8k.setText(textbox1);}});
                 b6.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("6");t8k.setText(textbox1);}});
                 b7.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("7");t8k.setText(textbox1);}});
                 b8.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("8");t8k.setText(textbox1);}});
                 b9.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("9");t8k.setText(textbox1);}});
                 bA.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("A");t8k.setText(textbox1);}});
                 bB.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("B");t8k.setText(textbox1);}});
                 bC.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("C");t8k.setText(textbox1);}});
                 bD.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("D");t8k.setText(textbox1);}});
                 bE.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("E");t8k.setText(textbox1);}});
                 bF.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("F");t8k.setText(textbox1);}});
                 b0.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("0");t8k.setText(textbox1);}});


                 clear.addActionListener(e -> {
                	 textbox1="";
                	 t8k.setText(textbox1);
                 });

                 
                 sub.addActionListener(e -> {
                	 ans=task8(textbox1);
                	 textbox1="";
                	   f.dispose();
                	});

                 p.setBackground(Color.gray); 
                 f.add(p); 
                 f.setSize(180, 270); 
                 f.show(); 
         		 f.setVisible(true);
         		 
         		System.out.println("Input characters by clicking on buttons.");
          		 System.out.println("Submit: Get the result.");
          		 System.out.println("AC : All Clear.");
          		 
             } 
        
        static JTextField t3k;
        public static void Task3Keypad()
            {
            	try { 
                    // set look and feel 
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); 
                } 
                catch (Exception e) { 
                    System.err.println(e.getMessage()); 
                    }
            	Calculator c = new Calculator();     
            	f = new JFrame();
            	t3k = new JTextField(16);
            	t3k.setEditable(false); 
            	
            	p = new JPanel();
        		
            	JButton clear, b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, dot, c2f, f2c;
            	
            	 b0 = new JButton("0"); 
                 b1 = new JButton("1"); 
                 b2 = new JButton("2"); 
                 b3 = new JButton("3"); 
                 b4 = new JButton("4"); 
                 b5 = new JButton("5"); 
                 b6 = new JButton("6"); 
                 b7 = new JButton("7"); 
                 b8 = new JButton("8"); 
                 b9 = new JButton("9"); 
                 dot = new JButton(".");
                 c2f= new JButton("°F->°C");
        	     f2c= new JButton("°C->°F");
        	     clear = new JButton("AC");
                 
                 b9.addActionListener(c); 
                 b8.addActionListener(c); 
                 b7.addActionListener(c); 
                 b6.addActionListener(c); 
                 b5.addActionListener(c); 
                 b4.addActionListener(c); 
                 b3.addActionListener(c); 
                 b2.addActionListener(c); 
                 b1.addActionListener(c); 
                 b0.addActionListener(c); 
                 dot.addActionListener(c); 
                 c2f.addActionListener(c); 
        	     f2c.addActionListener(c); 
        	     clear.addActionListener(c);
                 
                 p.add(t3k); 
                 p.add(b1); 
                 p.add(b2); 
                 p.add(b3); 
                 p.add(b4); 
                 p.add(b5); 
                 p.add(b6); 
                 p.add(b7); 
                 p.add(b8); 
                 p.add(b9); 
                 p.add(b0); 
                 p.add(dot);
                 p.add(clear);
                 p.add(c2f);
        	     p.add(f2c); 

        	     b1.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("1");t3k.setText(textbox1);}});
        	     b2.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("2");t3k.setText(textbox1);}});
        	     b3.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("3");t3k.setText(textbox1);}});
        	     b4.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("4");t3k.setText(textbox1);}});
        	     b5.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("5");t3k.setText(textbox1);}});
        	     b6.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("6");t3k.setText(textbox1);}});
        	     b7.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("7");t3k.setText(textbox1);}});
        	     b8.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("8");t3k.setText(textbox1);}});
        	     b9.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("9");t3k.setText(textbox1);}});
        	     b0.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("0");t3k.setText(textbox1);}});
        	     dot.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {textbox1 =textbox1.concat(".");t3k.setText(textbox1);}});
        	     
        	     clear.addActionListener(e -> {
        	      	   textbox1="";
        	      	 t3k.setText(textbox1);
        	      	});
        	     
                 c2f.addActionListener(e -> {
                	 ans=task3('a', textbox1);
                	 textbox1="";
                	   f.dispose();
                	});
        	     f2c.addActionListener(e -> {
        	    	 ans=task3 ('b', textbox1);
        	    	 textbox1="";
                	   f.dispose();
                	});


                 p.setBackground(Color.gray); 
                 f.add(p); 
                 f.setSize(180, 220); 
                 f.show(); 
         		 f.setVisible(true);
         		 
         		System.out.println("Input number by clicking on buttons.");
          		 System.out.println("°F->°C or °C->°F : Get the appropriate result by clicking on operator.");
          		 System.out.println("AC : All Clear.");
             } 
            
        static JTextField t4k;
        public static void Task4Keypad()
            {
            	try { 
                    // set look and feel 
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); 
                } 
                catch (Exception e) { 
                    System.err.println(e.getMessage()); 
                    }
            	Calculator c = new Calculator();     
            	f = new JFrame();
            	t4k = new JTextField(16);
            	t4k.setEditable(false); 
            	
            	p = new JPanel();
        		
            	JButton clear, b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, g, oz, cm, inch, dot;
            	
            	 b0 = new JButton("0"); 
                 b1 = new JButton("1"); 
                 b2 = new JButton("2"); 
                 b3 = new JButton("3"); 
                 b4 = new JButton("4"); 
                 b5 = new JButton("5"); 
                 b6 = new JButton("6"); 
                 b7 = new JButton("7"); 
                 b8 = new JButton("8"); 
                 b9 = new JButton("9"); 
                 dot = new JButton(".");
                 oz= new JButton("oz->g");
                 g= new JButton("g->oz");
        	 	 cm= new JButton("cm->inch");         
        	 	 inch= new JButton("inch->cm");
        	 	 clear = new JButton("AC");


                 b9.addActionListener(c); 
                 b8.addActionListener(c); 
                 b7.addActionListener(c); 
                 b6.addActionListener(c); 
                 b5.addActionListener(c); 
                 b4.addActionListener(c); 
                 b3.addActionListener(c); 
                 b2.addActionListener(c); 
                 b1.addActionListener(c); 
                 b0.addActionListener(c); 
                 dot.addActionListener(c); 
                 oz.addActionListener(c);  
        	     g.addActionListener(c);  
                 cm.addActionListener(c);  
                 inch.addActionListener(c); 
                 clear.addActionListener(c);

                          

                 p.add(t4k); 
                 p.add(b1); 
                 p.add(b2); 
                 p.add(b3); 
                 p.add(b4); 
                 p.add(b5); 
                 p.add(b6); 
                 p.add(b7); 
                 p.add(b8); 
                 p.add(b9); 
                 p.add(b0); 
                 p.add(dot);
                 p.add(clear);
                 p.add(oz); 
                 p.add(g); 
                 p.add(cm);
                 p.add(inch);  

        	 b1.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("1");t4k.setText(textbox1);}});
        	 b2.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("2");t4k.setText(textbox1);}});
        	 b3.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("3");t4k.setText(textbox1);}});
        	 b4.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("4");t4k.setText(textbox1);}});
        	 b5.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("5");t4k.setText(textbox1);}});
        	 b6.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("6");t4k.setText(textbox1);}});
        	 b7.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("7");t4k.setText(textbox1);}});
        	 b8.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("8");t4k.setText(textbox1);}});
        	 b9.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("9");t4k.setText(textbox1);}});
        	 b0.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("0");t4k.setText(textbox1);}});
        	 dot.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {textbox1 =textbox1.concat(".");t4k.setText(textbox1);}});
        	 
        	 
        	 clear.addActionListener(e -> {
            	   textbox1="";
            	   t4k.setText(textbox1);
            	});

                 oz.addActionListener(e -> {
                	 ans=task4 ('d', textbox1);
                	 textbox1="";
                	   f.dispose();
                	});
        	 g.addActionListener(e -> {
        		 ans=task4 ('c', textbox1);
        		 textbox1="";
                	   f.dispose();
                	});
        	 cm.addActionListener(e -> {
        		 ans=task4 ('a', textbox1);
        		 textbox1="";
                	   f.dispose();
                	});
        	 inch.addActionListener(e -> {
        		 ans=task4 ('b', textbox1);
        		 textbox1="";
                	   f.dispose();
                	});

                 p.setBackground(Color.gray); 
                 f.add(p); 
                 f.setSize(180, 250); 
                 f.show(); 
         		 f.setVisible(true);
         		 
         		System.out.println("Input number by clicking on buttons.");
         		System.out.println("oz->g, g->oz, cm->inch, inch->cm : Get the appropriate result by clicking on operator.");
         		System.out.println("AC : All Clear.");
         		 
             } 
            
        public static void Task2()
            {
            	try { 
                    // set look and feel 
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); 
                } 
                catch (Exception e) { 
                    System.err.println(e.getMessage()); 
                    }
            	Calculator c = new Calculator();     
            	f = new JFrame();

            	p = new JPanel();
        		
            	JButton b1, b2;
            	

                 b1 = new JButton("Modulo"); 
                 b2 = new JButton("SQR, CUBE, SQRT, CUBERT");

                 b2.addActionListener(c); 
                 b1.addActionListener(c); 

        	 b1.setFont(new Font("Tahoma", Font.BOLD, 21));
                 b2.setFont(new Font("Tahoma", Font.BOLD, 21));
         
                 p.add(b1); 
                 p.add(b2); 
           
        	 b1.addActionListener(new ActionListener() {
        			public void actionPerformed(ActionEvent e) {
        				f.dispose();
        				Task2aKeypad();
        				
        			}      
         		});
                
        	 b2.addActionListener(new ActionListener() {
     			public void actionPerformed(ActionEvent e) {
     				f.dispose();
     				Task2bKeypad();
     				
     			}      
      		});
               



                 p.setBackground(Color.gray); 
                 f.add(p); 
                 f.setSize(320, 130); 
                 f.show(); 
         		 f.setVisible(true);
        
         		
            }
            
        static JTextField t2ak;
        static JTextField t2bk;
        public static void Task2aKeypad()
            {
            	try { 
                    // set look and feel 
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); 
                } 
                catch (Exception e) { 
                    System.err.println(e.getMessage()); 
                    }
            	Calculator c = new Calculator(); 
            	f = new JFrame();
            	t2ak = new JTextField(8);
            	t2ak.setEditable(false); 
            	t2bk = new JTextField(8);
            	t2bk.setEditable(false); 
            	
            	p = new JPanel();
        		
            	JButton clear, b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, sub, dot, nxt;
            	
            	 b0 = new JButton("0"); 
                 b1 = new JButton("1"); 
                 b2 = new JButton("2"); 
                 b3 = new JButton("3"); 
                 b4 = new JButton("4"); 
                 b5 = new JButton("5"); 
                 b6 = new JButton("6"); 
                 b7 = new JButton("7"); 
                 b8 = new JButton("8"); 
                 b9 = new JButton("9"); 
                 dot = new JButton(".");
                 nxt = new JButton("-->");
                 sub= new JButton("MODULO");
                 clear = new JButton("AC");

                 
                 b9.addActionListener(c); 
                 b8.addActionListener(c); 
                 b7.addActionListener(c); 
                 b6.addActionListener(c); 
                 b5.addActionListener(c); 
                 b4.addActionListener(c); 
                 b3.addActionListener(c); 
                 b2.addActionListener(c); 
                 b1.addActionListener(c); 
                 b0.addActionListener(c); 
                 nxt.addActionListener(c);
                 dot.addActionListener(c); 
                 sub.addActionListener(c);  
                 clear.addActionListener(c);
                 
                 p.add(t2ak);
                 p.add(t2bk);
                 p.add(b1); 
                 p.add(b2); 
                 p.add(b3); 
                 p.add(b4); 
                 p.add(b5); 
                 p.add(b6); 
                 p.add(b7); 
                 p.add(b8); 
                 p.add(b9); 
                 p.add(clear);
                 p.add(b0); 
                 p.add(dot);
                 p.add(nxt);
                 p.add(sub); 
                 
                 nxt.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {i=1;}	}); 
                 
                 b1.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {if(i==0) {textbox1 =textbox1.concat("1");t2ak.setText(textbox1);}else {textbox2 =textbox2.concat("1");t2bk.setText(textbox2);}}});
                 b2.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {if(i==0) {textbox1 =textbox1.concat("2");t2ak.setText(textbox1);}else {textbox2 =textbox2.concat("2");t2bk.setText(textbox2);}}});
                 b3.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {if(i==0) {textbox1 =textbox1.concat("3");t2ak.setText(textbox1);}else {textbox2 =textbox2.concat("3");t2bk.setText(textbox2);}}});
                 b4.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {if(i==0) {textbox1 =textbox1.concat("4");t2ak.setText(textbox1);}else {textbox2 =textbox2.concat("4");t2bk.setText(textbox2);}}});
                 b5.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {if(i==0) {textbox1 =textbox1.concat("5");t2ak.setText(textbox1);}else {textbox2 =textbox2.concat("5");t2bk.setText(textbox2);}}});
                 b6.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {if(i==0) {textbox1 =textbox1.concat("6");t2ak.setText(textbox1);}else {textbox2 =textbox2.concat("6");t2bk.setText(textbox2);}}});
                 b7.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {if(i==0) {textbox1 =textbox1.concat("7");t2ak.setText(textbox1);}else {textbox2 =textbox2.concat("7");t2bk.setText(textbox2);}}});
                 b8.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {if(i==0) {textbox1 =textbox1.concat("8");t2ak.setText(textbox1);}else {textbox2 =textbox2.concat("8");t2bk.setText(textbox2);}}});
                 b9.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {if(i==0) {textbox1 =textbox1.concat("9");t2ak.setText(textbox1);}else {textbox2 =textbox2.concat("9");t2bk.setText(textbox2);}}});
                 b0.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {if(i==0) {textbox1 =textbox1.concat("0");t2ak.setText(textbox1);}else {textbox2 =textbox2.concat("0");t2bk.setText(textbox2);}}});
                 dot.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {if(i==0) {textbox1 =textbox1.concat(".");t2ak.setText(textbox1);}else {textbox2 =textbox2.concat(".");t2bk.setText(textbox2);}}});
                 i=0;
                 
                 clear.addActionListener(e -> {
                	   textbox1="";
                	   textbox2="";
                	   t2ak.setText(textbox1);
                	   t2bk.setText(textbox2);
                	   i=0;
                	});
                 
                 sub.addActionListener(e -> {
                   ans=task2a(textbox1, textbox2);
                   textbox1="";
                   textbox2="";
              	   f.dispose();
              	});

                 p.setBackground(Color.gray); 
                 f.add(p); 
                 f.setSize(180, 220); 
                 f.show(); 
         		 f.setVisible(true);
         		 
         		System.out.println("Input number in the first box by clicking on buttons.");
        		 System.out.println("click on --> and enter number on next box.");
          		 System.out.println("MODULO: Get the appropriate result by clicking on operator.");
          		 System.out.println("AC : All Clear.");
             } 
            	
        static JTextField t2k;
        public static void Task2bKeypad()
              {
              	try { 
                      // set look and feel 
                      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); 
                  } 
                  catch (Exception e) { 
                      System.err.println(e.getMessage()); 
                      }
              	Calculator c = new Calculator();     
              	f = new JFrame();
              	t2k = new JTextField(16);
              	t2k.setEditable(false); 
              	
              	p = new JPanel();
          		
              	JButton clear, b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, dot, g, sq, cb, sr, cr;
              	
              	   b0 = new JButton("0"); 
                   b1 = new JButton("1"); 
                   b2 = new JButton("2"); 
                   b3 = new JButton("3"); 
                   b4 = new JButton("4"); 
                   b5 = new JButton("5"); 
                   b6 = new JButton("6"); 
                   b7 = new JButton("7"); 
                   b8 = new JButton("8"); 
                   b9 = new JButton("9"); 
                   dot = new JButton(".");
                   sq= new JButton("SQR");
                   cb= new JButton("CUBE");
                   sr= new JButton("SQRT");         
                   cr= new JButton("CUBERT");
                   clear = new JButton("AC");

                   b9.addActionListener(c); 
                   b8.addActionListener(c); 
                   b7.addActionListener(c); 
                   b6.addActionListener(c); 
                   b5.addActionListener(c); 
                   b4.addActionListener(c); 
                   b3.addActionListener(c); 
                   b2.addActionListener(c); 
                   b1.addActionListener(c); 
                   b0.addActionListener(c); 
                   dot.addActionListener(c); 
                   sq.addActionListener(c);  
                   cb.addActionListener(c);  
                   sr.addActionListener(c);  
                   cr.addActionListener(c);  
                   clear.addActionListener(c);
                            

                   p.add(t2k); 
                   p.add(b1); 
                   p.add(b2); 
                   p.add(b3); 
                   p.add(b4); 
                   p.add(b5); 
                   p.add(b6); 
                   p.add(b7); 
                   p.add(b8); 
                   p.add(b9); 
                   p.add(dot);
                   p.add(b0); 
                   p.add(clear);
                   p.add(sq); 
                   p.add(cb); 
                   p.add(sr);
                   p.add(cr);  

                   b1.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("1");t2k.setText(textbox1);}});
                   b2.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("2");t2k.setText(textbox1);}});
                   b3.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("3");t2k.setText(textbox1);}});
                   b4.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("4");t2k.setText(textbox1);}});
                   b5.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("5");t2k.setText(textbox1);}});
                   b6.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("6");t2k.setText(textbox1);}});
                   b7.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("7");t2k.setText(textbox1);}});
                   b8.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("8");t2k.setText(textbox1);}});
                   b9.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("9");t2k.setText(textbox1);}});
                   b0.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e)  {textbox1 =textbox1.concat("0");t2k.setText(textbox1);}});
                   dot.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {textbox1 =textbox1.concat(".");t2k.setText(textbox1);}});
                   
                   clear.addActionListener(e -> {
                  	   textbox1="";
                  	 t2k.setText(textbox1);
                  	});
                   
                   sq.addActionListener(e -> {
                	   ans=task2b('a', textbox1);
                	   textbox1="";
                  	   f.dispose();
                  	});
                   cb.addActionListener(e -> {
                	   ans=task2b('b', textbox1);
                	   textbox1="";
                  	   f.dispose();
                  	});
                   sr.addActionListener(e -> {
                	   ans=task2b('c', textbox1);
                	   textbox1="";
                  	   f.dispose();
                  	});
                   cr.addActionListener(e -> {
                	   ans=task2b('d', textbox1);
                	   textbox1="";
                  	   f.dispose();
                  	});

                   p.setBackground(Color.gray); 
                   f.add(p); 
                   f.setSize(180, 260); 
                   f.show(); 
                   f.setVisible(true);
                   
                    System.out.println("Input number by clicking on buttons.");
            		System.out.println("SQR, CUBE, SQRT, CUBERT,: Get the appropriate result by clicking on operator.");
            		System.out.println("AC : All Clear.");
            		 
               } 
                 

         
        
    	public static void main(String args[]) 
        {
    		mainbox();
    		
        }
		

		@Override
		public void actionPerformed(ActionEvent arg0) { 
			String s = arg0.getActionCommand(); 
			
			   switch(s) 
				{
		  		case "TASK1" :
		  			Task1Keypad();
		    	break;
		  		case "TASK2":
		  			Task2();
				break;
		  		case "TASK3":
		  			Task3Keypad();
				break;
		  		case "TASK4":
		  			Task4Keypad();
		   		break;
		  		case "TASK5":
		  			Task5Keypad();
				break;
		  		case "TASK6":
		  			Task6Keypad();
				break;
		  		case "TASK7":
		  			Task7Keypad();
				break;
			  	case "TASK8":
			  		Task8Keypad();
				break;
				}
			  
			   mbox.setText(ans);
		
		}
		
		public static String task1 (char choice, String strNum1, String strNum2) {
			double num1 = Double.parseDouble(strNum1);
			double num2 = Double.parseDouble(strNum2);
			if (choice == 'a') 
				return String.format("%.2f", num1 + num2); //add
			if (choice == 'b') 
				return String.format("%.2f", num1 - num2); //subtract
			if (choice == 'c') 
				return String.format("%.2f", num1 * num2); //multiply
			if (choice == 'd') 
				return String.format("%.2f", num1 / num2); //divide
			return "";
		}
		public static String task2a(String num1, String num2)
			{
		     		String firstInput=num1;
		     		String secoundInput=num2;
		     		BigInteger value=new BigInteger(firstInput);
		     		BigInteger modulo=new BigInteger(secoundInput);
		     		BigInteger result=value.mod(modulo); 
		     		return result.toString();
			}
		public static String task2b(char choice, String num)
			{double n= Double.parseDouble(num);
			if(choice=='a')
			{
		        Double power = Math.pow(n, 2);  
		        return power.toString();     
			}
			if(choice=='b')
			{ 
		        Double power = Math.pow(n, 3);
		        return power.toString();
			}
			if(choice=='c')
			{
		        Double sr= Math.sqrt(n);
		        return sr.toString();
			}
			if(choice=='d')
			{
		        Double cr= Math.cbrt(n); 
		        return cr.toString();
			}
			return "";
			}
		public static String task3 (char choice, String strTemp) {
			double temp = Double.parseDouble(strTemp);
			if (choice == 'b')
				return String.format("%.2f", temp * (9.0/5.0) + 32); //C to F
			if (choice == 'a')
				return String.format("%.2f", (temp - 32) * (5.0/9.0)); //F to C
			return "";
		}
		public static String task4 (char choice, String strValue) {
			double value = Double.parseDouble(strValue);
		    if (choice == 'a') 
	            return String.format("%.2f", value * 0.3937); //cm to inch 
	        if (choice == 'b')
	            return String.format("%.2f", value * 2.54); //inch to cm
	        if (choice == 'c')
	            return String.format("%.2f", value * 0.0352); //gram to ounce
	        if (choice == 'd')
	            return String.format("%2f", value * 28.3495); //ounce to gram
	        return "";
	    
		}
		public static String task5(String strDecimal) {
			int decimal = Integer.parseInt(strDecimal);
			int[] num = new int[40];
			int index = 0;
			String result = "";
			
			while (decimal > 0) 
			{
				num[index++] = decimal % 2;
				decimal = decimal / 2;
			}
			for (int i = index - 1; i >= 0; i--) 
			{
				result += Integer.toString(num[i]);
			}
			return result;
		}
		public static String task6 (String strBinary) {
			int binary = Integer.parseInt(strBinary);
			int decimal = 0;
			int i = 0;

			while (binary != 0) 
			{
				int temp = binary%10;
				decimal += Math.pow(2,i) * temp;
				binary = binary/10;
				i++;
			}
			String result = Integer.toString(decimal);
			return result;
		}
		public static String task7(String strA) {
			int a = Integer.parseInt(strA);
			String d="";
			int i = 0;
			while(a!=0) 
			{
				i=a%16;
				a=(int)a/16;
				if(i<10){
					d=d.concat(Integer.toString(i));
				}

				else{
					switch(i) 
					{
					case 10 :
						d=d.concat("A");
						break;
					case 11:
						d=d.concat("B");
						break;
					case 12:
						d=d.concat("C");
						break;
					case 13:
						d=d.concat("D");
						break;
					case 14:
						d=d.concat("E");
						break;
					case 15:
						d=d.concat("F");
						break;
					default:
						System.out.print("Error");
					}
				}
			}
			byte[] strAsByteArray = d.getBytes();
			byte[] result = new byte[strAsByteArray.length];
			for (int j = 0;  j< strAsByteArray.length; j++)
				result[j] = strAsByteArray[strAsByteArray.length - j - 1];
			String ss=new String(result);
			return ss;
		}
		public static String task8(String htd) {
			int i, x = -1, j, htdResult = 0;
			String htdU = htd.toUpperCase();
			String[] hdArrS = htdU.split("");
			String[] hdArrSS = new String[hdArrS.length];
			int[] hdArrI = new int[hdArrS.length];
			
			for(j = hdArrS.length - 1; j >= 0; --j)
			{
				x += 1;
				hdArrSS[x] = hdArrS[j];
			}
				
			for (i = 0; i < hdArrS.length; ++i) 
			{
		
				switch(hdArrSS[i]) 
				{
					case "A":
					hdArrSS[i] = "10";
					break;
					
					case "B":
					hdArrSS[i] = "11";
					break;
					
					case "C":
					hdArrSS[i] = "12";
					break;
					
					case "D":
					hdArrSS[i] = "13";
					break;
					
					case "E":
					hdArrSS[i] = "14";
					break;
					
					case "F":
					hdArrSS[i] = "15";
					break;
					
				}
				
				hdArrI[i] = Integer.parseInt(hdArrSS[i]);
				htdResult += hdArrI[i] * (int) Math.pow(16, i);
			
			}
			return Integer.toString(htdResult);	
		}

}			
		


		
		
		

  