package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
		//creazione stringa lista nomi
		String[] listaInvitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli",
				"J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", 
				"Martina Maccherone", "Rachel Zeilic"};
		
		Scanner scan = new Scanner(System.in);
		
		//sezione richiesta nome
		 String inserireNome;
		   
		      System.out.print("come ti chiami? vediamo se sei nella lista: ");
		      inserireNome = scan.next();
		    
		      System.out.println(inserireNome);
		}

	}


