import java.awt.*;
import java.awt.event.*;
class MyTest2 extends Frame{
Button b=new Button("ok");
MyTest2(){
setSize(600,600);
setTitle("Clickable Test");
setLayout(new FlowLayout());
add(b);

EventHandler eh=new EventHandler();
b.addActionListener(eh);



}
class EventHandler implements ActionListener{
public void actionPerformed(ActionEvent e){
System.out.println("Hello World");
}
}
public static void main(String[] args){
MyTest2 f=new MyTest2();
f.setVisible(true);
}
}
