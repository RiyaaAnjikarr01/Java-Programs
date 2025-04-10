import java.awt.*;
import java.awt.event.*;
class windowEtest extends Frame{
windowEtest(){
setTitle("Window Event");
setSize(600,600);
addWindowListener(new windowHandler());
}

class windowHandler implements WindowListener
{
public void windowOpened(WindowEvent e)
{
System.out.println("windowOpened");
}


public void windowClosing(WindowEvent e)
{
System.out.println("Closing");
dispose();
}


public void windowClosed(WindowEvent e)
{
System.out.println("Closed");
}


public void windowActivated(WindowEvent e)
{
	System.out.println("Active");
}


public void windowDeactivated(WindowEvent e)
{
	System.out.println("Deactive");
}


public void windowIconified(WindowEvent e)
{
	System.out.println("Minimize");
}


public void windowDeiconified(WindowEvent e)
{
	System.out.println("Max");
}


}
public static void main(String[] args){
	windowEtest f=new windowEtest();
	f.setVisible(true);
}
}
