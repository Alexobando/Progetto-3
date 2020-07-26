package docenti;

import java.io.*;
class main
{
public static void main(String argc[])
{
	InputStreamReader input = new InputStreamReader(System.in);
	BufferedReader tastiera = new BufferedReader(input);
	//variabili
	String Cognome="default";
	int codice=0;
	int eta=0;
	int numero_docenti=0;;
	int eta_minima=0;
	int i;
	//Creazione delle istanze della classe docente e universita
	Docente docente [] = new Docente [10];
   // universita Universita = new universita(numero_docenti);
    try
	    {
			System.out.println("inserisci il numero di docenti");
			String numeroLetto =tastiera.readLine();
			numero_docenti = Integer.valueOf(numeroLetto).intValue();
		}
		catch(Exception e)
		{
			System.out.println("Numero non corretto!");
	    }
     for(i=0;i<numero_docenti;i++)
     {
         try
            {
		      System.out.println("inserisci l' eta del docente "+ i);
		      String numeroLetto =tastiera.readLine();
		      eta = Integer.valueOf(numeroLetto).intValue();
	         }
	     catch(Exception e)
	         {
		      System.out.println("Numero non corretto!");
	         }
	      try
	         {
			System.out.println("inserisci il codice del docente "+ i);
			String numeroLetto =tastiera.readLine();
			codice = Integer.valueOf(numeroLetto).intValue();
		    }
		    catch(Exception e)
		    {
			System.out.println("Numero non corretto!");
	        }
	      try
	        {
			System.out.println("inserisci il cognome  del docente "+ i);
			 Cognome =tastiera.readLine();

		    }
		    catch(Exception e)
		    {
			System.out.println("Numero non corretto!");
	        }
            docente[i]= new Docente(Cognome,codice,eta);
            //eta_minima = Universita.Eta_minima();
            String  nome;
            String cognome1=docente[i].getCognome(nome);
            int codice1=docente[i].getCodice(codice);
            int eta1= docente[i].getEta(eta);
            System.out.println("Numero non corretto! "+ codice1);
            System.out.println("Numero non corretto! " + cognome1);
            System.out.println("Numero non corretto! "+ eta1);

    }

   }



}
