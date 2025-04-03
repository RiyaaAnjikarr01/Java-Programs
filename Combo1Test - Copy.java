import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Combo1Test extends JFrame implements ActionListener{


	String[] names ={"Monkey","Fox","Cow","Dog"};
	String[] P={"Monkey1.png","Fox.png","Cow.png","Dog.png"};
	String[] fruits = {"Monkey likes Banana", "Fox likes Grapes", "Cow likes Grass", "Dog likes Bone"};

	JComboBox<String> b;
	JLabel l=new JLabel(new ImageIcon("Monkey1.png"),JLabel.CENTER);
	JLabel fruitLabel = new JLabel("Monkey likes Banana", JLabel.CENTER);

	Combo1Test(){
	setSize(350,350);
	setTitle("My Frame");
	setLayout(new BorderLayout());

	b=new JComboBox(names);
	JPanel n=new JPanel();
	n.add(b);
	b.addActionListener(this);

	JPanel centerPanel = new JPanel();
	centerPanel.setLayout(new BorderLayout());
	centerPanel.add(l, BorderLayout.CENTER);
    centerPanel.add(fruitLabel, BorderLayout.SOUTH);
	add(n,BorderLayout.NORTH);
	add(centerPanel, BorderLayout.SOUTH);
	add(l);

	}


	public void actionPerformed(ActionEvent e) {
	int i=b.getSelectedIndex();
	l.setIcon(new ImageIcon(P[i]));
	fruitLabel.setText(fruits[i]);
	}
	public static void main(String[] args){
					Combo1Test f=new Combo1Test();
					f.setVisible(true);
					f.setDefaultCloseOperation(3);

				}
}