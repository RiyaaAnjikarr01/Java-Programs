import java .io.*;
import java.util.*;
class ReaderTest{
public static void main(String[] args) throws Exception{
Scanner in=new Scanner(System.in);
System.out.println("Enter file name:");
String fn =in.nextLine();
try{
BufferedReader fin=new BufferedReader(new FileReader(fn));
String data=fin.readLine();
while(data!=null){
System.out.print(data);
data=fin.readLine();
}
fin.close();
}catch(Exception e){
	System.out.println("Error:"+e.getMessage());
	}
}
}
