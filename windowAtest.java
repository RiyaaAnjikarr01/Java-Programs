import java.awt.*;
import java.awt.event.*;
class windowAtest extends Frame{
windowAtest(){
setSize(600,600);
setTitle("Window Event");
addWindowListener(new windowHandler());
}

class windowHandler extends WindowAdapter{
	public void windowClosing(WindowEvent e){
		dispose();
	}
}
public static void main(String[] args){
	windowAtest f=new windowAtest();
	f.setVisible(true);
}
}