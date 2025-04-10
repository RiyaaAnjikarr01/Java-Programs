import java.awt.*;
class MyFrame1 extends Frame{
MyFrame1(){
setSize(600,600);
setTitle("Frame Test");
setBackground(Color.RED);
setLocation(100,100);
}
public static void main(String[] args){
MyFrame1 f=new MyFrame1();
f.setVisible(true);
Dimension d=f.getSize();
System.out.println("Height:"+d.height+"Width:"+d.width);
}
}