package com.francescocimarra.server;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
//import java.sql.Date;

public class ServerClock {
	public static void main(String[] args) throws IOException {
		ServerSocket sSocket;
		Socket connessione;
		int porta = 3333;

		// stream per gestire il flusso in output
		OutputStream out;
		PrintWriter sOUT;

		try {
			sSocket = new ServerSocket(porta);

			while (true) {
				System.out.println("In attesa di connessioni...");
				connessione = sSocket.accept();
				System.out.println("Connessione stabilita.");
				out = connessione.getOutputStream();
				sOUT = new PrintWriter(out);
				// invia l'informazione al client
				Date oggi = new Date();
				String info = oggi.toString();
				String commento = " creato da francesco."; 
				
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
				
				SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
				String strDate= formatter.format(oggi);  
			    System.out.println(strDate + " terza stampa"); 
				   
			    sOUT.println(strDate + commento);
				sOUT.close();
				System.out.println("Connessione chiusa.");

			}
		} catch (IOException e) {
			System.err.println(e);
		}

	}
}
