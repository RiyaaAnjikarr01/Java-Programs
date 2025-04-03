import java.io.*;
import java.util.*;
class filehand{
public static void main(String [] args){
Scanner in=new Scanner(System.in);
System.out.println("Enter source");
String Sname=in.next();
try{
BufferedInputStream bfin=new BufferedInputStream(new FileInputStream(Sname));
System.out.print("ENter new file name");
String dfin=in.next();
BufferedOutputStream bout=new BufferedOutputStream(new FileOutputStream(dfin));
int b=bfin.read();
while(b!=-1){
bout.write((byte)b);
b=bfin.read();
}
bfin.close();
bout.close();}

catch(Exception e){
	 System.out.println("Error: " + e.getMessage());
	}
	in.close();
}
}
