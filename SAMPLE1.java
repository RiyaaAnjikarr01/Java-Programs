import java.net.*;
class SAMPLE1{
public static void main(String[] args) throws Exception{
	InetAddress add = InetAddress.getByName("www.google.com");
	System.out.println(add);
}
}