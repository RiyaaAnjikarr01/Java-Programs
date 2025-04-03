import java. io.*;
import java.net.*;
public class EchoClient{
	public static void main(String[] args) throws Exception{
try{
Socket s = new Socket("localhost",8159);
BufferedReader st = new BufferedReader(new InputStreamReader(System.in));

BufferedReader a = new BufferedReader(new InputStreamReader(s.getInputStream()));

PrintWriter out =new PrintWriter(s.getOutputStream(),true);

System.out.println(a.readLine());

while(true){
String line =st.readLine();
out.println(line);
System.out. print(a.readLine());
}
}
catch(Exception e){
  e.printStackTrace();
}

}
}