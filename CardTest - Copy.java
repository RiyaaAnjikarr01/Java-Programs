import java.awt.*;
import java.awt.event.*;
class CardTest extends Frame implements ActionListener{
Button n=new Button("Next");
Button p=new Button("Previous");
Button f=new Button("First");
Button l=new Button("Last");

Panel c=new Panel();
Panel d=new Panel();

CardLayout card =new CardLayout(20,20);

CardTest(){
setTitle("My frame");
setSize(600,500);
setLayout(new BorderLayout());

c.add(n);
c.add(p);
c.add(f);
c.add(l);
c.setBackground(Color.CYAN);

n.addActionListener(this);
p.addActionListener(this);
f.addActionListener(this);
l.addActionListener(this);
add(d, BorderLayout.SOUTH);
c.setLayout(card);

Panel PA =new Panel();
PA.setBackground(Color.RED);
PA.add(new Button("ok"));

Panel PB=new Panel();
PB.setBackground(Color.BLUE);

Panel PC=new Panel();
PC.setBackground(Color.PINK);
PC.add(new Button("Java"));

Panel PD=new Panel();
PD.setBackground(Color.GREEN);
PD.add(new Button("Cancel"));

c.setLayout(card);
c.add(PA,"A");
c.add(PB,"B");
c.add(PC,"C");
c.add(PD,"D");

add(c,BorderLayout.CENTER);
}

public void actionPerformed(ActionEvent e){
String s =e.getActionCommand();
if(s.equals("First")){
card.first(c);
}else if(s.equals("Next")){
card.next(c);
}else if(s.equals("Last")){
card.last(c);
}else{
card.previous(d);
}
}
public static void main(String[] args){
CardTest f=new CardTest();
f.setVisible(true);
}
}
