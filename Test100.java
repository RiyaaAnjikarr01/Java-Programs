//popup
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class  Test100 extends JFrame implements ActionListener{
JButton b=new JButton("ok");
Test100(){
setSize(600,600);
setTitle("My Frame");
setLayout(new FlowLayout());
add(b);
b.addActionListener(this);
}

public void actionPerformed (ActionEvent e){
JOptionPane.showMessageDialog(this,"Danger","Warning",2JOptionPane.WARNING_MESSAGE);
}

public static void main(String[] args){
Test100 f=new Test100();
f.setVisible(true);


     }
}
