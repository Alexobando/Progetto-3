package docenti;

class universita
{

	//attributi
	private int eta_minima=0;
	private int i;
	//costrutttore
	public universita(int numero_docenti)
	{
	}
	//metodi
	//metodo calcolo eta minima tra i docenti
	public int  Eta_minima( int numero_docenti)
	{
		eta_minima=Docente[0].getEta;
		for(i=1;i<numero_docenti;i++)
		{
			if(eta_minima > Docente[i].getEta)
		      eta_minima=Docente[i].getEta;

		 }
		 return eta_minima;
      }
}