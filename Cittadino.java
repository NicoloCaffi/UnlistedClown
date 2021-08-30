import DataManager.*;
import Controlli.*;
import java.util.Scanner;
import FileManager.*;
import java.io.File;


public class Cittadino {
	
	 FileManager f1 = new FileManager("Vaccinati_" + nome_centro.replaceAll("\\s", ""));
	 
	 DataManager fos1 = new DataManager(f1);
	 
	 FileManager fos2=new FileManager("CentriVaccinali");
		
		DataManager f4=new DataManager(fos2);
	
	

	public static void main(String[] args) {
		
	
		//registraCittadino();
		//inserisciEventiAvversi();
		calcolaMedia();
		

	}
	
	public static void registraCittadino() {
		
		
		Scanner input = new Scanner(System.in);
		
		
		
		System.out.println("Inserisci un nome");
		String nome1= input.nextLine();
		
		System.out.println("Inserisci un cognome");
		String cognome1= input.nextLine();
		
		System.out.println("Inserisci il codice fiscale");
		String codFiscale1= input.nextLine();
		
		System.out.println("Inserisci una mail");
		String mail1= input.nextLine();

		System.out.println("Inserisci un username");
		String username1= input.nextLine();

		System.out.println("Inserisci una password");
		String password1= input.nextLine();
		
		f.write("Nome: " + nome1);
		f.write("Cognome: " + cognome1);
		f.write("Codice fiscale: " + codFiscale1);
		f.write("Mail: " + mail1);
		f.write("Username: " + username1);
		f.write("Password: " + password1);
			
		}
	
	
	public static void inserisciEventiAvversi(String nome_centro) {
		
		
		
		
		 FileManager f1 = new FileManager("Vaccinati_" + nome_centro.replaceAll("\\s", ""));
		 
		 DataManager fos1 = new DataManager(f1);
	
		int a=Login.login();
		
		if (a== true)
		{
			
		
			
		Scanner input = new Scanner(System.in);
				
			System.out.println("Inserire 1 per mal di testa,");
			System.out.println("Inserire 2 per febbre,");
			System.out.println("Inserire 3 per dolori muscolari e articolari,");
			System.out.println("Inserire 4 per linfoadenopatia,");
			System.out.println("Inserire 5 per tachicardia,");
			System.out.println("Inserire 6 per crisi ipertensiva,");
			System.out.println("Inserire 7 per altro.");
        
        
				int evento= input.nextInt();
        
				while(evento<1 || evento>7)
				{
					System.out.println("Digitare un valore valido");
					evento=input.nextInt();
				}
				
				String eventoAvverso, severita, descrizione;
				
				String[] v1= new String[19];
				v1=f1.read(a);
				switch (evento) {

	            case 1: System.out.println("Inserisci il livello di severità da 1 a 5");
	                        severita=input.nextLine();
	                        
	                        while(Integer.parseInt(severita)<1 || Integer.parseInt(severita)>5)
	    					{
	    						System.out.println("Digitare un valore valido");
	    						severita=input.nextLine();
	    					}
	                        
	                        System.out.println("inserisci una descrizione");
	    					descrizione=input.nextLine();
	    					v1[5]=severita;
	    					v1[6]=descrizione;
	    					break;

	            case 2: System.out.println("Inserisci il livello di severità da 1 a 5");
	                        severita=input.nextLine();
	                        
	                        while(Integer.parseInt(severita)<1 || Integer.parseInt(severita)>5)
	    					{
	    						System.out.println("Digitare un valore valido");
	    						severita=input.nextLine();
	    					}
	    					descrizione=input.nextLine();
	    					v1[7]=severita;
	    					v1[8]=descrizione;

	     					break;

	            case 3: System.out.println("Inserisci il livello di severità da 1 a 5");
	                        severita=input.nextLine();
	                        
	                        while(Integer.parseInt(severita)<1 || Integer.parseInt(severita)>5)
	    					{
	    						System.out.println("Digitare un valore valido");
	    						severita=input.nextLine();
	    					}
	                        
	                        System.out.println("inserisci una descrizione");
	    					descrizione=input.nextLine();
	    					v1[9]=severita;
	    					v1[10]=descrizione;
	                        break;

	            case 4: System.out.println("Inserisci il livello di severità da 1 a 5");
	                        severita=input.nextLine();
	                        
	                        while(Integer.parseInt(severita)<1 || Integer.parseInt(severita)>5)
	    					{
	    						System.out.println("Digitare un valore valido");
	    						severita=input.nextLine();
	    					}
	                        
	                        System.out.println("inserisci una descrizione");
	    					descrizione=input.nextLine();
	    					v1[11]=severita;
	    					v1[12]=descrizione;
	                        break;

	            case 5: System.out.println("Inserisci il livello di severità da 1 a 5");
	                        severita=input.nextLine();
	                        
	                        while(Integer.parseInt(severita)<1 || Integer.parseInt(severita)>5)
	    					{
	    						System.out.println("Digitare un valore valido");
	    						severita=input.nextLine();
	    					}
	                        
	                        System.out.println("inserisci una descrizione");
	    					descrizione=input.nextLine();
	    					v1[13]=severita;
	    					v1[14]=descrizione;
	                        break;

	            case 6: System.out.println("Inserisci il livello di severità da 1 a 5");
	                        severita=input.nextLine();
	                        
	                   
	                        
	                        while(Integer.parseInt(severita)<1 || Integer.parseInt(severita)>5)
	    					{
	    						System.out.println("Digitare un valore valido");
	    						severita=input.nextLine();
	    					}
	                        
	                        System.out.println("inserisci una descrizione");
	    				    descrizione=input.nextLine();
	    				    v1[15]=severita;
	    					v1[16]=descrizione;
	                        break;

	            case 7: System.out.println("Inserisci l'evento avverso");
	            			String eventoAvverso=input.nextLine();
	            			System.out.println("Inserisci il livello di severità da 1 a 5");
	                        severita=input.nextLine();
	                        
	                        while(Integer.parseInt(severita)<1 || Integer.parseInt(severita)>5)
	    					{
	    						System.out.println("Digitare un valore valido");
	    						severita=input.nextLine();
	    					}
	                        
	                        System.out.println("inserisci una descrizione");
	    					descrizione=input.nextLine();
	    					v1[17]=severita;
	    					v1[18]=descrizione;
	                        break;


	        }
				
				fos1.writeInLine(v1,a,false);
				}
		else {
			a=Login.login();
		}
        
		
	}
	
	public static void calcolaMedia(int numColonna, int numeroCentro)  {
		
		FileManager fos2=new FileManager("CentriVaccinali");
		
		DataManager f4=new DataManager(fos2);
	
		
	
		
		Scanner input = new Scanner(System.in);
		
		String[] v1=fos1.column(numColonna);
		int cont=0;
		int cont2=0;
		
		for(int i=0; i<v1.length; i++)
		{
			if(!v1[i].equals(""))
			{
				cont++;
				cont2+=Integer.parseInt(v1[i]);
			}
		}
		cont2=cont2/cont;
		
		String[] v3=new String[14];
		
		v3=f4.read(numeroCentro);
		
		switch(numColonna)
		{
		case 5: v3[6]=cont2; break;
		
		case 7: v3[7]=cont2; break;
		
		case 9: v3[8]=cont2; break;
		
		case 11: v3[9]=cont2; break;
		
		case 13: v3[10]=cont2; break;
		
		case 15: v3[11]=cont2; break;
		
		case 17: v3[12]=cont2; break;
		
		}
		
		
		f4.writeInLine(v3, numeroCentro, false);
		
		
		
		
	}
		
		
		
		
		
		
		
		

		
		
	}


