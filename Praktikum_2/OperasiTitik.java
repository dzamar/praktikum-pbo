/*
Nama : Dzamar Maulana
NIM	 : 24060119120033
PBO Lab B 
*/
class OperasiTitik {
	public void refleksiSumbuX(Titik titik) {
		double ordinat = titik.getOrdinat();
		ordinat = ordinat *-1;
		titik.setOrdinat(ordinat);
	}
	
	public void refleksiSumbuY(Titik titik){
		double absis = titik.getAbsis();
		absis = absis *-1;
		titik.setAbsis(absis);
	}
}