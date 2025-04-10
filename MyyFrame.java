import java.awt.*;

class MyyFrame extends Frame{
	MyyFrame (){
		setSize(600,600);
		setTitle("Graphics Test");
	}
	public void paint(Graphics g){
		g.setFont(new Font("Arial",Font.BOLD,20));
		g.drawString("RiyaAnjikar",50,100);
		g.drawLine(50,110,400,110);
		g.setColor(Color.RED);
		g.fillOval(50,200,200,200);
	}
	public static void main(String[] args){
	MyyFrame f=new MyyFrame();
	f.setVisible(true);
	}
	}