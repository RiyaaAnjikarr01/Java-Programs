import java.awt.*;
class BorderLtest extends Frame{
Button n=new Button ("North");
Button c=new Button("Center");
Button s=new Button("South");
Button e=new Button("East");
Button w=new Button("West");

BorderLtest(){
setLayout(new BorderLayout(50,50));
setSize(600,600);
setTitle("Border Layout Test");
add(c);
add(n,BorderLayout.NORTH);
add(s,BorderLayout.SOUTH);
add(e,BorderLayout.EAST);
add(w,BorderLayout.WEST);


}
public static void main(String[] args){
BorderLtest bt=new BorderLtest();
bt.setVisible(true);
}
}
