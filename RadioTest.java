import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class RadioTest extends JFrame implements ActionListener{
	JPanel P=new JPanel();
	JPanel n=new JPanel();
	JLabel l=new JLabel("Riya",JLabel.CENTER);
	RadioTest(){
	setSize(350,350);
    setTitle("My Frame");
    ButtonGroup bg =new ButtonGroup();
    String lb[]={"8","12","24","30","42"};
    for(int i=0;i<lb.length;i++){
		JRadioButton b=new JRadioButton(lb[i]);
		bg.add(b);
		n.add(b);
		b.addActionListener(this);
	}
	add(n,"North");
	P.add(l);
	add(P);
}
public void actionPerformed(ActionEvent e) {
	String s=e.getActionCommand();
	int size =Integer.parseInt(s);
	l.setFont(new Font("Times new Roman",Font.PLAIN,size));
}
public static void main(String[] args){
				RadioTest f=new RadioTest();
				f.setVisible(true);
				f.setDefaultCloseOperation(3);

			}
}