package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
		//creazione stringa lista nomi
		String[] listaInvitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli",
				"J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", 
				"Martina Maccherone", "Rachel Zeilic"};
		
		Scanner scan = new Scanner(System.in);
		boolean flag = false;
		int i =0;
		//sezione richiesta nome
		 String inserireNome;
		   
		 
		 
			 System.out.print("come ti chiami? vediamo se sei nella lista: ");
		      inserireNome = scan.nextLine();
		 
		      
		 while(i < listaInvitati.length) {
			  if(inserireNome.equalsIgnoreCase(listaInvitati[i])) {
				   		  flag = true;
				    		  
			  } 
			  i++;
		 }
	    		if (flag == true) {
			  	      System.out.print("sei invitato ");

			      }
			      else {
			   	  System.out.print("NON sei invitato ");
			     }  
		    	  			
		      
		    
		//sezione ciclo per ricerca nome
		  //    boolean trovato = false;
		  //    for(int i = 0; i < listaInvitati.length; i++ ) {
		  //	  if(inserireNome.equalsIgnoreCase(listaInvitati[i])) {
		  //  		  trovato = true;
		    		  
		  //  	  }
		  //    }
		  //    if (trovato == true) {
		  //	      System.out.print("sei invitato ");

		  //    }
		  //    else {
		  //  	  System.out.print("NON sei invitato ");
		  //   }
	    		scan.close();
		}

	}



