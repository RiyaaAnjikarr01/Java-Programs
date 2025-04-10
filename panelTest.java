import java.awt.*;
class panelTest extends Frame{
panelTest(){
setSize(600,600);
setTitle("Panel Test");
Panel n=new Panel();
n.add(new Button("Red"));
n.add(new Button("Green"));
n.add(new Button("Blue"));
n.setBackground(Color.red);
add(n,"North");
Panel s=new Panel();
s.add(new Button("ok"));
s.add(new Button("Cancel"));
add(s,"South");
}
public static void main(String [] args){
panelTest f=new panelTest();
f.setVisible(true);
}
}