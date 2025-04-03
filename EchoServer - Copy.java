import java.io.*;
import java.net.*;
public class EchoServer{
public static void main(String[] args) throws Exception{
try{
ServerSocket s =new ServerSocket(8159);
Socket i=s.accept();
BufferedReader bf = new BufferedReader(new InputStreamReader(i.getInputStream()));
PrintWriter out =new PrintWriter(i.getOutputStream(),true);
out.println("Hello from Server");
boolean d=true;
while(d){
	System.out.println("hiiii11");
	String l= bf.readLine();
	if(l==null){
		System.out.println("hiiii");
		out.print("Echo"+l);
		d=false;
	}
	else{
		out.print("Echo"+l);
		if(l.equals("Bye")){
			d=false;
		}
	}
}
		i.close();

}catch (IOException e) {
	System.out.println(e.getMessage());
    e.printStackTrace();
}}
}