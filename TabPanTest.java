import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class TabPanTest extends JFrame{
TabPanTest(){
setSize(600,600);
setTitle("My Frame");
String l[] ={"one","two","three"};
Color c[]={Color.red,Color.green,Color.blue};

JTabbedPane tp=new JTabbedPane(JTabbedPane.TOP);
for(int i=0;i<l.length;i++){
JPanel P=new JPanel();
for(int j=0;j<=i;j++)
P.add(new JButton("Button" +j));
P.setBackground(c[i]);
tp.addTab(l[i],P);
}
add(tp);
}

public static void main(String[] args){
TabPanTest f=new TabPanTest();
f.setVisible(true);


			}
}