import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class ComboTest extends JFrame implements ActionListener{

String[] names ={"India","Thailand","Britannica"};
String[] P={"India.png","Thailand.png","Britannica.webp"};
JComboBox b;
JLabel l=new JLabel(new ImageIcon("India.png"),JLabel.CENTER);
ComboTest(){

setSize(350,350);
setTitle("My Frame");
b=new JComboBox(names);
JPanel n=new JPanel();
n.add(b);
b.addActionListener(this);
add(n,"North");
add(l);
}
public void actionPerformed(ActionEvent e) {
int i=b.getSelectedIndex();
l.setIcon(new ImageIcon(P[i]));
}
public static void main(String[] args){
				ComboTest f=new ComboTest();
				f.setVisible(true);
				f.setDefaultCloseOperation(3);

			}
}