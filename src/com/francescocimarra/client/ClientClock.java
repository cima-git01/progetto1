package com.francescocimarra.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientClock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socket connessione;
		//parametri di connessione
		
		String server = "localhost"; 
		//127.0.0.1 (ip)
		
		int porta = 3333;
		//stream per gestire il flusso input
		
		InputStream in;
		InputStreamReader input;
		BufferedReader sIN;
		try 
		{
			connessione = new Socket(server, porta);
			System.out.println("Connessione aperta con successo!");
			in = connessione.getInputStream();
			input = new InputStreamReader(in);
			sIN = new BufferedReader(input);
			// riceve i dati dal server
			String clock = sIN.readLine();
			//legge il BufferReader e la salva nella variabile clock
			System.out.println("Data e ora del server: " + clock);
			sIN.close();
			connessione.close();
			System.out.println("Connessione chiusa");
		} catch (IOException e) 
		{
			// TODO Auto-generated catch block
			System.err.println(e);
		}
	}

}