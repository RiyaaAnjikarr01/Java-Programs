import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class MyTextPad extends JFrame{
JTextArea ta =new JTextArea(10,30);
MyTextPad(){
setSize(350,350);
setTitle("My Frame");
JScrollPane sp =new JScrollPane(ta);
add (sp);
ta.setFont(new Font("Times New Roman",Font.PLAIN,24));
}
public static void main(String[] args){
				MyTextPad f=new MyTextPad();
				f.setVisible(true);
				f.setDefaultCloseOperation(3);

			}
}
