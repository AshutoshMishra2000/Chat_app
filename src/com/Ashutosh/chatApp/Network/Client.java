package com.Ashutosh.chatApp.Network;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import com.Ashutosh.chatApp.utils.configReader;

public class Client {
Socket socket;
public Client() throws UnknownHostException, IOException {
	int port=Integer.parseInt(configReader.getValue("PORTNO"));
	socket=new Socket(configReader.getValue("IP_ADDRESS"),port);
	System.out.println("Client joins the chat!");
	System.out.println("Enter the message you want to send to the server");
	Scanner sc=new Scanner(System.in);
	String message =sc.nextLine();
	OutputStream out=socket.getOutputStream();
	out.write(message.getBytes());
	System.out.println("Message send to the server");
	sc.close();
	socket.close();
}
	public static void main(String[] args) throws UnknownHostException, IOException {
		Client cl=new Client();
	}

}
