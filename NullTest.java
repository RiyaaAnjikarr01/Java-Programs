import java.awt.*;
class NullTest extends Frame{
NullTest(){
setSize(600,600);
setTitle("Null Layout Test");
setLayout(null);
Button b1=new Button("ok");
b1.setBounds(100,100,50,50);
Button b2=new Button("cancel");
b2.setBounds(190,100,80,50);
add(b1);
add(b2);
}
public static void main(String [] args){
NullTest f=new NullTest();
f.setVisible(true);
}
}