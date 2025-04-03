import java.awt .*;

class DoremonFrame extends Frame{
DoremonFrame (){
setSize(600,600);
setTitle("Graphics Test");
}
public void paint(Graphics g){
g.setFont(new Font ("Arial",Font.BOLD,20));
g.drawString("Doremon",50,100);


g.setColor(Color.BLUE);
g.fillOval(170, 350, 260, 300);


g.setColor(Color.BLUE);
g.fillOval(150, 100, 300, 300);





        g.setColor(Color.WHITE);
        g.fillOval(175, 150, 250, 250);

        g.setColor(Color.BLACK);
		g.fillOval(255, 190, 15, 20);
		g.fillOval(305, 190, 15, 20);

        g.setColor(Color.WHITE);
	    g.fillOval(230, 150, 60, 80);
        g.fillOval(290, 150, 60, 80);



        g.setColor(Color.RED);
        g.fillOval(275, 220, 30, 30);



        g.drawLine(180, 250, 250, 250);
		g.drawLine(180, 270, 250, 260);
        g.drawLine(180, 290, 250, 270);

        g.drawLine(350, 250, 280, 250);
		g.drawLine(350, 270, 280, 260);
		g.drawLine(350, 290, 280, 270);

		g.setColor(Color.BLACK);
		g.fillOval(255, 190, 15, 20);
		g.fillOval(305, 190, 15, 20);



}
public static void main(String[] args){
	DoremonFrame D=new DoremonFrame();
	D.setVisible(true);
	}
	}
