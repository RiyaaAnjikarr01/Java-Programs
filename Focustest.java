import java.awt.*;
import java.awt.event.*;
class Focustest extends Frame{
Button b=new Button("ok");
Button c=new Button("cancel");
Focustest(){
setSize(600,600);
setTitle("Window Event");
setLayout(new FlowLayout());
add(b);
add(c);
c.addFocusListener(new FocusHandler());
b.addFocusListener(new FocusHandler());
}
class FocusHandler implements FocusListener{
public void focusGained(FocusEvent e){
Button x=(Button)e.getComponent();
x.setBackground(Color.red);
}
public void focusLost(FocusEvent e){
Button x=(Button)
e.getComponent();
x.setBackground(Color.green);
}
}
public static void main(String[] args){
	Focustest f=new Focustest();
	f.setVisible(true);
}
}
