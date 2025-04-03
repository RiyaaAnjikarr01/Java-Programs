import java.awt.*;
class FlowTest extends Frame{
FlowTest(){
setSize(600,600);
setTitle("FlowTest");
setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
for(int i=0;i<20;i++){
Button b=new Button("Button"+i);
add(b);
}
}
public static void main(String [] args){
FlowTest t=new FlowTest();
t.setVisible(true);
}
}