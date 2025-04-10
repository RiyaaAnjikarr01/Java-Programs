import java.awt.*;
import java.awt.event.*;
class MyTest3 extends Frame{
Button b=new Button("ok");
int n=0;

MyTest3(){
setSize(600,600);
setTitle("Clickable Test");
setLayout(new FlowLayout());
add(b);

EventHandler eh=new EventHandler();
b.addActionListener(eh);



}
class EventHandler implements ActionListener{
public void actionPerformed(ActionEvent e){
n++;
System.out.println(n+"Time Clickable");
}
}
public static void main(String[] args){
MyTest3 f=new MyTest3();
f.setVisible(true);
}
}