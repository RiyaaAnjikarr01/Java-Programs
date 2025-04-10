import java.awt.*;
import java.awt.event.*;
class MyFrame6 extends Frame implements ActionListener{
Button b=new Button("Red");
Button c=new Button("Green");
Button d=new Button("Blue");

MyFrame6(){
setSize(600,600);
setTitle("Clickable Test");
setLayout(new FlowLayout());
add(b);
add(c);
add(d);
b.addActionListener(this);
c.addActionListener(this);
d.addActionListener(this);
}
public void actionPerformed(ActionEvent e){
Object ref =e.getSource();
if(ref==b){
setBackground(Color.RED);
}else if(ref==c){
setBackground(Color.GREEN);
}else{
setBackground(Color.BLUE);
}
}
public static void main(String[] args){
MyFrame6 f=new MyFrame6();
f.setVisible(true);
}
}