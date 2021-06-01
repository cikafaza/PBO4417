/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beratideal;
import java.awt.*;  
import java.awt.event.*;
/**
 *
 * @author bertinfajri
 */
public class BeratIdeal extends Frame implements ActionListener{
    TextField tf1, tf2, tf3, tf4; 
    Label l1, l2, l3, l4, l5; 
    Button b1;
    double meter;
    BeratIdeal(){
        tf1=new TextField();  
        tf1.setBounds(120,50, 200,20); 
        tf2=new TextField();  
        tf2.setBounds(120,80, 200,20);
        tf3=new TextField();  
        tf3.setBounds(120,110, 200,20);
        tf4=new TextField();  
        tf4.setBounds(120,140, 200,20);
        
        l1=new Label("NIM");  
        l1.setBounds(70,50, 70,20);
        l2=new Label("NAMA");  
        l2.setBounds(70,80, 70,20);
        l3=new Label("BERAT");  
        l3.setBounds(70,110, 70,20);
        l4=new Label("TINGGI");  
        l4.setBounds(70,140, 70,20);
        l5=new Label();  
        l5.setBounds(70,250, 250,20);
        
        b1=new Button("Hitung");  
        b1.setBounds(70,180,80,30);  
        b1.addActionListener(this);    
        add(b1);
        add(tf1); add(tf2); add(tf3); add(tf4);
        add(l1); add(l2); add(l3); add(l4); add(l5);  
        setSize(400,400);
        setLayout(null);
	setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        String ket = "";
	double a = Double.parseDouble(tf3.getText());
	double b = Double.parseDouble(tf4.getText());
	meter = b / 100;
	double c = a/(meter*meter);
		  	
	if ((c >= 18.5) && (c <= 25)) {
            ket = "BERAT ANDA SUDAH IDEAL";
	}
	else {
            ket = "BERAT ANDA TIDAK IDEAL";
        }				 
        l5.setText(ket);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new BeratIdeal();
    }
    
}
