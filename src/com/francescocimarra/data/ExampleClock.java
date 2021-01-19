package com.francescocimarra.data;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExampleClock {

	public static void main(String[] args) {
		Date date = new Date();  
		System.out.println(date + " prima stampa");
	    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	    String strDate= formatter.format(date);  
	    System.out.println(strDate + " seconda stampa"); 
	}

}



//import java.text.SimpleDateFormat;  
//import java.util.Date;  
//public class SimpleDateFormatExample {  
//public static void main(String[] args) {  
     