import java.awt.*;
class Border1Layout extends Frame{
Button n=new Button ("Login");
Button s=new Button ("Logout");


Border1Layout(){
setLayout(new BorderLayout(50,50));
setSize(600,600);
setTitle("Border Layout Test");
add(n,BorderLayout.NORTH);
add(s,BorderLayout.SOUTH);

}

public static void main(String[] args){
Border1Layout bt=new Border1Layout();
bt.setVisible(true);
}
}