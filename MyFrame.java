import java.awt.*;
class MyFrame{
public static void main(String[] args){
Frame f=new Frame();
f.setSize(300,300);
f.setTitle("My frame");
f.setVisible(true);
}
}
class MyFrame extends Frame{
	MyFrame (){
		setSize(600,600);
		setTitle("Graphics Test");
	}
	public void paint(Graphics g){
		g.setFont(new Font("Arial",Font.BOLD,20));
		g.drawString("RiyaAnjikar",50,100);
		g.drawLine(50,110,400,110);
		g.setColor(color.RED);
		g.fillOval(50,200,200,200);
	}