import java.io.*;
import java.util.*;
class DTest{
public static void main(String[] args) throws IOException{
int i=55;
double d=66.65;
char ch='A';

//// Writing data to file
DataOutputStream ds=new DataOutputStream(new FileOutputStream("data.dat"));
ds.writeInt(i);
ds.writeDouble(d);
ds.writeChar(ch);
ds.close();

 // Reading data from file
DataInputStream dls=new DataInputStream(new FileInputStream("data.dat"));
int a=dls.readInt();
double b=dls.readDouble();
char c=dls.readChar();


System.out.println(a);
System.out.println(b);
System.out.println(c);
dls.close();
}
}
