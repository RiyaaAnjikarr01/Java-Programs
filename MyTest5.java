import java.awt.*;
import java.awt.event.*;
class MyTest5 extends Frame {
Button b=new Button("ok");
Button c=new Button("cancel");

MyTest5(){
setSize(600,600);
setTitle("Clickable Test");
setLayout(new FlowLayout());
add(b);
add(c);
b.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
System.out.println("Hello World");
}
});

c.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
System.out.println("Bye");
}
});
}
public static void main(String[] args){
MyTest5 f=new MyTest5();
f.setVisible(true);
}
}