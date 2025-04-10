import java.awt.*;
import java.awt.event.*;
class MyFrame5 extends Frame implements ActionListener{
Button b=new Button("Red");
Button c=new Button("Green");
Button d=new Button("Blue");

MyFrame5(){
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
String s =e.getActionCommand();
if(s.equals("Red")){
setBackground(Color.RED);
}else if(s.equals("Green")){
setBackground(Color.GREEN);
}else{
setBackground(Color.BLUE);
}
}
public static void main(String[] args){
MyFrame5 f=new MyFrame5();
f.setVisible(true);
}
}