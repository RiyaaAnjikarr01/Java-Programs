import java.awt.*;
import java.awt.event.*;
class MyTest4 extends Frame implements ActionListener{
Button b=new Button("ok");

MyTest4(){
setSize(600,600);
setTitle("Clickable Test");
setLayout(new FlowLayout());
add(b);
b.addActionListener(this);
}

public void actionPerformed(ActionEvent e){
System.out.println("Hello World");
}

public static void main(String[] args){
MyTest4 f=new MyTest4();
f.setVisible(true);
}
}