// Nama = Arya Ajisadda Haryanto
// NIM = 24060122140118

class Titik{
	double absis, ordinat;
	static double counterTitik;

  //Konstruktor
	Titik()
	{
		absis = 0;
		ordinat = 0;
		counterTitik++;
	}

	Titik(double abs, double ord)
	{
		absis = abs;
		ordinat = ord;
		counterTitik++;
	}
	void setAbsis(double abs)
	{
		absis = abs;
	}
	double getAbsis()
	{
		return absis;
	}
	
	void setOrdinat(double ord)
	{
		ordinat = ord;
	}
	double getOrdinat()
	{
		return ordinat;
	}
	
	double getCounterTitik()
	{
		return counterTitik;
	}
}