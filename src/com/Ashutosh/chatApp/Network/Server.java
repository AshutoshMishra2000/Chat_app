package com.Ashutosh.chatApp.Network;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

import com.Ashutosh.chatApp.utils.configReader;

public class Server {
ServerSocket serverSocket;

public Server() throws IOException {
	int port=Integer.parseInt(configReader.getValue("PORTNO"));
	serverSocket=new ServerSocket(port);
	
	System.out.println("Server started and waiting for the client!");
	Socket socket=serverSocket.accept();//this is basically the hand shaking
	System.out.println("Client joins in!");
	InputStream in=socket.getInputStream();
	byte[] arr=in.readAllBytes();
	String str=new String(arr);
	System.out.println("the Message received is :"+str);
	socket.close();
}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Server server=new Server();

	}

}
