class Titik{
	double absis;
	double ordinat;
	static int counterTitik;
	
	Titik(){
		absis = 0;
		ordinat = 0;
		counterTitik++;
	}
	
	double getAbsis() {
		return absis;
	}
	double getOrdinat(){
		return ordinat;
	}
	int getCounterTitik(){
		return counterTitik;
	}
	void setAbsis(double a){
		absis = a;
	}
	void setOrdinat(double o){
		ordinat = o;
	}
}
