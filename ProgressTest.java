import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class ProgressTest extends JFrame{
JProgressBar pb =new JProgressBar(0,2000);
JButton b=new JButton("Setup");
ProgressTest(){
setSize(600,600);
setTitle("My Frame");
setLayout(new FlowLayout());
add(b);
b.addActionListener(new ActionListener(){
	public void actionPerformed (ActionEvent e){
		Thread t=new MyThread();
		t.start();
	}
});
add(pb);

pb.setStringPainted(true);
}

class MyThread extends Thread{
	public void run(){
		int i=0;
		while(i!=2010){
			pb.setValue(i);
			i=i+20;
			try{
				Thread.sleep(50);
			}catch(Exception e){
				System.out.println(e);
			}
		}
	}
}
public static void main(String[] args){
ProgressTest f=new ProgressTest();
f.setVisible(true);


     }
}