import java.awt.*;
class FlowTest1 extends Frame{
FlowTest1(){
setSize(600,600);
setTitle("FlowTest");
setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
Button b=new Button("Login");
Button c=new Button("Logout");
add(b);
add(c);
}

public static void main(String [] args){
FlowTest1 t=new FlowTest1();
t.setVisible(true);
}
}