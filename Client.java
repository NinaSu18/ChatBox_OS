package ChatBox;

import java.io.*;
import java.net.*;




public class Client {
	
public static void main(String[] args) {
		
		try {
			
			Socket s = new Socket("127.0.0.1",53792); //Server ip and port
			
			DataInputStream din = new DataInputStream(s.getInputStream());
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String msgin="", msgout="";
			
			while(!msgin.equals("end")) {
				msgout = br.readLine();
				dout.writeUTF(msgout); // Catching the Client inputs and print
				msgin = din.readUTF();
;				System.out.println(msgin); //printing server

			}
			s.close();
		}catch(Exception e) {
			//handle exception 
			
			
		}
		
		
	}
	
	

}
