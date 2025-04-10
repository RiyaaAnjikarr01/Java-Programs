import java .io.*;
import java.util.*;
class printTest{
public static void main(String[] args) throws Exception{
PrintWriter fout=new PrintWriter("data.txt");
fout.println(123456);
fout.println(66.6);
fout.println("hello");
fout.close();
}
}
