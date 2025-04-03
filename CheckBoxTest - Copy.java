import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class CheckBoxTest extends JFrame implements ActionListener{
JCheckBox r =new JCheckBox("Red");
JCheckBox g =new JCheckBox("Green");
JCheckBox b =new JCheckBox("Blue");
JPanel P=new JPanel();
CheckBoxTest(){
setSize(350,350);
setTitle("My Frame");
P.add(r);
P.add(g);
P.add(b);
add(P);

r.addActionListener(this);
g.addActionListener(this);
b.addActionListener(this);
}

public void actionPerformed(ActionEvent e) {
	int x=0,y=0,z=0;
	if(r.isSelected())
	x=255;
	if(g.isSelected())
	y=255;
	if(b.isSelected())
	z=255;

	Color c=new Color(x,y,z);
	P.setBackground(c);
}
public static void main(String[] args){
				CheckBoxTest f=new CheckBoxTest();
				f.setVisible(true);
				f.setDefaultCloseOperation(3);

			}
}