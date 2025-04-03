import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Combobox1 extends JFrame implements ActionListener
{
	String [] animal = {"Monkey","Fox","Cow","Dog"};
	String [] add={"Monkey1.png","Fox.png","Cow.png","Dog.png"};
	String [] sent= {"Monkey likes Banana", "Fox likes Grapes", "Cow likes Grass", "Dog likes Bone"};

	JPanel j = new JPanel();
	JLabel p = new JLabel("Monkey likes Banana");



	JComboBox c;

	JLabel l = new JLabel (new ImageIcon ("monkey.jpg"),JLabel.CENTER);

		Combobox1()
		{
			setSize(400,500);
			c= new JComboBox(animal);
			JPanel n = new JPanel ();
			n.add(c);
			c.addActionListener(this);
			add(n,"North");
			add(l);
			j.add(p);
			add(j,"South");

		}

		public void actionPerformed (ActionEvent e)
			{
				int i = c.getSelectedIndex();
				l.setIcon(new ImageIcon(add[i]));

				p.setText(sent[i]);

			}

		public static void main (String [] args)
		{
			Combobox1 x = new Combobox1();
			x.setVisible(true);

			}
	}